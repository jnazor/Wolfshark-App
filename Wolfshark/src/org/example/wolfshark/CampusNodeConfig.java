package org.example.wolfshark; 
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
 

class CampusNodeConfig{
	
	NodeGraph graph;
	
	CampusNodeConfig(){
		
		
		graph = new NodeGraph();
	}
	
	public NodeGraph populate(Context context){ //populates the node graph with nodes, hard coded below:
		
		AssetManager am = context.getAssets();
		
		InputStream is;
		
		try {
			is = am.open("mainCampusNodes");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String input;
		
		//while(input != null)
		{
			
		}
		
		/*
		
		graph.newNode();
		graph.setBufferTextAttributes("Darwin Hall", "Darwin Hall", "main");
		graph.setBufferXYAttributes(1000, 1000);
		graph.pushNode();
		
		
		
		graph.newNode();
		graph.setBufferTextAttributes("Stevenson Hall", "Stevenson Hall", "main");
		graph.setBufferXYAttributes(1500,1000);
		graph.addBufferNeighbor("Darwin Hall");
		graph.pushNode();
		
		graph.makeNode("Student Union", "Student Union", "main", 1000, 1200, "Stevenson Hall");
		
		
		/*
		graph.newNode();
		graph.setBufferTextAttributes("Salazar Hall", "Salazar Hall", "main");
		graph.setBufferXYAttributes(200, 225);
		graph.addBufferNeighbor("Darwin Hall");
		graph.pushNode();
		*/
		
		
		graph.makeNode("Darwin Hall", "Darwin Hall", "main", 1000, 1000, "none");
		graph.makeNode("path_1", "", "main", 1000, 1100, "Darwin Hall");
		graph.makeNode("Student Union", "Student Union", "main", 1000, 1200, "path_1");//name, displayname, x, x, 1 neighbor
		
		
		
		
		
		return graph;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}