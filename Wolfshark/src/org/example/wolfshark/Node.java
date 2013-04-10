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
	

    public Node(){
    	
    	Name = "";
    	DisplayText = "";
    	MapID = "";
    	mapAnchorX = 0;
    	mapAnchorY = 0;
    	neighboringNodes = new ArrayList<String>();
    	neighboringNodeDistance = new ArrayList<Integer>();
    	globalNodeID = 0;
    }
    

    public void setName(String input)
    {
    	Name = input;
    }
    
    public void setDisplayText(String input)
    {
    	DisplayText = input;
    }
    
    public void setMapAnchor(int inX, int inY)
    {
    	mapAnchorX = inX;
    	mapAnchorY = inY;
    }
    
    public void setMapID(String input)
    {
    	MapID = input;
    }
    
    public void addNeighborNode(String neighborName, int neighborDistance)
    {
    	neighboringNodes.add(neighborName);
    	neighboringNodeDistance.add(neighborDistance);
    	
    }
    
    public void addNeighborNode(String neighborName)
    {
    	neighboringNodes.add(neighborName);
    	
    }
    
    public boolean isNeighbor(String inputName)
    {
    	for(int i=0;i<neighboringNodes.size();i++)
    	{
    		if(neighboringNodes.get(i) == inputName)
    		{
    			return true;
    		}
    	}
    	return false;
    }
    
    
    
    
    boolean contains(ArrayList<String> myList)
    {
    	//boolean equalsNode = false;
    	
    	for(int i = 0; i < myList.size() /*&& !equalsNode*/; i++)
    		if(Name.equals(myList.get(i)))
    			return true;
    			//equalsNode = true;
    	
    	//return equalsNode;
    	return false;
    }


}