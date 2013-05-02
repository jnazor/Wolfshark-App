package org.example.wolfshark;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;

public class FloorPlanActivity extends Activity {
	
	FloorPlanView mainView;
	
	public static final String FLOORPREFS_FILE = "FloorPrefs";
	SharedPreferences floorPrefs;
	
	int pos = 0;
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		floorPrefs = getSharedPreferences(FLOORPREFS_FILE,0);
		pos = floorPrefs.getInt("position", 0);
		
		if( !(pos == 5 || pos == 27 || pos == 37 || pos == 42 || pos == 63 || pos == 71))
		{
		    Intent mapPath = new Intent(FloorPlanActivity.this, MapPathActivity.class);
		    startActivity(mapPath);
		}
		

		mainView = new FloorPlanView(this);
		
		mainView.setOnLongClickListener(new View.OnLongClickListener() {
			  public boolean onLongClick(View view) {
			    
				  
				  mainView.superfloorNum++;
				  mainView.setMaps(mainView.pos, mainView.superfloorNum);
				  mainView.invalidate();
				  
				  
			    return true;  // avoid extra click events
			  }
			});
		
		mainView.setLongClickable(true);
		
		mainView.setOnTouchListener(new View.OnTouchListener(){
			
			
			
			@Override
			public boolean onTouch(View v, MotionEvent event){

				int action = event.getAction();
				int deltaX = 0;
				int startX = 0;
				int deltaY = 0;
				int startY = 0;
				

				//Log.d("TOUCH","STARTED A TOUCH");
				
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
