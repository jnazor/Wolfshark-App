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
	
	//String startLocation;
	//String endLocation;
	
	boolean endLocationFound = false;
	
	ArrayList<Integer> vistiedList = new ArrayList<Integer>();
	ArrayList<Integer> explored = new ArrayList<Integer>();
	ArrayList<Node> exploredNodes = new ArrayList<Node>();
	
	ArrayList<String> startentrances = new ArrayList<String>();
	ArrayList<String> endentrances = new ArrayList<String>();
	
	String start_build;
	String end_build;
	String start_room;
	String end_room;
	int start_pos;
	int end_pos;
	
	public CustomView(Context myContext)
	{
		super(myContext);
		this.setBackgroundColor(Color.WHITE);
		
		myPrefs = myContext.getSharedPreferences(PREFERENCE_FILENAME,0);
		//startLocation=myPrefs.getString("startBuild", "Darwin_022");
		//endLocation=myPrefs.getString("endBuild", "Darwin_006");		
		
		start_build = "";
		end_build = "";
		start_room = "";
		end_room = "";
		
		start_build = myPrefs.getString("startBuild", "None");
		end_build = myPrefs.getString("endBuild", "None");
		start_room = myPrefs.getString("startRoom", "None");
		end_room = myPrefs.getString("endRoom", "None");
		start_pos = myPrefs.getInt("startPos", 0);
		end_pos = myPrefs.getInt("endPos", 0);
		
		startentrances = getEntranceList(start_pos);
		endentrances = getEntranceList(end_pos);

		
		network = new NodeGraph();
		config = new CampusNodeConfig();
		oldConfig = new NodeConfig();
		//network = config.populate(myContext);
		network = config.populate();
		
		Log.d("GOT","HERE");
		
		
		//options.inSampleSize = 2;
		// sets bitmap density to display density, stopping lag and reducing memory footprint
		options.inDensity =  getResources().getDisplayMetrics().densityDpi; 
		
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
		
		//Log.d("DEBUG","StartLocation: " + startLocation);
		//Log.d("DEBUG","EndLocation: " + endLocation);
		
		for(int i=0;i < network.NodeList.size();i++)
		{
			//Log.d("DEBUG","Start Search: " + network.NodeList.get(i).Name);
			
			//if(network.NodeList.get(i).Name.contains(startLocation))
			if(network.NodeList.get(i).contains(startentrances))
			{
				//depthFirstSearch(network.NodeList.get(i));
				depthFirstSearchComplete(network.NodeList.get(i));
				break;
			}
		}
		

		
		// given the algorithm, a stubNode is a node that only has one neighbor
		// this stubNodesExistDeleteThem method returns true upon finding a stub node, 
		// false upon looping through all the nodes and not finding a stub node.
		// this while loop will remove all stub nodes from the exploredNodes list
		while(stubNodesExistDeleteThem() == true) {} //looping over method call, returns true if method is successful

		
		//still need to check this out...
		//I believe we can adjust the code in onDraw() such that we don't need this loop or vistied. ~ Jolie
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
		
		
		Log.d("EXPLORED NODES: ", " ");
		
		for(int i = 0; i < exploredNodes.size(); i++)
		{
			Log.d("NODE NAME/#:  ", exploredNodes.get(i).Name + "  " + i);
		}
		
		Log.d("DEBUG","Size of exploredList:" + exploredNodes.size());
		
		Log.d("DEBUG","Size of visitedList:" + vistiedList.size());
		
		Log.d("START NODE: ", startentrances.get(0));
		Log.d("END NODE: ", endentrances.get(0));
		Log.d("START POS: ", start_pos + " ");
		Log.d("END POS: ", end_pos + " ");
		Log.d("SIZE OF VISITED:  ", vistiedList.size() + " ");
	}
	
	
	@Override
	protected void onDraw(Canvas canvas)
	{
		//long startTime = System.nanoTime();
		
		

		
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
//			canvas.drawText(network.NodeList.get(i).Name + " " + i, network.NodeList.get(i).mapAnchorX+offsetX+mapX+7, 
//					network.NodeList.get(i).mapAnchorY+offsetY+mapY+7, textPaint);
		}
		canvas.drawPath(thePath, pathPaint);
		
		
