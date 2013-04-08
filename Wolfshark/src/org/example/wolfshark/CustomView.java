package org.example.wolfshark;

import java.util.ArrayList;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;

public class CustomView extends View {
	
	BitmapFactory.Options options = new BitmapFactory.Options();
	
	Paint imgPaint;
	Bitmap mapGraphic_1;
	Bitmap mapGraphic_2;
	Bitmap mapGraphic_3;
	Bitmap mapGraphic_4;
	Path thePath;
	Paint pathPaint;
	
	public static final String PREFERENCE_FILENAME = "LocatePrefs";
	SharedPreferences myPrefs;

	int mapX = 0;
	int mapY = 0;
	
	int testx = 0;
	int testy = 0;
	
	public int offsetX = 0;
	public int offsetY = 0;

	int startX;
	int startY;
	
	final int locate_x = 840;
	final int locate_y = 860;
	
	int coord_x = 0;
	int coord_y = 0;
	
	DisplayMetrics metrics;
	
	boolean moved = false;
	
	int map1width;
	int map1height;
	
	Paint dotPaint;
	Paint textPaint;
	
	NodeGraph network;
	CampusNodeConfig config;
	NodeConfig oldConfig;
	
	String startLocation;
	String endLocation;
	
	boolean endLocationFound = false;
	
	ArrayList<Integer> vistiedList = new ArrayList<Integer>();
	ArrayList<Integer> explored = new ArrayList<Integer>();
	ArrayList<Node> exploredNodes = new ArrayList<Node>();
	
	public CustomView(Context myContext)
	{
		super(myContext);
		this.setBackgroundColor(Color.WHITE);
		
		myPrefs = myContext.getSharedPreferences(PREFERENCE_FILENAME,0);
		startLocation=myPrefs.getString("startBuild", "Darwin_022");
		endLocation=myPrefs.getString("endBuild", "Darwin_006");

		
		network = new NodeGraph();
		config = new CampusNodeConfig();
		oldConfig = new NodeConfig();
		network = config.populate(myContext);
		
		Log.d("GOT","HERE");
		
		
		//options.inSampleSize = 2;
		options.inDensity =  getResources().getDisplayMetrics().densityDpi; // sets bitmap density to display density, stopping lag and reducing memory footprint
		
		dotPaint  = new Paint(Paint.ANTI_ALIAS_FLAG);
		dotPaint.setColor(Color.BLACK);
		dotPaint.setStyle(Paint.Style.FILL);
		
		textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		textPaint.setColor(Color.RED);
		textPaint.setTextSize(10);
		
		Log.d("GOT","HERE2");
		
		mapGraphic_1 = BitmapFactory.decodeResource(getResources(), R.drawable.campus_map_nw, options);
		mapGraphic_2 = BitmapFactory.decodeResource(getResources(), R.drawable.campus_map_ne, options);
		mapGraphic_3 = BitmapFactory.decodeResource(getResources(), R.drawable.campus_map_sw, options);
		mapGraphic_4 = BitmapFactory.decodeResource(getResources(), R.drawable.campus_map_se, options);
		
		map1width = mapGraphic_1.getWidth();
		map1height = mapGraphic_1.getHeight();
		
		metrics = getResources().getDisplayMetrics();
		
		imgPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		thePath = new Path();
		
		
		Log.d("GOT","HERE3");
//		pathPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
//		pathPaint.setColor(Color.BLACK);
//		pathPaint.setStrokeWidth(3);
//		pathPaint.setStyle(Paint.Style.STROKE);
		
		
		pathPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		pathPaint.setColor(Color.BLUE);
		pathPaint.setStrokeWidth(3);
		pathPaint.setStyle(Paint.Style.STROKE);
		
		coord_x = (mapGraphic_1.getWidth() - 1200) * (400 / mapGraphic_1.getDensity());
		coord_y = (mapGraphic_1.getHeight() - 1200) * (400 / mapGraphic_1.getDensity());
		
		//startLocation = "darwin_" + startLocation;
		//endLocation = "darwin_" + endLocation;
		
		Log.d("DEBUG","StartLocation: " + startLocation);
		Log.d("DEBUG","EndLocation: " + endLocation);
		
		for(int i=0;i < network.NodeList.size();i++)
		{
			Log.d("DEBUG","Start Search: " + network.NodeList.get(i).Name);
			
			if(network.NodeList.get(i).Name.contains(startLocation))
			{
				//depthFirstSearch(network.NodeList.get(i));
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
		
		Log.d("DEBUG","Size of exploredList:" + exploredNodes.size());
		
		Log.d("DEBUG","Size of visitedList:" + vistiedList.size());
	}
	
	
	@Override
	protected void onDraw(Canvas canvas)
	{
		long startTime = System.nanoTime();
		
		

		
		canvas.drawBitmap(mapGraphic_1, mapX + offsetX , mapY + offsetY, imgPaint);
		canvas.drawBitmap(mapGraphic_2, mapX + offsetX + map1width + 1, mapY + offsetY, imgPaint);
		canvas.drawBitmap(mapGraphic_3, mapX + offsetX, mapY + offsetY + mapGraphic_1.getHeight(), imgPaint);
		canvas.drawBitmap(mapGraphic_4, mapX + offsetX + mapGraphic_1.getWidth(), mapY + offsetY + mapGraphic_2.getHeight(), imgPaint);
		
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
		
		
//		thePath.moveTo(250+offsetX+mapX, 250+offsetY+mapY);
//		thePath.lineTo(200+offsetX+mapX, 200+offsetY+mapY);
//		thePath.lineTo(600+offsetX+mapX, 200+offsetY+mapY);
//		thePath.lineTo(300+offsetX+mapX, 1200+offsetY+mapY);
		
		//thePath.addCircle(locate_x + mapX + offsetX + coord_x, locate_y + mapY + offsetY + coord_y, 25, Path.Direction.CW);
		//canvas.drawPath(thePath, pathPaint);
		
		long endTime = System.nanoTime();
		
		//Log.d("TIMING","draw execution time: "+ (endTime - startTime));
	
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
				if(inputNode.neighboringNodes.get(i) == network.NodeList.get(j).Name)
				{				
                    if (exploredNodes.contains(network.NodeList.get(j)))
                    {
                    	continue;
                    }
					depthFirstSearch(network.NodeList.get(j));
				}
			}
		}
		
	}
	
	private void depthFirstSearchComplete(Node inputNode)
	{
		Log.d("DEBUG", "search called on node:" + inputNode.Name);

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
					depthFirstSearchComplete(network.NodeList.get(j));
				}

			}
		}
	}



}
