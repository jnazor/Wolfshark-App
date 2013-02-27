package org.example.wolfshark;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;

public class EditFavsActivity extends Activity {
	
	private ArrayAdapter<String> adapter;
	private ArrayAdapter<Integer> intAdapter;
		
	private OnItemSelectedListener roomListener_1;
	private OnItemSelectedListener roomListener_2;
	private OnItemSelectedListener roomListener_3;
	private OnItemSelectedListener roomListener_4;
	private OnItemSelectedListener roomListener_5;
		
	private Spinner roomSpin_1;
	private Spinner roomSpin_2;
	private Spinner roomSpin_3;
	private Spinner roomSpin_4;
	private Spinner roomSpin_5;

		
	private String[] build_arr;
	private int[] darRooms_primArr;
	private Integer[] darRooms_arr;
		
	InstantAutoComplete favs1;
	InstantAutoComplete favs2;
	InstantAutoComplete favs3;
	InstantAutoComplete favs4;
	InstantAutoComplete favs5;
		
	TextView testing;
	String testStr;
		
	//values to be sent to MapPath
	int pos1 = 0;
	int pos2 = 0;
	int pos3 = 0;
	int pos4 = 0;
	int pos5 = 0;
		
	String build_1 = null;
	String build_2 = null;
	String build_3 = null;
	String build_4 = null;
	String build_5 = null;
	    
	int roomPos_1 = 0;
	int roomPos_2 = 0;
	int roomPos_3 = 0;
	int roomPos_4 = 0;
	int roomPos_5 = 0;
	    
	String room_1 = null;
	String room_2 = null;
	String room_3 = null;
	String room_4 = null;
	String room_5 = null;

	public static final String PREFERENCE_FILENAME = "FavsPrefs";
	private SharedPreferences myPrefs;
	SharedPreferences.Editor myEditor;
	
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_editfavs);
		
		//--------------code for AutoCompletionText.--- developers.android.com helped.
		// Get a reference to the AutoCompleteTextView in the layout
		favs1 = (InstantAutoComplete) findViewById(R.id.favs1);
		favs2 = (InstantAutoComplete) findViewById(R.id.favs2);
		favs3 = (InstantAutoComplete) findViewById(R.id.favs3);
		favs4 = (InstantAutoComplete) findViewById(R.id.favs4);
		favs5 = (InstantAutoComplete) findViewById(R.id.favs5);
		
		
