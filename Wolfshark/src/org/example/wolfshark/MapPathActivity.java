package org.example.wolfshark;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

//Idea for drawing on the map comes from:
//http://nxsfan.co.uk/blog/2010/06/18/ondraw-drawing-a-simple-line-on-a-background/

public class MapPathActivity extends Activity {
	
	LinearLayout PathLayout;
	TextView testText;
	String start_build;
	String end_build;
	String start_room;
	String end_room;
	
	public static final String PREFERENCE_FILENAME = "LocatePrefs";
    private SharedPreferences myPrefs;
    SharedPreferences.Editor myEditor;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mappath);
		
		PathLayout = (LinearLayout) findViewById(R.id.dar_basement);
		CustomView myView = new CustomView(this);
		PathLayout.addView(myView);
		
		testText = (TextView) findViewById(R.id.testOutput);
		testText.setTextColor(Color.BLUE);
		
		
		myPrefs = getSharedPreferences(PREFERENCE_FILENAME, MODE_PRIVATE);
        myEditor = myPrefs.edit();
		
		start_build = "";
		end_build = "";
		start_room = "";
		end_room = "";
		
		start_build = myPrefs.getString("startBuild", "None");
		end_build = myPrefs.getString("endBuild", "None");
		start_room = myPrefs.getString("startRoom", "None");
		end_room = myPrefs.getString("endRoom", "None");
		
		testText.setText("Test: " + start_build + " " + start_room + "\n      " + end_build + " " + end_room);
		
	}
	
	public void onNewPath(View v)
	{
		Intent newPath = new Intent(MapPathActivity.this, LocateInputActivity.class);
		startActivity(newPath);
	}

}
