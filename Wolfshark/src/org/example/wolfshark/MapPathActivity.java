package org.example.wolfshark;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
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
import android.widget.ScrollView;
import android.widget.Toast;

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
	
	public static final String PREFERENCE_FILENAME = "LocatePrefs";
	SharedPreferences myPrefs;
	
	public static final String FLOORPREFS_FILE = "FloorPrefs";
	SharedPreferences floorPrefs;
	SharedPreferences.Editor floorEditor;
	
	int start_pos;
	int end_pos;
	
	String[] rooms;
	String choice = " ";
	int build_index = 0;
	
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
		
		myPrefs = getSharedPreferences(PREFERENCE_FILENAME,0);		
		start_pos = myPrefs.getInt("startPos", 0);
		end_pos = myPrefs.getInt("endPos", 0);
		
		floorPrefs = getSharedPreferences(FLOORPREFS_FILE,  MODE_PRIVATE);
		floorEditor = floorPrefs.edit();
		
		choice = " ";
		

		mainView = new CustomView(this);
		
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
						
						//mainView.startX = startX;
						//mainView.startY = startY;
						Log.d("START X: ", "" + startX);
						Log.d("START Y: ", "" + startY);
						
						build_index = 0;

						//place if statement for circle-contains here, then start new intent
						if((start_pos == 5 || start_pos == 27 || start_pos == 37 || start_pos == 42 || start_pos == 63 || start_pos == 71) && mainView.contains_start(startX, startY))
						{
							Log.d("DEBUG: ", "contains() == true");
							
							build_index = start_pos;
							
							//choice = " ";
							roomNumDialog(start_pos);
							
							//while(choice.equals(" "));
							
//							floorEditor.putInt("position", start_pos);
//							floorEditor.putString("roomNum", choice);
//							floorEditor.commit();
							
//							Intent floorActivity = new Intent(MapPathActivity.this, FloorPlanActivity.class);
//							startActivity(floorActivity);
						}
						else if((end_pos == 5 || end_pos == 27 || end_pos == 37 || end_pos == 42 || end_pos == 63 || end_pos == 71) && mainView.contains_end(startX, startY))
						{
							Log.d("DEBUG: ", "contains() == true");
							
							build_index = end_pos;
							
							//choice = " ";
							roomNumDialog(end_pos);
							
							//while(choice.equals(" "));
							
//							floorEditor.putInt("position", end_pos);
//							floorEditor.putString("roomNum", choice);
//							floorEditor.commit();
							
//							Intent floorActivity = new Intent(MapPathActivity.this, FloorPlanActivity.class);
//							startActivity(floorActivity);
						}
						else
						{
							mainView.startX = startX;
							mainView.startY = startY;
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
	
//	public void onNewPath(View v)
//	{
//		Intent newPath = new Intent(MapPathActivity.this, LocateInputActivity.class);
//		startActivity(newPath);
//	}
	
	
	private void roomNumDialog(int position)
	{
		//rooms = getResources().getStringArray(R.array.darwin_array);
		setRooms(position);
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		ScrollView myScrollV = new ScrollView(getApplicationContext());
		builder.setView(myScrollV);
    	builder.setTitle("Choose Floor");
    	builder.setItems(rooms, new DialogInterface.OnClickListener() {
    		public void onClick(DialogInterface bdialog, int index) {
    			choice = rooms[index];
    			
    			floorEditor.putInt("position", build_index);
				floorEditor.putString("roomNum", choice);
				floorEditor.putInt("floor", index);
				floorEditor.commit();
    			
    			Toast.makeText(getBaseContext(), choice, Toast.LENGTH_SHORT).show();
    			Intent floorActivity = new Intent(MapPathActivity.this, FloorPlanActivity.class);
				startActivity(floorActivity);
			}
    	});
    	AlertDialog alert = builder.create();
    	alert.show();
	}
	
	
	
	private void setRooms(int position)
	{
		switch(position)
		{
			case 5:		rooms = getResources().getStringArray(R.array.art_floors);  		break;
			case 27:	rooms = getResources().getStringArray(R.array.darwin_floors);  	break;
			case 37:	rooms = getResources().getStringArray(R.array.ives_floors);  	break;
			case 42:	rooms = getResources().getStringArray(R.array.nichols_floors);  	break;
			case 63:	rooms = getResources().getStringArray(R.array.salazar_floors);  	break;
			case 71:	rooms = getResources().getStringArray(R.array.stevenson_floors); break;
		}
	}
	
	
	
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
