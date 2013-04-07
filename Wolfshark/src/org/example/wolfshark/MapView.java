package org.example.wolfshark;


import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.Log;
import android.view.View;
import android.content.SharedPreferences;





public class MapView extends View {

	public static final String PREFERENCE_FILENAME = "LocatePrefs";
	SharedPreferences myPrefs;
	Paint imgPaint;
	Bitmap mapGraphic = BitmapFactory.decodeResource(getResources(), R.drawable.darwin_basement_small);
	Path thePath;
	Paint pathPaint;
	NodeGraph network;
	NodeConfig config;
	Paint dotPaint;
	Paint textPaint;
	
	String startLocation;
	String endLocation;
	
	boolean endLocationFound = false;
	
	Random rand = new Random();
	ArrayList<Integer> vistiedList = new ArrayList<Integer>();
	ArrayList<Integer> explored = new ArrayList<Integer>();
	ArrayList<Node> exploredNodes = new ArrayList<Node>();

	int mapX = 0;
	int mapY = 0;
	int testx = 0;
	int testy = 0;
	public int offsetX = 0;
	public int offsetY = 0;

	int startX;
	int startY;
	
	boolean moved = false;
	
	public MapView(Context context)
	{
		super(context);
		this.setBackgroundColor(Color.rgb(34, 181, 115));
		myPrefs = context.getSharedPreferences(PREFERENCE_FILENAME,0);
		startLocation=myPrefs.getString("startRoom", "Darwin_022");
		endLocation=myPrefs.getString("endRoom", "Darwin_006");
		
		imgPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		thePath = new Path();
		
		pathPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		pathPaint.setColor(Color.BLUE);
		pathPaint.setStrokeWidth(3);
		pathPaint.setStyle(Paint.Style.STROKE);
		
		dotPaint  = new Paint(Paint.ANTI_ALIAS_FLAG);
		dotPaint.setColor(Color.BLACK);
		dotPaint.setStyle(Paint.Style.FILL);
		
		textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		textPaint.setColor(Color.RED);
		textPaint.setTextSize(10);
			
		network = new NodeGraph();
		config = new NodeConfig();
		network = config.populate();
		startLocation = "darwin_" + startLocation;
		endLocation = "darwin_" + endLocation;

		
		for(int i=0;i < network.NodeList.size();i++)
		{
			if(network.NodeList.get(i).Name.contains(startLocation))
			{
				depthFirstSearch(network.NodeList.get(i));
				depthFirstSearchComplete(network.NodeList.get(i));
			}
		}
		

		while(stubNodesExistDeleteThem() == true) {} //looping over method call, returns true if method is successful

		for(int i=0;i<exploredNodes.size();i++)
		{
			for(int j=0;j<network.NodeList.size();j++)
			{
				if(network.NodeList.get(j).Name == exploredNodes.get(i).Name)
				{
					vistiedList.add(j);
				}
			}
		}
	}
	
	@Override
	protected void onDraw(Canvas canvas)
	{
		canvas.drawBitmap(mapGraphic, mapX + offsetX, mapY + offsetY, imgPaint);
		thePath.reset();
		if(vistiedList.size() >= 2)
		{
			if(vistiedList.size() > 0)
			{
				thePath.moveTo(network.NodeList.get(vistiedList.get(1)).mapAnchorX+offsetX+mapX, 
					       network.NodeList.get(vistiedList.get(1)).mapAnchorY+offsetY+mapY);
			}
			for(int i=0;i<vistiedList.size();i++)
			{
				thePath.lineTo(network.NodeList.get(vistiedList.get(i)).mapAnchorX+offsetX+mapX, 
					       network.NodeList.get(vistiedList.get(i)).mapAnchorY+offsetY+mapY);
			}
			
			}
		for(int i=0;i<network.NodeList.size();i++)
		{
			canvas.drawCircle(network.NodeList.get(i).mapAnchorX+offsetX+mapX, network.NodeList.get(i).mapAnchorY+offsetY+mapY, 5, dotPaint);
			canvas.drawText(network.NodeList.get(i).Name + " " + i, network.NodeList.get(i).mapAnchorX+offsetX+mapX+7, 
					network.NodeList.get(i).mapAnchorY+offsetY+mapY+7, textPaint);
		}
		canvas.drawPath(thePath, pathPaint);
	}
	
