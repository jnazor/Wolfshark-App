package org.example.wolfshark;

//NOTE: This file isn't being used anymore. It's old purpose was to display the screen
//that showed the about text, but that's now in an alert dialog handled by LocateInput

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class AboutActivity extends Activity {
   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_about);
   }
   
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
        return super.onOptionsItemSelected(item);
   }
}