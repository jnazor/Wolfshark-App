package org.example.wolfshark; 
import java.util.ArrayList;
 
public class NodeGraph{
	
	ArrayList<Node> NodeList;
	
	String startNode;
	String endNode;
	
	Node bufferNode; //node still in creation process
	
	NodeGraph()
	{
		NodeList = new ArrayList<Node>();
	}

	
	
	//??
	public void makeNode(String name, String displayName, String mapID, int x, int y, String neighbor)
	{
		newNode();
		setBufferTextAttributes(name,displayName,mapID);
		setBufferXYAttributes(x,y);
		addBufferNeighbor(neighbor);
		pushNode();
		
	}
	
	
	
	//sets bufferNode to a the value of a new node 
	//only if bufferNode == null
	public boolean newNode()
	{
		if(bufferNode == null)
		{
			bufferNode = new Node();
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	//adds/pushes the calling node onto the network
	public void pushNode()
	{
		for(int i=0;i<NodeList.size();i++)
		{
			for(int j=0;j<bufferNode.neighboringNodes.size();j++)
			{
				if(NodeList.get(i).Name==bufferNode.neighboringNodes.get(j) & NodeList.get(i).neighboringNodes.contains(bufferNode.Name) == false)
				{
					NodeList.get(i).neighboringNodes.add(bufferNode.Name);
				}
			}
		}
		
		
		bufferNode.globalNodeID = NodeList.size();
		NodeList.add(bufferNode);
		bufferNode = null;
	}
	
	
	
	//sets multiple node attributes: Name, DisplayText, and MapID
	public void setBufferTextAttributes(String nameInput, String displayTextinpt, String mapIDInput)
	{
		if(bufferNode != null)
		{
			bufferNode.setName(nameInput);
			bufferNode.setDisplayText(displayTextinpt);
			bufferNode.setMapID(mapIDInput);
		}
	}
	
	
	
	//sets inX and inY values of the calling node
	public void setBufferXYAttributes(int inX, int inY)
	{
		if(bufferNode != null)
		{
			bufferNode.setMapAnchor(inX, inY);
		}
	}
	
	
	
	
	//adds the name of a neighbor to the array of neighboring node names
	public void addBufferNeighbor(String input)
	{
		if(bufferNode != null)
		{
			bufferNode.addNeighborNode(input);
			//bufferNode.neighboringNodes.add(input);
		}
	}
	
	
	
	
	//adds the name and distance of a neighbor to the array of neighboring node
	//names and distances
	public void addBufferNeighbor(String input, int distance)
	{
		if(bufferNode != null)
		{
			bufferNode.addNeighborNode(input, distance);
			//bufferNode.neighboringNodes.add(input);
		}
	}
	
}
