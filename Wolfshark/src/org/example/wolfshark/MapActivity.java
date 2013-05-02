package org.example.wolfshark;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;

public class MapActivity extends Activity
{
	MapView mainView;
	
	public static final String FLOORPREFS_FILE = "FloorPrefs";
	SharedPreferences floorPrefs;
	SharedPreferences.Editor floorEditor;	

	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		floorPrefs = getSharedPreferences(FLOORPREFS_FILE,  MODE_PRIVATE);
		floorEditor = floorPrefs.edit();
		

		mainView = new MapView(this);
		
		mainView.setOnTouchListener(new View.OnTouchListener(){
			
			@Override
			public boolean onTouch(View v, MotionEvent event){

				int action = event.getAction();
				int deltaX = 0;
				int startX = 0;
				int deltaY = 0;
				int startY = 0;
				

				Log.d("TOUCH","STARTED A TOUCH");
				
				switch(action){
					case MotionEvent.ACTION_UP:
						mainView.offsetX += mainView.mapX;
						mainView.offsetY += mainView.mapY;
						mainView.mapX = 0;
						mainView.mapY = 0;
						
						break;
					case MotionEvent.ACTION_DOWN:
						startX = (int)event.getX();
						startY = (int)event.getY();
						
						mainView.startX = startX;
						mainView.startY = startY;
						
						//Art Building:  5		Darwin Hall:  27
						//Ives Hall:	37		Nichols Hall: 42
						//Salazar Hall:  63		Stevenson Hall: 71
						if (mainView.contains(startX, startY, 5) ||
							mainView.contains(startX, startY, 27) ||
							mainView.contains(startX, startY, 37) ||
							mainView.contains(startX, startY, 42) ||
							mainView.contains(startX, startY, 63) ||
							mainView.contains(startX, startY, 71) )
						{
							floorEditor.putInt("build_num", mainView.getBuilding_Num());
							floorEditor.commit();
							
							Intent floorSwipe = new Intent(MapActivity.this, FloorSwipeActivity.class);
							startActivity(floorSwipe);
						}
						
						break;
					case MotionEvent.ACTION_POINTER_DOWN:
					{
						
						
						
						
					}
					case MotionEvent.ACTION_MOVE:
					{

						int valueX = (int)event.getX();
						int valueY = (int)event.getY();
						
						deltaX = valueX - mainView.startX;
						deltaY = valueY - mainView.startY;
						
						mainView.mapX = deltaX;
						mainView.mapY = deltaY;
						
						mainView.moved = true;

						
						mainView.postInvalidate();
						break;

					
						
					}
				}
				return true;
			}
		});
		setContentView(mainView);
	}
	
	public void onNewPath(View v)
	{ }
	

}
