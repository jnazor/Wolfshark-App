package org.example.wolfshark;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EditFavsActivity extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_editfavs);
	}
	
	public void onSaveFavs(View v)
	{
		Intent SaveFavsActivity = new Intent (this, SaveFavsActivity.class);
		startActivity(SaveFavsActivity);
	}
}