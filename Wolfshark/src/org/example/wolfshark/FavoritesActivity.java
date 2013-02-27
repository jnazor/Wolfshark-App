package org.example.wolfshark;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FavoritesActivity extends Activity {
	
	Button favs1;
	Button favs2;
	Button favs3;
	Button favs4;
	Button favs5;
	
	String build_1 = null;
	String build_2 = null;
	String build_3 = null;
	String build_4 = null;
	String build_5 = null;
	    
	String room_1 = null;
	String room_2 = null;
	String room_3 = null;
	String room_4 = null;
	String room_5 = null;
	
	public static final String PREFERENCE_FILENAME = "FavsPrefs";
    private SharedPreferences myPrefs;
    SharedPreferences.Editor myEditor;
	
	//Button objects have been created and set up in this file 
	//using setText() so that their values can be changed later
	//in the program.  The buttons are currently set up with
	//filler values for demonstration purposes.
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_favs);
		
		myPrefs = getSharedPreferences(PREFERENCE_FILENAME, MODE_PRIVATE);
        myEditor = myPrefs.edit();
        
        build_1 = myPrefs.getString("build_1", "None");
        build_2 = myPrefs.getString("build_2", "None");
        build_3 = myPrefs.getString("build_3", "None");
        build_4 = myPrefs.getString("build_4", "None");
        build_5 = myPrefs.getString("build_5", "None");
        
        room_1 = myPrefs.getString("room_1", "00");
        room_2 = myPrefs.getString("room_2", "00");
        room_3 = myPrefs.getString("room_3", "00");
        room_4 = myPrefs.getString("room_4", "00");
        room_5 = myPrefs.getString("room_5", "00");
		
		favs1 = (Button) findViewById(R.id.favs1);
		favs1.setText("" + build_1 + " " + room_1); 
		
		favs2 = (Button) findViewById(R.id.favs2);
		favs2.setText("" + build_2 + " " + room_2);
		
		favs3 = (Button) findViewById(R.id.favs3);
		favs3.setText("" + build_3 + " " + room_3);

		favs4 = (Button) findViewById(R.id.favs4);
		favs4.setText("" + build_4 + " " + room_4);
		
		favs5 = (Button) findViewById(R.id.favs5);
		favs5.setText("" + build_5 + " " + room_5);
	}
	
	//Used in place of calling the onClick listener - much easier!
	//The button in the activity_favs.xml file must have the attribute:
	//    android:onClick="onEditFavs"
	public void onEditFavs(View v)
	{
		Intent EditFavsActivity = new Intent (this, EditFavsActivity.class);
		startActivity(EditFavsActivity);
	}

}