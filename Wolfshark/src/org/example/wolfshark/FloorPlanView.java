package org.example.wolfshark;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class FloorPlanView extends View {

	BitmapFactory.Options options = new BitmapFactory.Options();
	
	int map1width;
	int map1height;
	
	int mapX = 0;
	int mapY = 0;
	int testx = 0;
	int testy = 0;
	public int offsetX = 0;
	public int offsetY = 0;

	int startX;
	int startY;
	
	boolean moved = false;
	
	Path circlePath;
	Paint imgPaint;
	int superfloorNum;
	
	Bitmap floor_nw;
	Bitmap floor_ne;
	Bitmap floor_sw;
	Bitmap floor_se;
	
	int num_floors = 0;
	
	public static final String FLOORPREFS_FILE = "FloorPrefs";
	SharedPreferences floorPrefs;	
	int pos = 0;
	String roomNum = "";
	
	
	FloorPlanView(Context context)
	{
		super(context);
		
		options.inDensity =  getResources().getDisplayMetrics().densityDpi*2; 
		this.setBackgroundColor(Color.GRAY);
		
		//need to get value for switch statement - comes from value of building that was clicked on.
		
		floorPrefs = context.getSharedPreferences(FLOORPREFS_FILE,0);
		pos = floorPrefs.getInt("position", 0);
		roomNum = floorPrefs.getString("roomNum", " ");
		
		Log.d("ROOMNUM: ", roomNum);
		
		superfloorNum = floorPrefs.getInt("floor",0);
		
		setMaps(pos,superfloorNum);
		
		map1width = floor_nw.getWidth();
		map1height = floor_nw.getHeight();
		
		imgPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		circlePath = new Path();
	}
	
	protected void onDraw(Canvas canvas)
	{
		canvas.drawBitmap(floor_nw, (mapX + offsetX)/* + (map1width * 2)*/, mapY + offsetY, imgPaint);
		canvas.drawBitmap(floor_ne, (mapX + offsetX + map1width)/* + (map1width * 2)*/, mapY + offsetY, imgPaint);
		canvas.drawBitmap(floor_sw, (mapX + offsetX)/* + (map1width * 2)*/, mapY + offsetY + map1height, imgPaint);
		canvas.drawBitmap(floor_se, (mapX + offsetX + map1width)/* + (map1width * 2)*/, mapY + offsetY + map1height, imgPaint);	
	}
	
	public void setMaps(int position, int floorNum)
	{
		floorNum = floorPrefs.getInt("floor",0);
		switch(position)
		{
			case 5:  //Art Building
				floor_nw = BitmapFactory.decodeResource(getResources(), R.drawable.art_nw, options);
				floor_ne = BitmapFactory.decodeResource(getResources(), R.drawable.art_ne, options);
				floor_sw = BitmapFactory.decodeResource(getResources(), R.drawable.art_sw, options);
				floor_se = BitmapFactory.decodeResource(getResources(), R.drawable.art_se, options);
				break;
			case 27:  //Darwin  
				if(floorNum == 0)
				{
					floor_nw = BitmapFactory.decodeResource(getResources(), R.drawable.darwin_basemtnw, options);
					floor_ne = BitmapFactory.decodeResource(getResources(), R.drawable.darwin_basemtne, options);
					floor_sw = BitmapFactory.decodeResource(getResources(), R.drawable.darwin_basemtsw, options);
					floor_se = BitmapFactory.decodeResource(getResources(), R.drawable.darwin_basemtse, options);
				}
				
				else if(floorNum == 1)
				{
					floor_nw = BitmapFactory.decodeResource(getResources(), R.drawable.darwin_onenw, options);
					floor_ne = BitmapFactory.decodeResource(getResources(), R.drawable.darwin_onene, options);
					floor_sw = BitmapFactory.decodeResource(getResources(), R.drawable.darwin_onesw, options);
					floor_se = BitmapFactory.decodeResource(getResources(), R.drawable.darwin_onese, options);
				}
				
				else if(floorNum == 2)
				{
					floor_nw = BitmapFactory.decodeResource(getResources(), R.drawable.darwin_twonw, options);
					floor_ne = BitmapFactory.decodeResource(getResources(), R.drawable.darwin_twone, options);
					floor_sw = BitmapFactory.decodeResource(getResources(), R.drawable.darwin_twosw, options);
					floor_se = BitmapFactory.decodeResource(getResources(), R.drawable.darwin_twose, options);
				}
				
				else if(floorNum == 3)
				{
					floor_nw = BitmapFactory.decodeResource(getResources(), R.drawable.darwin_threenw, options);
					floor_ne = BitmapFactory.decodeResource(getResources(), R.drawable.darwin_threene, options);
					floor_sw = BitmapFactory.decodeResource(getResources(), R.drawable.darwin_threesw, options);
					floor_se = BitmapFactory.decodeResource(getResources(), R.drawable.darwin_threese, options);
				}
				
				break;
				
			case 37:  //Ives
				if(floorNum == 0)
				{
					floor_nw = BitmapFactory.decodeResource(getResources(), R.drawable.ives_onenw, options);
					floor_ne = BitmapFactory.decodeResource(getResources(), R.drawable.ives_onene, options);
					floor_sw = BitmapFactory.decodeResource(getResources(), R.drawable.ives_onesw, options);
					floor_se = BitmapFactory.decodeResource(getResources(), R.drawable.ives_onese, options);
				}
				
				else if(floorNum == 1)
				{
					floor_nw = BitmapFactory.decodeResource(getResources(), R.drawable.ives_twonw, options);
					floor_ne = BitmapFactory.decodeResource(getResources(), R.drawable.ives_twone, options);
					floor_sw = BitmapFactory.decodeResource(getResources(), R.drawable.ives_twosw, options);
					floor_se = BitmapFactory.decodeResource(getResources(), R.drawable.ives_twose, options);
				}
				
				else if(floorNum == 2)
				{
					floor_nw = BitmapFactory.decodeResource(getResources(), R.drawable.ives_threenw, options);
					floor_ne = BitmapFactory.decodeResource(getResources(), R.drawable.ives_threene, options);
					floor_sw = BitmapFactory.decodeResource(getResources(), R.drawable.ives_threesw, options);
					floor_se = BitmapFactory.decodeResource(getResources(), R.drawable.ives_threese, options);
				}
				
				break;
			case 42:  //Nichols
			    if(floorNum == 0)
			    {
			        floor_nw = BitmapFactory.decodeResource(getResources(), R.drawable.nichols_onenw, options);
					floor_ne = BitmapFactory.decodeResource(getResources(), R.drawable.nichols_onene, options);
					floor_sw = BitmapFactory.decodeResource(getResources(), R.drawable.nichols_onesw, options);
					floor_se = BitmapFactory.decodeResource(getResources(), R.drawable.nichols_onese, options);
			    }
			    
			    else if (floorNum == 1)
			    {
					floor_nw = BitmapFactory.decodeResource(getResources(), R.drawable.nichols_twonw, options);
					floor_ne = BitmapFactory.decodeResource(getResources(), R.drawable.nichols_twone, options);
					floor_sw = BitmapFactory.decodeResource(getResources(), R.drawable.nichols_twosw, options);
					floor_se = BitmapFactory.decodeResource(getResources(), R.drawable.nichols_twose, options);
			    }
			    
			    else if (floorNum == 2)
			    {
					floor_nw = BitmapFactory.decodeResource(getResources(), R.drawable.nichols_threenw, options);
					floor_ne = BitmapFactory.decodeResource(getResources(), R.drawable.nichols_threene, options);
					floor_sw = BitmapFactory.decodeResource(getResources(), R.drawable.nichols_threesw, options);
					floor_se = BitmapFactory.decodeResource(getResources(), R.drawable.nichols_threese, options);
			    }
			    
				break;
			case 63:  //Salazar
				if(floorNum == 0)
				{
					floor_nw = BitmapFactory.decodeResource(getResources(), R.drawable.salazar_onenw, options);
					floor_ne = BitmapFactory.decodeResource(getResources(), R.drawable.salazar_onene, options);
					floor_sw = BitmapFactory.decodeResource(getResources(), R.drawable.salazar_onesw, options);
					floor_se = BitmapFactory.decodeResource(getResources(), R.drawable.salazar_onese, options);
				}
				
				else if(floorNum == 1)
				{
					floor_nw = BitmapFactory.decodeResource(getResources(), R.drawable.salazar_twonw, options);
					floor_ne = BitmapFactory.decodeResource(getResources(), R.drawable.salazar_twone, options);
					floor_sw = BitmapFactory.decodeResource(getResources(), R.drawable.salazar_twosw, options);
					floor_se = BitmapFactory.decodeResource(getResources(), R.drawable.salazar_twose, options);
				}
				
				break;
			case 71:  //Stevenson
				if(floorNum == 0)
				{
					floor_nw = BitmapFactory.decodeResource(getResources(), R.drawable.stevenson_onenw, options);
					floor_ne = BitmapFactory.decodeResource(getResources(), R.drawable.stevenson_onene, options);
					floor_sw = BitmapFactory.decodeResource(getResources(), R.drawable.stevenson_onesw, options);
					floor_se = BitmapFactory.decodeResource(getResources(), R.drawable.stevenson_onese, options);
				}
				
				else if(floorNum == 1)
				{
					floor_nw = BitmapFactory.decodeResource(getResources(), R.drawable.stevenson_twonw, options);
					floor_ne = BitmapFactory.decodeResource(getResources(), R.drawable.stevenson_twone, options);
					floor_sw = BitmapFactory.decodeResource(getResources(), R.drawable.stevenson_twosw, options);
					floor_se = BitmapFactory.decodeResource(getResources(), R.drawable.stevenson_twose, options);
				}
				
				else if(floorNum == 2)
				{
					floor_nw = BitmapFactory.decodeResource(getResources(), R.drawable.stevenson_threenw, options);
					floor_ne = BitmapFactory.decodeResource(getResources(), R.drawable.stevenson_threene, options);
					floor_sw = BitmapFactory.decodeResource(getResources(), R.drawable.stevenson_threesw, options);
					floor_se = BitmapFactory.decodeResource(getResources(), R.drawable.stevenson_threese, options);
				}
				
				break;				
		}
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
