package org.example.wolfshark;

//NOTE: This file isn't being used. It was originally the opening activity that you got
//when you started the app, but that's now the LocateInputActivity.

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
    public boolean onCreateOptionsMenu(Menu menu) {
    	MenuInflater inflater = getMenuInflater();
    	inflater.inflate(R.menu.menu, menu);
    	return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
        	case R.id.favoritesmenu:
        		Intent favoritesActivity = new Intent (this, FavoritesActivity.class);
        		startActivity(favoritesActivity);
        		break;
        	case R.id.aboutmenu:
            	AlertDialog am = new AlertDialog.Builder(this).create();  
            	am.setCancelable(false); // This blocks the 'BACK' button  
            	am.setMessage(this.getString(R.string.about_text));
            	am.setButton(0, "Close", new DialogInterface.OnClickListener() {  
            	    @Override  
            	    public void onClick(DialogInterface amd2, int which) {  
            	        amd2.dismiss();                      
            	    }  
            	});
            	am.show();
            	break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return onOptionsItemSelected(item);
        }; 
    
	public void onRoute(View v)
	{
		Intent locateActivity = new Intent(this, LocateInputActivity.class);
		startActivity(locateActivity);
	}
	
	public void onMap(View v)
	{
		Intent mapView = new Intent (this, MapActivity.class);
		startActivity(mapView);
	}

}