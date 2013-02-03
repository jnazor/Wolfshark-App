package org.example.wolfshark;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

//Idea for drawing on the map comes from:
//http://nxsfan.co.uk/blog/2010/06/18/ondraw-drawing-a-simple-line-on-a-background/

public class MapPathActivity extends Activity {
	
	LinearLayout PathLayout;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mappath);
		
		PathLayout = (LinearLayout) findViewById(R.id.dar_basement);
		CustomView myView = new CustomView(this);
		PathLayout.addView(myView);
		
	}
	
	public void onNewPath(View v)
	{
		Intent newPath = new Intent(MapPathActivity.this, LocateInputActivity.class);
		startActivity(newPath);
	}

}
