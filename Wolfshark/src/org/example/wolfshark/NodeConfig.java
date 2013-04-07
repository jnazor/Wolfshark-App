package org.example.wolfshark; 
import java.util.ArrayList;

import android.util.Log;
 

class NodeConfig{
	
	NodeGraph graph;
	
	NodeConfig(){
		graph = new NodeGraph();
	}
	
	public NodeGraph populate(){ //populates the node graph with nodes, hard coded below:
		

		
		graph.newNode();
		graph.setBufferTextAttributes("Stairs_darwin", "Stairs", "darwin_basement");
		graph.setBufferXYAttributes(100, 225);
		graph.addBufferNeighbor("darwin_hall1");
		graph.pushNode();
		
		graph.newNode();
		graph.setBufferTextAttributes("darwin_hall1", "Hallway", "darwin_basement");
		graph.setBufferXYAttributes(200, 225);
		graph.addBufferNeighbor("Stairs_darwin");
		graph.addBufferNeighbor("darwin_hall2");
		graph.pushNode();
		
		graph.newNode();
		graph.setBufferTextAttributes("darwin_hall2", "Hallway", "darwin_basement");
		graph.setBufferXYAttributes(300, 225);
		graph.addBufferNeighbor("darwin_hall1");
		graph.addBufferNeighbor("darwin_hall3");
		graph.addBufferNeighbor("darwin_022");
		graph.pushNode();
		
		graph.newNode();
		graph.setBufferTextAttributes("darwin_hall3", "Hallway", "darwin_basement");
		graph.setBufferXYAttributes(400, 225);
		graph.addBufferNeighbor("darwin_hall2");
		graph.addBufferNeighbor("darwin_hall4");
		graph.pushNode();
		
		graph.newNode();
		graph.setBufferTextAttributes("darwin_hall4", "Hallway", "darwin_basement");
		graph.setBufferXYAttributes(500, 225);
		graph.addBufferNeighbor("darwin_hall3");
		graph.addBufferNeighbor("darwin_hall5");
		graph.pushNode();
		
		graph.newNode();
		graph.setBufferTextAttributes("darwin_hall5", "Hallway", "darwin_basement");
		graph.setBufferXYAttributes(600, 225);
		graph.addBufferNeighbor("darwin_023");
		graph.addBufferNeighbor("darwin_hall4");
		graph.addBufferNeighbor("darwin_hall6");
		graph.addBufferNeighbor("darwin_006");
		graph.pushNode();
		
		graph.newNode();
		graph.setBufferTextAttributes("darwin_hall6", "Hallway", "darwin_basement");
		graph.setBufferXYAttributes(700, 225);
		graph.addBufferNeighbor("darwin_hall5");
		graph.addBufferNeighbor("darwin_hall7");
		graph.pushNode();
		
		graph.newNode();
		graph.setBufferTextAttributes("darwin_hall7", "Hallway", "darwin_basement");
		graph.setBufferXYAttributes(800, 225);
		//graph.addBufferNeighbor("darwin_hall8");
		graph.addBufferNeighbor("darwin_hall6");
		graph.addBufferNeighbor("darwin_024");
		graph.pushNode();
		
		graph.newNode();
		graph.setBufferTextAttributes("darwin_hall8", "Hallway", "darwin_basement");
		graph.setBufferXYAttributes(900, 225);
		graph.addBufferNeighbor("darwin_hall7");
		graph.addBufferNeighbor("darwin_hall9");
		graph.pushNode();
		
		graph.newNode();
		graph.setBufferTextAttributes("darwin_hall9", "Hallway", "darwin_basement");
		graph.setBufferXYAttributes(1000, 225);
		graph.addBufferNeighbor("darwin_hall8");
		graph.addBufferNeighbor("darwin_hall10");
		graph.pushNode();
		
		graph.newNode();
		graph.setBufferTextAttributes("darwin_hall10", "Hallway", "darwin_basement");
		graph.setBufferXYAttributes(1100, 225);
		graph.addBufferNeighbor("darwin_hall10");
		graph.pushNode();
		
		graph.newNode();
		graph.setBufferTextAttributes("darwin_022", "Darwin_022", "darwin_basement");
		graph.setBufferXYAttributes(300, 190);
		graph.addBufferNeighbor("darwin_hall2");
		graph.pushNode();
		
		graph.newNode();
		graph.setBufferTextAttributes("darwin_023", "Darwin_023", "darwin_basement");
		graph.setBufferXYAttributes(600, 190);
		graph.addBufferNeighbor("darwin_hall5");
		graph.pushNode();
		
		graph.newNode();
		graph.setBufferTextAttributes("darwin_006", "Darwin_006", "darwin_basement");
		graph.setBufferXYAttributes(600, 260);
		graph.addBufferNeighbor("darwin_hall5");
		graph.pushNode();
		
		graph.newNode();
		graph.setBufferTextAttributes("darwin_024", "Darwin_024", "darwin_basement");
		graph.setBufferXYAttributes(800, 190);
		graph.addBufferNeighbor("darwin_hall7");
		graph.pushNode();
		
		
		return graph;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}