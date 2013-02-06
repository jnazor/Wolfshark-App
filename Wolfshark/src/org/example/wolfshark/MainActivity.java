package org.example.wolfshark;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void onRoute(View v)
	{
		Intent locateActivity = new Intent(this, LocateInputActivity.class);
		startActivity(locateActivity);
	}
	
	
	
	
	public void onFavorites(View v)
	{
		Intent favoritesActivity = new Intent (this, FavoritesActivity.class);
		startActivity(favoritesActivity);
	}
}
