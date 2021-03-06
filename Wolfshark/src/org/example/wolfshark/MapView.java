package org.example.wolfshark;


//import java.util.ArrayList;
//import java.util.Random;
//import java.util.Vector;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
//import android.util.Log;
import android.util.Log;
import android.view.View;
import android.content.SharedPreferences;





public class MapView extends View {

	public static final String PREFERENCE_FILENAME = "LocatePrefs";
	SharedPreferences myPrefs;
	Paint imgPaint;
	//Bitmap mapGraphic = BitmapFactory.decodeResource(getResources(), R.drawable.darwin_basemtse);
	
	BitmapFactory.Options options = new BitmapFactory.Options();
	
	
	Bitmap mapGraphic_1;
	Bitmap mapGraphic_2;
	Bitmap mapGraphic_3;
	Bitmap mapGraphic_4;
	
	private int[] xcoord_primarray;
	private int[] ycoord_primarray;	
	
	int map1width;
	int map1height;
	
	
	Path thePath;
	Paint pathPaint;
	NodeGraph network;
	NodeConfig config;
	Paint dotPaint;
	Paint textPaint;
	
	String startLocation;
	String endLocation;
	
	boolean endLocationFound = false;
	
//	Random rand = new Random();
//	ArrayList<Integer> vistiedList = new ArrayList<Integer>();
//	ArrayList<Integer> explored = new ArrayList<Integer>();
//	ArrayList<Node> exploredNodes = new ArrayList<Node>();

	int mapX = 0;
	int mapY = 0;
	int testx = 0;
	int testy = 0;
	public int offsetX = 0;
	public int offsetY = 0;

	int startX;
	int startY;
	int building_num = 0;
	
	boolean moved = false;
	
	public MapView(Context context)
	{
		super(context);
		//this.setBackgroundColor(Color.rgb(34, 181, 115));
		
		//options.inSampleSize = 2;
		// sets bitmap density to display density, stopping lag and reducing memory footprint
		options.inDensity =  getResources().getDisplayMetrics().densityDpi; 
		
		mapGraphic_1 = BitmapFactory.decodeResource(getResources(), R.drawable.campus_map_nw, options);
		mapGraphic_2 = BitmapFactory.decodeResource(getResources(), R.drawable.campus_map_ne, options);
		mapGraphic_3 = BitmapFactory.decodeResource(getResources(), R.drawable.campus_map_sw, options);
		mapGraphic_4 = BitmapFactory.decodeResource(getResources(), R.drawable.campus_map_se, options);
		
		map1width = mapGraphic_1.getWidth();
		map1height = mapGraphic_1.getHeight();
		
		
		imgPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		thePath = new Path();
		
		xcoord_primarray = getResources().getIntArray(R.array.xcoord_array);
		ycoord_primarray = getResources().getIntArray(R.array.ycoord_array);
		
		
        /*
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
		
		*/
	}
	
	@Override
	protected void onDraw(Canvas canvas)
	{
		//canvas.drawBitmap(mapGraphic, mapX + offsetX, mapY + offsetY, imgPaint);
		
		
		canvas.drawBitmap(mapGraphic_1, mapX + offsetX , mapY + offsetY, imgPaint);
		canvas.drawBitmap(mapGraphic_2, mapX + offsetX + map1width /*+ 1*/, mapY + offsetY, imgPaint);
		canvas.drawBitmap(mapGraphic_3, mapX + offsetX, mapY + offsetY + mapGraphic_1.getHeight(), imgPaint);
		canvas.drawBitmap(mapGraphic_4, mapX + offsetX + mapGraphic_1.getWidth(), mapY + offsetY + mapGraphic_2.getHeight(), imgPaint);
		
		
		thePath.reset();
		
	}
	
	
	

	public boolean contains (int X, int Y, int index)
	{
		//Log.d("DEBUG: ", "Inside contains_start()");
		int deltaX = X - (xcoord_primarray[index] + mapX + offsetX);
		int deltaY = Y - (ycoord_primarray[index] + mapY + offsetY);
		double dist = Math.sqrt (deltaX * deltaX + deltaY * deltaY);
		
		if( dist <= 30)
			building_num = index;
		
		return dist <= 30;
	}
	
	
	
	public int getBuilding_Num()
	{
		return building_num;
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
	
}

