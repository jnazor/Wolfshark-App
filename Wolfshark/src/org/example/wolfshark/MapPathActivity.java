package org.example.wolfshark;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;

//Idea for drawing on the map comes from:
//http://nxsfan.co.uk/blog/2010/06/18/ondraw-drawing-a-simple-line-on-a-background/

public class MapPathActivity extends Activity {
	
//	LinearLayout PathLayout;
//	TextView testText;
//	String start_build;
//	String end_build;
//	String start_room;
//	String end_room;
	
//	public static final String PREFERENCE_FILENAME = "LocatePrefs";
//    private SharedPreferences myPrefs;
//    SharedPreferences.Editor myEditor;
	
	CustomView mainView;
	
	public void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_mappath);
//		
//		PathLayout = (LinearLayout) findViewById(R.id.dar_basement);
//		CustomView myView = new CustomView(this);
//		PathLayout.addView(myView);
//		
//		testText = (TextView) findViewById(R.id.testOutput);
//		testText.setTextColor(Color.BLUE);
//		
//		
//		myPrefs = getSharedPreferences(PREFERENCE_FILENAME, MODE_PRIVATE);
//        myEditor = myPrefs.edit();
//		
//		start_build = "";
//		end_build = "";
//		start_room = "";
//		end_room = "";
//		
//		start_build = myPrefs.getString("startBuild", "None");
//		end_build = myPrefs.getString("endBuild", "None");
//		start_room = myPrefs.getString("startRoom", "None");
//		end_room = myPrefs.getString("endRoom", "None");
//		
//		testText.setText("Test: " + start_build + " " + start_room + "\n      " + end_build + " " + end_room);
		
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		

		mainView = new CustomView(this);
		
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
	
//	public void onNewPath(View v)
//	{
//		Intent newPath = new Intent(MapPathActivity.this, LocateInputActivity.class);
//		startActivity(newPath);
//	}
	
	public void onNewPath(View v)
	{ }
	
	public boolean onCreateOptionsMenu(Menu menu) {
    	MenuInflater inflater = getMenuInflater();
    	inflater.inflate(R.menu.mapmenu, menu);
    	return true;
    }
	
	public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
        	case R.id.back:
    		Intent back = new Intent (this, LocateInputActivity.class);
    		startActivity(back);
    		break;
    		default:
    			return super.onOptionsItemSelected(item);
        }
    	return onOptionsItemSelected(item);
   }

}