//		testing = (TextView) findViewById(R.id.testing);
//		testStr = "Test:  All Clear";
//		testing.setText("" + testStr);
				
		// Get the string array
		build_arr = getResources().getStringArray(R.array.buildings_array);
					
		// Create the adapter and set it to the AutoCompleteTextView 
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, build_arr);
		
		favs1.setAdapter(adapter);
		favs2.setAdapter(adapter);
		favs3.setAdapter(adapter);
		favs4.setAdapter(adapter);
		favs5.setAdapter(adapter);
		
				
		//Spinner code.
		roomSpin_1 = (Spinner) findViewById(R.id.room1);
		roomSpin_2 = (Spinner) findViewById(R.id.room2);
		roomSpin_3 = (Spinner) findViewById(R.id.room3);
		roomSpin_4 = (Spinner) findViewById(R.id.room4);
		roomSpin_5 = (Spinner) findViewById(R.id.room5);
		
				
		// Get the string array
		darRooms_primArr = getResources().getIntArray(R.array.darwin_array);
				
		//need to convert for intAdapter
		darRooms_arr = new Integer[darRooms_primArr.length];
		for(int k = 0; k < darRooms_primArr.length; ++k)
			darRooms_arr[k] = Integer.valueOf(darRooms_primArr[k]);
		
		intAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, darRooms_arr);
		
		
		// Create an ArrayAdapter using the string array and a default spinner layout
		ArrayAdapter<CharSequence> spinRoomAdapter = ArrayAdapter.createFromResource(this,
		        R.array.darwin_array, android.R.layout.simple_spinner_item);

		// Specify the layout to use when the list of choices appears
		spinRoomAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		// Apply the adapter to the spinner
		roomSpin_1.setAdapter(spinRoomAdapter);
		roomSpin_2.setAdapter(spinRoomAdapter);
		roomSpin_3.setAdapter(spinRoomAdapter);
		roomSpin_4.setAdapter(spinRoomAdapter);
		roomSpin_5.setAdapter(spinRoomAdapter);
		
		roomListener_1 = new room_1_OnItemSelectedListener(this, this.intAdapter);
		roomListener_2 = new room_2_OnItemSelectedListener(this, this.intAdapter);
		roomListener_3 = new room_3_OnItemSelectedListener(this, this.intAdapter);
		roomListener_4 = new room_4_OnItemSelectedListener(this, this.intAdapter);
		roomListener_5 = new room_5_OnItemSelectedListener(this, this.intAdapter);
		
		roomSpin_1.setOnItemSelectedListener(roomListener_1);
		roomSpin_2.setOnItemSelectedListener(roomListener_2);
		roomSpin_3.setOnItemSelectedListener(roomListener_3);
		roomSpin_4.setOnItemSelectedListener(roomListener_4);
		roomSpin_5.setOnItemSelectedListener(roomListener_5);
		
		myPrefs = getSharedPreferences(PREFERENCE_FILENAME, MODE_PRIVATE);
        myEditor = myPrefs.edit();
        
        build_1 = myPrefs.getString("build_1", "None");
        build_2 = myPrefs.getString("build_2", "None");
        build_3 = myPrefs.getString("build_3", "None");
        build_4 = myPrefs.getString("build_4", "None");
        build_5 = myPrefs.getString("build_5", "None");
        
        favs1.setText(build_1);
        favs2.setText(build_2);
        favs3.setText(build_3);
        favs4.setText(build_4);
        favs5.setText(build_5);
        
        room_1 = myPrefs.getString("room_1", "00");
        
        roomSpin_1.setPrompt(room_1);
		
	}
	
	
	
	
	public class room_1_OnItemSelectedListener implements OnItemSelectedListener {

        ArrayAdapter<Integer> mLocalAdapter;
        Activity mLocalContext;

        
        public room_1_OnItemSelectedListener(Activity c, ArrayAdapter<Integer> ad) {
          this.mLocalContext = c;
          this.mLocalAdapter = ad;
        }

        
        public void onItemSelected(AdapterView<?> parent, View v, int pos, long row) {
        	roomPos_1 = pos;
        	room_1 = parent.getItemAtPosition(pos).toString();
        }

        
        public void onNothingSelected(AdapterView<?> parent) {
            // do nothing
        }
    }
	
	
	
	
	public class room_2_OnItemSelectedListener implements OnItemSelectedListener {

        ArrayAdapter<Integer> mLocalAdapter;
        Activity mLocalContext;

        
        public room_2_OnItemSelectedListener(Activity c, ArrayAdapter<Integer> ad) {
          this.mLocalContext = c;
          this.mLocalAdapter = ad;
        }

        
        public void onItemSelected(AdapterView<?> parent, View v, int pos, long row) {
        	roomPos_2 = pos;
        	room_2 = parent.getItemAtPosition(pos).toString();
        }

        
        public void onNothingSelected(AdapterView<?> parent) {
            // do nothing
        }
    }
	
	
	
	
	public class room_3_OnItemSelectedListener implements OnItemSelectedListener {

        ArrayAdapter<Integer> mLocalAdapter;
        Activity mLocalContext;

        
        public room_3_OnItemSelectedListener(Activity c, ArrayAdapter<Integer> ad) {
          this.mLocalContext = c;
          this.mLocalAdapter = ad;
        }

        
        public void onItemSelected(AdapterView<?> parent, View v, int pos, long row) {
        	roomPos_3 = pos;
        	room_3 = parent.getItemAtPosition(pos).toString();
        }

        
        public void onNothingSelected(AdapterView<?> parent) {
            // do nothing
        }
    }
	
	
	
	
	public class room_4_OnItemSelectedListener implements OnItemSelectedListener {

        ArrayAdapter<Integer> mLocalAdapter;
        Activity mLocalContext;

        
        public room_4_OnItemSelectedListener(Activity c, ArrayAdapter<Integer> ad) {
          this.mLocalContext = c;
          this.mLocalAdapter = ad;
        }

        
        public void onItemSelected(AdapterView<?> parent, View v, int pos, long row) {
        	roomPos_4 = pos;
        	room_4 = parent.getItemAtPosition(pos).toString();
        }

        
        public void onNothingSelected(AdapterView<?> parent) {
            // do nothing
        }
    }
	
	
	
	
	public class room_5_OnItemSelectedListener implements OnItemSelectedListener {

        ArrayAdapter<Integer> mLocalAdapter;
        Activity mLocalContext;

        
        public room_5_OnItemSelectedListener(Activity c, ArrayAdapter<Integer> ad) {
          this.mLocalContext = c;
          this.mLocalAdapter = ad;
        }

        
        public void onItemSelected(AdapterView<?> parent, View v, int pos, long row) {
        	roomPos_5 = pos;
        	room_5 = parent.getItemAtPosition(pos).toString();
        }

        
        public void onNothingSelected(AdapterView<?> parent) {
            // do nothing
        }
    }
	
	
	
	
	
	
	
	
	public void onSaveFavs(View v)
	{
		myEditor.putString("build_1", favs1.getText().toString());
		myEditor.putString("build_2", favs2.getText().toString());
		myEditor.putString("build_3", favs3.getText().toString());
		myEditor.putString("build_4", favs4.getText().toString());
		myEditor.putString("build_5", favs5.getText().toString());
		
		myEditor.putString("room_1", room_1);
		myEditor.putString("room_2", room_2);
		myEditor.putString("room_3", room_3);
		myEditor.putString("room_4", room_4);
		myEditor.putString("room_5", room_5);
    	
    	myEditor.commit();
				
		Intent SaveFavsActivity = new Intent (this, FavoritesActivity.class);
		startActivity(SaveFavsActivity);
	}
	
	
	
	

}