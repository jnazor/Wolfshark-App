package org.example.wolfshark;

import java.util.Comparator;

public class DijkstraComparator implements Comparator<Node> {
	
	public int compare(Node x, Node y)
	{
		if(x.DijkstraDistance < y.DijkstraDistance)
			return -1;
		if(x.DijkstraDistance > y.DijkstraDistance)
			return 1;
		
		return 0;
	}

}
