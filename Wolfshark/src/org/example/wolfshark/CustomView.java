package org.example.wolfshark;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Vector;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
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
	Path startCircle;
	Path endCircle;
	
	//int numNodesToRemove;  //ONLY USE INSIDE DEPTHFIRSTSEARCHCOMPLETE!!!
	
	private int[] xcoord_primarray;
	private int[] ycoord_primarray;
	
	private Integer[] xcoord_array;
	private Integer[] ycoord_array;
	
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
	Paint circlePaint;
	
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
		//numNodesToRemove = 0;
		
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
		
		circlePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		circlePaint.setColor(Color.BLUE);
		circlePaint.setStyle(Paint.Style.FILL);
		
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
		startCircle = new Path();
		endCircle = new Path();
		
		xcoord_primarray = getResources().getIntArray(R.array.xcoord_array);
		ycoord_primarray = getResources().getIntArray(R.array.ycoord_array);
		

		
		
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
		
		/*  Depth-First Search version:
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
		*/
		
		
		
		//Start Micah and Mark's Algorithm
		Comparator<Node> nodeComparator = new DijkstraComparator();
		PriorityQueue<Node> m = new PriorityQueue<Node>(10, nodeComparator);
		Node start = null;
		//Node end = null;   //Modified algorithm such that we don't need the end node when starting
		Node current = null;
		Vector<Node> visited = new Vector<Node>();
		Vector<Node> unvisited = new Vector<Node>(network.NodeList);
		

		for (int d = 0; d < unvisited.size() && start == null; d++)
		{
			//if(unvisited.get(d).Name.equals(start_build))
			if(unvisited.get(d).contains(startentrances) && start == null)
			{
				unvisited.get(d).DijkstraDistance = 0;
				start = unvisited.get(d);
				Log.d("DEBUG: ", "Dijk. Start Node: " + start.Name);
			}
			//We shouldn't need this area of code, but leaving it in just in case for now...
			//if(unvisited.get(d).Name.equals(end_build))
//			if(unvisited.get(d).contains(endentrances) && end == null)
//			{
//				end = unvisited.get(d); 
//				Log.d("DEBUG: ", "Dijk. End Node: " + end.Name);
//			}
		}
		
		m.add(start);
		int newDDistance = 0;  //moved declaration to here -- we should start thinking about minimizing memory usage.
		
		while(!m.isEmpty()){
			current = m.poll(); // think its akin to pop.  ->  Yes it is, and returns the object being popped.
			Node neighbor = new Node();
			Log.d("CURRENT: ", current.Name);
			
			for(int n = 0; n < current.neighboringNodes.size() && n < current.neighboringNodeDistance.size(); n++){
				neighbor = getNeighborNode_2(current.neighboringNodes.get(n), unvisited);
				
				if(unvisited.contains(neighbor)){
					newDDistance = 0;
					newDDistance = current.DijkstraDistance + current.neighboringNodeDistance.get(n);

					
					if(newDDistance < neighbor.DijkstraDistance){
						neighbor.DijkstraDistance = newDDistance;
						neighbor.DijkstraPrevious = current.Name;
					}
					m.add(neighbor);
				}
			}
		
			//Node popped = current;
			unvisited.remove(current);
			//visited.add(popped);
			visited.add(current);
			String nextNode = "";
			
			//if(current.Name.equals(end.Name))
			//Modified to search for closest entrance to destination building
			if(current.contains(endentrances))
			{
				// follow Dijksta's Previous to draw path.
				//Log.d("DEBUG: ", "Size of vector visited: " + visited.size());
				exploredNodes.add(current);
				nextNode = current.DijkstraPrevious;
				
				while(!nextNode.equals(start.Name))
				{
					for(int i = 0; i < visited.size(); i++)
					{
						if(nextNode.equals(visited.get(i).Name))
						{
							exploredNodes.add(visited.get(i));
							nextNode = visited.get(i).DijkstraPrevious;
							visited.remove(i);
							break;  //add to reduce calculations
						}
					}
				}
				
				exploredNodes.add(visited.get(0));
				m.clear();
			}
		}
		

		
		// given the algorithm, a stubNode is a node that only has one neighbor
		// this stubNodesExistDeleteThem method returns true upon finding a stub node, 
		// false upon looping through all the nodes and not finding a stub node.
		// this while loop will remove all stub nodes from the exploredNodes list
		//while(stubNodesExistDeleteThem() == true) {} //looping over method call, returns true if method is successful

		
		//still need to check this out...
		//I believe we can adjust the code in onDraw() such that we don't need this loop or vistied. ~ Jolie
		/*
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
		*/
		
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
		startCircle.reset();
		endCircle.reset();
		
		startCircle.addCircle(xcoord_primarray[start_pos] + mapX + offsetX, ycoord_primarray[start_pos] + mapY + offsetY, 15, Direction.CW);
		endCircle.addCircle(xcoord_primarray[end_pos] + mapX + offsetX, ycoord_primarray[end_pos] + mapY + offsetY, 15, Direction.CW);
		