	private void recursiveSearch(int input)
	{
		explored.add(input);
		for(int i=0; i < network.NodeList.get(input).neighboringNodes.size();i++)
		{
			for(int j=0;j<network.NodeList.size();j++)
			{
				if(network.NodeList.get(j).Name == network.NodeList.get(input).neighboringNodes.get(i))
				{
					if(explored.contains(j) == false)
					{
						recursiveSearch(j);
					}
					else
					{
						for(int l=0;l<vistiedList.size();l++)
						{
							if(j == vistiedList.get(l));
							{
								//vistiedList.remove(l);
							}
						}
					}
				}
			}
		}
	} 
	
	private void depthFirstSearch(int input)
	{
		explored.add(input);
		int numConnected = network.NodeList.get(input).neighboringNodes.size();
		for(int i=0;i<network.NodeList.get(input).neighboringNodes.size();i++)
		{
			if(explored.contains(network.NodeList.get(input).neighboringNodes.get(i)) == true)
			{
				numConnected--;
			}
		}
		for(int i=0;i<network.NodeList.get(input).neighboringNodes.size();i++)
		{
			boolean doesContain = false;
			for(int j=0;j<network.NodeList.size();j++)
			{
				if(network.NodeList.get(j).Name == network.NodeList.get(input).neighboringNodes.get(i))
				{
					if(explored.contains(i) == true)
					{
						doesContain = true;
					}
				}
			}
			

			if(doesContain == false)
			{
				for(int q=0;q<network.NodeList.size();q++)
				{
					if(network.NodeList.get(q).Name == network.NodeList.get(input).neighboringNodes.get(i))
					{
						depthFirstSearch(q);
					}
				}
			}
		}
		return;
	}
	
	private void depthFirstSearch(Node inputNode)
	{
		exploredNodes.add(inputNode);
		if(inputNode.Name.contains(endLocation))
		{
			return;
		}
		for(int i=0;i<inputNode.neighboringNodes.size();i++)
		{
			for(int j=0;j<network.NodeList.size();j++)
			{
				if(inputNode.neighboringNodes.get(i) == network.NodeList.get(j).Name){				{
                    			if (exploredNodes.contains(network.NodeList.get(j))) continue
					depthFirstSearch(network.NodeList.get(j));
				}
			}
		}
	}
	
	private void depthFirstSearchComplete(Node inputNode)
	{

		if(inputNode.Name.contains(endLocation))
		{
			endLocationFound = true;
		}
		if(exploredNodes.contains(inputNode) == false)
		{
			exploredNodes.add(inputNode);
		}
		else if(exploredNodes.contains(inputNode) == true)
		{
			return;
		}
		if(endLocationFound == true)
		{
			return;
		}
		for(int i=0;i<inputNode.neighboringNodes.size();i++)
		{
			for(int j=0;j<network.NodeList.size();j++)
			{
				if(inputNode.neighboringNodes.get(i) == network.NodeList.get(j).Name) 
   				{
					depthFirstSearch(network.NodeList.get(j));
				}

			}
		}
	}
	
	public void moveMap(int inputX, int inputY)
	{


	}
	
	public int getMapX()
	{
		return mapX;
	}
	
	public int getMapY()
	{
		return mapY;
	}
	
	private boolean containsByName(String Input)
	{
		for(int j=0; j<exploredNodes.size();j++)
		{
			if(exploredNodes.get(j).Name.contains(Input) == true)
			{
				return true;
			}
		}
		return false;
	}
	
	
	private boolean stubNodesExistDeleteThem()
	{
		int connectedNodes = 0;
		boolean removedNodes = false;
		
		for(int i=0;i<exploredNodes.size();i++)
		{
			connectedNodes = 0;
			
			for(int j=0; j<exploredNodes.get(i).neighboringNodes.size();j++)
			{
				if(containsByName(exploredNodes.get(i).neighboringNodes.get(j)) == true )
				{
					connectedNodes++;
				}
			}
			if(connectedNodes == 1 && exploredNodes.get(i).Name.contains(startLocation) == false &&	exploredNodes.get(i).Name.contains(endLocation) == false)
			{
				exploredNodes.remove(i);
				return true;
			}
			
		}
		

		return false;
		
		
	}
	
}



























