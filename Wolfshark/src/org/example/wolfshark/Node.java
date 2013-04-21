package org.example.wolfshark; 
import java.util.ArrayList;
 
public class Node {
 
	int globalNodeID;
	String Name; //Unique name
	String DisplayText; //Text to be displayed next to node on the map
	String MapID; // Tag of what map this node is on
	int mapAnchorX; 
	int mapAnchorY; //X and Y of location on map, relative to origin (can be off actual map)
	ArrayList<String> neighboringNodes; // list of nodes connected to this node
	ArrayList<Integer> neighboringNodeDistance; //distance from this node to it's neighboring nodes, in order
	//boolean hallway; //true if a hallway node
	//boolean room; //true of a room node
	//boolean mapBoundry; //true if node leads to another section of map
	
	//For use with Dijkstra's Algorithm in CustomView.java
	int DijkstraDistance;
	String DijkstraPrevious;

    public Node(){
    	
    	Name = "";
    	DisplayText = "";
    	MapID = "";
    	mapAnchorX = 0;
    	mapAnchorY = 0;
    	neighboringNodes = new ArrayList<String>();
    	neighboringNodeDistance = new ArrayList<Integer>();
    	globalNodeID = 0;
    	DijkstraDistance = 100000;
    	DijkstraPrevious = "";
    }
    

    
    
    //sets the name of the of the node to that
    //of the value of input.
    public void setName(String input)
    {
    	Name = input;
    }
    
    public void setDisplayText(String input)
    {
    	DisplayText = input;
    }
    
    
    
    
    //sets the x and y values of the node's location on the image/map
    //inX >= 0 && inY >= 0
    public void setMapAnchor(int inX, int inY)
    {
    	mapAnchorX = inX;
    	mapAnchorY = inY;
    }
    
    public void setMapID(String input)
    {
    	MapID = input;
    }
    
    
    
    
    //Adds the name of a node and the distance between that node and the
    //node that called this method to the arrays of neighboring node
    //names and neighboring node distances.
    public void addNeighborNode(String neighborName, int neighborDistance)
    {
    	neighboringNodes.add(neighborName);
    	neighboringNodeDistance.add(neighborDistance);
    	
    }
    
    
    
    
    //Adds the name of a node to the list of neighboring nodes
    //to the node that called this method.
    public void addNeighborNode(String neighborName)
    {
    	neighboringNodes.add(neighborName);
    	
    }
    
    
    
    
    //Returns true if the given inputName (String name of
    //a node) is included in the array of names of 
    //neighboring nodes to the node that called this method
    public boolean isNeighbor(String inputName)
    {
    	for(int i=0;i<neighboringNodes.size();i++)
    	{
    		if(neighboringNodes.get(i).equals(inputName))
    		{
    			return true;
    		}
    	}
    	return false;
    }
    
    
    
    
    //returns true if the name of the node is included
    //in the passed array of String values
    //myList.size() > 0
    boolean contains(ArrayList<String> myList)
    {
    	for(int i = 0; i < myList.size(); i++)
    		if(Name.equals(myList.get(i)))
    			return true;

    	return false;
    }


}