//		if(vistiedList.size() >= 2)
//		{
//			if(vistiedList.size() > 0)
//			{
//				thePath.moveTo(network.NodeList.get(vistiedList.get(1)).mapAnchorX+offsetX+mapX, 
//					       network.NodeList.get(vistiedList.get(1)).mapAnchorY+offsetY+mapY);
//			}
//			for(int i=0;i<vistiedList.size();i++)
//			{
//				thePath.lineTo(network.NodeList.get(vistiedList.get(i)).mapAnchorX+offsetX+mapX, 
//					       network.NodeList.get(vistiedList.get(i)).mapAnchorY+offsetY+mapY);
//			}
//			
//		}
		
		
		
		if(exploredNodes.size() >= 2)
		{
			thePath.moveTo(exploredNodes.get(0).mapAnchorX+offsetX+mapX, exploredNodes.get(0).mapAnchorY+offsetY+mapY);
			
			for(int i = 1; i < exploredNodes.size(); i++)
			{
				thePath.lineTo(exploredNodes.get(i).mapAnchorX+offsetX+mapX, exploredNodes.get(i).mapAnchorY+offsetY+mapY);
			}
			//thePath.close();
		}
		
		
		
		
//		for(int i=0;i<network.NodeList.size();i++)
//		{
//			canvas.drawCircle(network.NodeList.get(i).mapAnchorX+offsetX+mapX, network.NodeList.get(i).mapAnchorY+offsetY+mapY, 5, dotPaint);
//			canvas.drawText(network.NodeList.get(i).Name + " " + i, network.NodeList.get(i).mapAnchorX+offsetX+mapX+7, 
//					network.NodeList.get(i).mapAnchorY+offsetY+mapY+7, textPaint);
//		}
		canvas.drawPath(thePath, pathPaint);
		canvas.drawPath(startCircle, circlePaint);
		canvas.drawPath(endCircle, circlePaint);
		
		
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
	
	
	
	/*
	private void depthFirstSearchComplete(Node inputNode)
	{
		//Log.d("DEBUG", "search called on node:" + inputNode.Name);

		//if(inputNode.Name.contains(endLocation))
		if(inputNode.contains(endentrances))  //If the inputNode is in the list of end location entrances
		{
			endLocationFound = true;
		}
		if(exploredNodes.contains(inputNode) == false)  //If the inputNode is not in the list of exploredNodes
		{
			exploredNodes.add(inputNode);
		}
		//If exploredNodes does contain the inputNode
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
				//If inputNode matches the name of a node in the network and if the end entrance is not in the exploredNodes Arraylist
				if(inputNode.neighboringNodes.get(i).equals(network.NodeList.get(j).Name) && !exploredNodes.get(exploredNodes.size()-1).contains(endentrances))
				{
					depthFirstSearchComplete(network.NodeList.get(j));
				}

			}
		}
	}
	*/
	
	
	//TEST VERSION!!!
	private void depthFirstSearchComplete(Node inputNode)
	{
		//Log.d("DEBUG", "search called on node:" + inputNode.Name);

		//if(inputNode.Name.contains(endLocation))
		if(inputNode.contains(endentrances))  //If the inputNode is in the list of end location entrances
		{
			endLocationFound = true;
		}
		if(exploredNodes.contains(inputNode) == false)  //If the inputNode is not in the list of exploredNodes
		{
			exploredNodes.add(inputNode);
		}
		//If exploredNodes does contain the inputNode
		else if(exploredNodes.contains(inputNode) == true)  //Can these two expressions be consolidated using an ||??
		{
			return;
		}
		if(endLocationFound == true)
		{
			return;
		}
		
		//If an ending destination is in the list of neighboring nodes
		//If checkForNeighboringEnd() is true, the ending neighbor node
		//gets added to exploredNodes, and returns out of the method.
		//Also, it ignores the first node entered into exploredNodes.
		if(exploredNodes.size() > 0 && checkForNeighboringEnd(inputNode))
		{
			return;
		}
		for(int i=0;i<inputNode.neighboringNodes.size();i++)
		{
			for(int j=0;j<network.NodeList.size();j++)
			{
				//if(inputNode.neighboringNodes.get(i) == network.NodeList.get(j).Name) 
				//If inputNode matches the name of a node in the network and if the end entrance is not in the exploredNodes Arraylist
				if(inputNode.neighboringNodes.get(i).equals(network.NodeList.get(j).Name) && !exploredNodes.get(exploredNodes.size()-1).contains(endentrances))
				{
					depthFirstSearchComplete(network.NodeList.get(j));
					//numNodesToRemove = checkNeighbors(inputNode.neighboringNodes);
				}
				/*
				else if(numNodesToRemove > 0)
				{
					exploredNodes.remove(exploredNodes.size() - 1);
					numNodesToRemove--;
					return;
				}
				*/

			}
		}
	}
	
	
	
	
	boolean checkForNeighboringEnd(Node input)
	{
		//boolean found = false;
		
		for(int i = 0; i < input.neighboringNodes.size(); i++)
		    for(int j = 0; j < endentrances.size(); j++)
			    if(input.neighboringNodes.get(i).equals(endentrances.get(j)))
			    {
			    	for(int k = 0; k < network.NodeList.size(); k++)
			    		if(input.neighboringNodes.get(i).equals(network.NodeList.get(k).Name))
			    		{
			    			exploredNodes.add(network.NodeList.get(k));
			    			return true;
			    		}
			    }
				
		
		return false;
	}
	
	
	
	//Isn't working how I would have hoped it would have worked...
	//Attempting to find a neighbor of inputNode from depthFirstSearchComplete()
	//earlier in the exploredNodes list and delete nodes in the list to the index
	//of the already inserted neighbor, to then insert the current inputNode, thereby
	//redirecting the graph and eliminating unneeded side trips...
	int checkNeighbors(ArrayList<String> neighbors)
	{
		boolean found = false;
		int index = 0;
		
		for(int i = 0; i < neighbors.size() && !found; i++)
		{
			for(int j = 0; j < exploredNodes.size() && !found; j++)
			{
				if(neighbors.get(i).equals(exploredNodes.get(j).Name) && j != exploredNodes.size() - 1)
				{
						index = exploredNodes.size() - j;
						found = true;
				}
			}
		}
		
		return index;
	}
	
	
	
	
	private Node getNeighborNode(String string, Vector<Node> unvisited) {
		Node neighbor = null;
		for (int d = 0; d < unvisited.size(); d++){
			//if(unvisited.get(d).Name.equals(start_build)){
			if(unvisited.get(d).contains(startentrances)){
				neighbor = unvisited.get(d);
			}
		}	
		return neighbor;
		// TODO Auto-generated method stub
	}
	
	
	
	private Node getNeighborNode_2(String name, Vector<Node> unvisited)
	{
		Node localNode = null;
		
		for(int d = 0; d < unvisited.size(); d++)
		{
			if(unvisited.get(d).Name.equals(name))
				localNode = unvisited.get(d);
		}
		
		return localNode;
	}
	
	
	
	
	ArrayList<String> getEntranceList(int pos)
	{
		ArrayList<String> entrances = new ArrayList<String>();
		
		switch(pos)
		{
			case 0:  entrances.add("path_328"); //Alumni Ampitheater
					 entrances.add("path_341");
					 break;
			case 1:  entrances.add("path_221"); //Alumni Grove
					 break;
			case 2:  entrances.add("ameci_1");  //Ameci's
					 break;
			case 3:  entrances.add("facilities_1");  //Anthropology
			         break;
			case 4:  entrances.add("arbor_1"); // Arbor
					 break;
			case 5:  
			case 6:  entrances.add("art_1");  //Art Buildings and Gallery
					 entrances.add("art_2");
					 break;
			case 7:  entrances.add("art_2");  //Art Building Lake
			case 8:  entrances.add("path_197"); //Athletic Field
					 break;
			case 9:  entrances.add("path_244");  //Bacon Statue
					 entrances.add("path_254");
			         break;
			case 10:  entrances.add("path_184");  //Baseball Diamond
			          break;
			case 11: entrances.add("path_201");  //Beaujolais Lake
					 entrances.add("path_198");
			         break;
			case 12: entrances.add("bouj_1");  //Beaujolais
					 break;
			case 13: entrances.add("path_306");  //Boiler Plant
					 break;
			case 14: entrances.add("facilities_1");  //Building 49
					 break;
			case 15: entrances.add("garden_1");  //Butterfly Garden
			         break;
			case 16: entrances.add("cab_1");  //Cabernet Village
					 entrances.add("cab_2");
					 break;
			case 17:  //Campus Prints
			case 38:  //JUMP
			case 40: entrances.add("su_1");  //MCC
					 entrances.add("path_118");
					 entrances.add("path_121");
					 entrances.add("pub_1");
			         break;
			case 18: entrances.add("carson_1");  //Carson Hall
			         entrances.add("carson_2");
			         entrances.add("carson_3");
			         break;
			case 19: entrances.add("chalkhill_1");  //Chalk Hill
			         break;
			case 20: entrances.add("cb_1");  //Charlie Brown's
					 entrances.add("cb_2");
			         break;
			case 21: entrances.add("childrens_school_1");  //Children's School
					 break;
			case 22: entrances.add("path_143");  //Commencement Lake
					 entrances.add("path_150");  
					 entrances.add("path_147");  
					 entrances.add("path_150");  
			         break;
			case 23: entrances.add("path_116");  //Commencement Lawn
					 entrances.add("path_117");
					 entrances.add("path_118");
					 entrances.add("path_119");
					 entrances.add("path_120");
					 entrances.add("path_139");
			         break;	 
			case 24: entrances.add("commons_1");  //Commons
			         entrances.add("commons_2");
			         break;
			case 25:  entrances.add("coop_1");   //Cooperage 
					  break;
			case 26:  entrances.add("path_197");  //Cypress Drive Entrance
			case 27:  entrances.add("darwin_1");  //Darwin Hall
			          entrances.add("darwin_2");
					  entrances.add("darwin_3");
					  break; 
			case 28:  entrances.add("environment");  //Environmental Tech Center
			          break;
			case 29:  entrances.add("person_1");    //Everet B. Person Theatre
			          break;
			case 30:  entrances.add("facilities_1");    //Facilities
					  break;
			case 31:  entrances.add("field_house_1");    //Field House
					  break;
			case 32:  entrances.add("gmc_1");  //Green Music Center
					  break;
			case 33:  entrances.add("pe_1");   //Gymnasium
			          entrances.add("pool_1");
					  break;  
			case 34:  entrances.add("pool_1");  //Gymnasium Pool
				      break;
			case 35:  entrances.add("parking_info_1");   //Info Booth North
					  break;
			case 36:  entrances.add("path_303");  //Info Booth South
			          entrances.add("path_305");  
					  entrances.add("path_302");  
					  entrances.add("path_300");
					  entrances.add("path_310");  					  
					  break;  
			case 37:  entrances.add("ives_1");  //Ives Hall
					  entrances.add("ives_3");
					  break;  
			case 39:  entrances.add("path_150");  //Lakes
					  entrances.add("path_221");
					  break;  
			case 41:  entrances.add("mccabe");  //McCabe Plaza
					  break;
			case 42:  entrances.add("nichols_1");    //Nichols Hall
					  break;
			case 43:  entrances.add("parking_info_1");  //North Entrance
					  break;
			case 44:  entrances.add("bouj_1");  //Observatory
					  break;  
			case 45:  entrances.add("pe_1");  //P.E.
					  break;
			case 46:  entrances.add("path_57");    //Parking Lot A
					  entrances.add("path_56");
					  entrances.add("path_91");
					  entrances.add("path_92");
					  entrances.add("path_93");
					  break;
			case 47:  entrances.add("path_216");  //Parking Lot B
					  entrances.add("path_261");
					  break;
			case 48:  entrances.add("path_368");  //Parking Lot C
			          entrances.add("path_370");
					  entrances.add("path_373");
			          break;  
			case 49:  entrances.add("path_265");  //Parking Lot D
					  entrances.add("path_273");
					  entrances.add("path_274");
					  entrances.add("path_287");
					  entrances.add("path_288");
					  entrances.add("path_313");
					  entrances.add("path_373");
					  break;
			case 50:  entrances.add("path_207");  //Parking Lot E
			          entrances.add("path_206");
					  entrances.add("path_346");
					  entrances.add("path_316");
					  entrances.add("path_315");
					  break;  
			case 51:  entrances.add("tuscany_1");  //Parking Lot F
					  break;
			case 52:  entrances.add("path_169");  //Parking Lot G
                      entrances.add("path_172");
					  break;  
			case 53:  entrances.add("path_167");  //Parking Lot H
			          entrances.add("path_165");
					  break;  
			case 54:  entrances.add("path_291");  //Parking Lot J
					  entrances.add("path_285");
					  entrances.add("path_282");
					  break;  
			case 55:  entrances.add("path_183");  //Parking Lot Juniper Lane
                      entrances.add("path_185");
					  break;  
			case 56:
			case 57:
			case 58:
			case 59:  entrances.add("path_158");  //Parking Lots L, M, N, O
					  break;
			case 60:  entrances.add("path_264");  //Police and Parking Services
					  break;
			case 61:  entrances.add("pub_1");  //Pub
					  break;
			case 62:  entrances.add("rec_1");  //Recreation Center
					  break;
			case 63:  entrances.add("salazar_1");  //Salazar Hall
			          entrances.add("salazar_2");
					  entrances.add("salazar_3");
					  break;  
			case 64:  entrances.add("sauv_1");  //Sauvignon Village
			          entrances.add("sauv_4");
					  entrances.add("sauv_5");
					  entrances.add("sauv_3");
					  entrances.add("sauv_2");
					  break;  
			case 65:  entrances.add("library_2");  //Schultz Info Center
			          entrances.add("library_1");
			          break;  
			case 66:  entrances.add("path_175");  //Seawolf Shops
					  break;
			case 67:  entrances.add("tuscany_1");  //Seawolf Stadium
					  break;
			case 68:  entrances.add("path_185");  //Soccer Field
					  entrances.add("path_205");
					  break;
			case 69:  entrances.add("path_183");  //Softball Diamond
					  break;
			case 70:  entrances.add("south_1");  //South Entrance
					  entrances.add("south_2");
					  break;
			case 71:  entrances.add("stevenson_1");    //Stevenson Hall
					  entrances.add("stevenson_2");
					  entrances.add("stevenson_3");
					  entrances.add("stevenson_4");
					  break;
			case 72:  entrances.add("path_368");  //Student Center
			          entrances.add("path_329");
					  break;  
			case 73:  entrances.add("health_1");   //Student Health Center
					  entrances.add("health_2");
					  break;
			case 74:  entrances.add("su_1");  //Student Union
					  entrances.add("pub_1");
					  break;
			case 75:  entrances.add("courts_1");  //Tennis Courts
					  break;
			case 76:  entrances.add("path_245");  //Toast
					  entrances.add("path_253");
					  break; 
			case 77:  entrances.add("bouj_1");  //Tuscany Fountain
					  break;
			case 78:  //Tuscany Mail
			case 79:  entrances.add("tuscany_1");  //Tuscany Village
					  break;
			case 80:  entrances.add("verdot_1");  //Verdot Village
					  break;
			case 81:  entrances.add("south_entrance");  //Vine Street Entrance
					  break;
			case 82:  entrances.add("zin_8");  //Vineyard
					  break;
			case 83:  entrances.add("zin_1");           //Zinfandel Village
					  entrances.add("zin_2");
					  entrances.add("zin_3");
					  entrances.add("zin_4");
					  entrances.add("zin_5");
					  entrances.add("zin_6");
					  entrances.add("zin_7");
					  entrances.add("zin_8");
			          break;
			case 84:                             //Zinfandel Cafeteria
			case 86:                             //Zinfandel Marketplace
			case 88:  entrances.add("path_33");  //Zinfandel Post Office
					  break;                     
			case 85:  entrances.add("path_34");  //Zinfandel Housing Office
					  break;
			case 87:  entrances.add("path_28");  //Zinfandel Pool
					  break;
			//case 47:  entrances.add("not available");  break;
			default:  entrances.add("not available");  break;
		}
		
		return entrances;
	}



}
