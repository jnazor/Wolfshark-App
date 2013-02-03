package org.example.wolfshark;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LocateInputActivity extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_locateinput);
		System.out.println("LocateInputActivity Started.");
	}
	
	public void onGo(View v)
	{
		Intent myMapPath = new Intent(this, MapPathActivity.class);
		startActivity(myMapPath);
	}

}