//		thePath.moveTo(250+offsetX+mapX, 250+offsetY+mapY);
//		thePath.lineTo(200+offsetX+mapX, 200+offsetY+mapY);
//		thePath.lineTo(600+offsetX+mapX, 200+offsetY+mapY);
//		thePath.lineTo(300+offsetX+mapX, 1200+offsetY+mapY);
		
		//thePath.addCircle(locate_x + mapX + offsetX + coord_x, locate_y + mapY + offsetY + coord_y, 25, Path.Direction.CW);
		//canvas.drawPath(thePath, pathPaint);
		
		//long endTime = System.nanoTime();
		
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
		//boolean removedNodes = false;
		
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
			//if(connectedNodes == 1 && exploredNodes.get(i).Name.contains(startLocation) == false &&	exploredNodes.get(i).Name.contains(endLocation) == false)
			if(connectedNodes == 1 && exploredNodes.get(i).contains(startentrances) == false &&	exploredNodes.get(i).contains(endentrances) == false)
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
		//if(inputNode.Name.contains(endLocation))
		if(inputNode.contains(endentrances))
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
		//Log.d("DEBUG", "search called on node:" + inputNode.Name);

		//if(inputNode.Name.contains(endLocation))
		if(inputNode.contains(endentrances))
		{
			endLocationFound = true;
		}
		if(exploredNodes.contains(inputNode) == false)
		{
			exploredNodes.add(inputNode);
		}
		else if(exploredNodes.contains(inputNode) == true)  //Can these two expressions be consolidated using an ||??
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
				//if(inputNode.neighboringNodes.get(i) == network.NodeList.get(j).Name) 
				if(inputNode.neighboringNodes.get(i).equals(network.NodeList.get(j).Name) && !exploredNodes.get(exploredNodes.size()-1).contains(endentrances))
				{
					depthFirstSearchComplete(network.NodeList.get(j));
				}

			}
		}
	}
	
	
	
	
	ArrayList<String> getEntranceList(int pos)
	{
		ArrayList<String> entrances = new ArrayList<String>();
		
		switch(pos)
		{
			case 0:  entrances.add("not available");  break;
			case 1:  entrances.add("art_1");
					 entrances.add("art_2");
					 break;
			case 2:  entrances.add("not available");  break;
			case 3:  entrances.add("not available");  break;
			case 4:  entrances.add("not available");  break;
			case 5:  entrances.add("cab_1");  
					 entrances.add("cab_2");
					 break;
			case 6:  entrances.add("carson_1");  
			         entrances.add("carson_2");
			         entrances.add("carson_3");
			         break;
			case 7:  entrances.add("childrens_school_1");  
					 break;
			case 8:  entrances.add("commons_1");
			         entrances.add("commons_2");
			         break;
			case 9:  entrances.add("not available");  break;
			case 10:  entrances.add("not available");  break;
			case 11:  entrances.add("environment");  
			          break;
			case 12:  entrances.add("not available");  break;
			case 13:  entrances.add("not available");  break;
			case 14:  entrances.add("not available");  break;
			case 15:  entrances.add("not available");  break;
			case 16:  entrances.add("not available");  break;
			case 17:  entrances.add("not available");  break;
			case 18:  entrances.add("not available");  break;
			case 19:  entrances.add("not available");  break;
			case 20:  entrances.add("not available");  break;
			case 21:  entrances.add("nichols_1");
					  break;
			case 22:  entrances.add("not available");  break;
			case 23:  entrances.add("path_57");
					  entrances.add("path_56");
					  entrances.add("path_91");
					  entrances.add("path_92");
					  entrances.add("path_93");
					  break;
			case 24:  entrances.add("not available");  break;
			case 25:  entrances.add("not available");  break;
			case 26:  entrances.add("not available");  break;
			case 27:  entrances.add("not available");  break;
			case 28:  entrances.add("not available");  break;
			case 29:  entrances.add("not available");  break;
			case 30:  entrances.add("not available");  break;
			case 31:  entrances.add("not available");  break;
			case 32:  entrances.add("not available");  break;
			case 33:  entrances.add("not available");  break;
			case 34:  entrances.add("not available");  break;
			case 35:  entrances.add("not available");  break;
			case 36:  entrances.add("not available");  break;
			case 37:  entrances.add("not available");  break;
			case 38:  entrances.add("not available");  break;
			case 39:  entrances.add("stevenson_1");  
					  break;
			case 40:  entrances.add("health_1");
					  entrances.add("health_2");
					  break;
			case 41:  entrances.add("su_1");
					  entrances.add("pub_1");
					  break;
			case 42:  entrances.add("not available");  break;
			case 43:  entrances.add("not available");  break;
			case 44:  entrances.add("not available");  break;
			case 45:  entrances.add("zin_1");
					  entrances.add("zin_2");
					  entrances.add("zin_3");
					  entrances.add("zin_4");
					  entrances.add("zin_5");
					  entrances.add("zin_6");
					  entrances.add("zin_7");
			          break;
			//case 46:  entrances.add("not available");  break;
			default:  entrances.add("not available");  break;
		}
		
		return entrances;
	}



}
