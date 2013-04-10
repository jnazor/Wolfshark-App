package org.example.wolfshark;

import java.util.Arrays;
import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class LocateInputActivity extends Activity {
	
	private ArrayAdapter<String> adapter;
	private ArrayAdapter<Integer> intAdapter;
	private OnItemSelectedListener startRmSpinListener;
	private OnItemSelectedListener endRmSpinListener;
	private Spinner startRoomSpin;
	private Spinner endRoomSpin;
	private String[] build_arr;
	private int[] darRooms_primArr;
	private Integer[] darRooms_arr;
	
	InstantAutoComplete textView1;
	InstantAutoComplete textView2;
	
	//values to be sent to MapPath
	int localStartPos;
    String start_build;
    int localEndPos;
    String end_build;
    int endRmPos;
    String end_room;
    int startRmPos;
    String start_room;
    int start_pos = 0;
    int end_pos = 0;
    
    private List<Favorite> favList;
    private String[] favs = new String[5];
	
	//For Bundle to be passed to MapPath
	public static final String PREFERENCE_FILENAME = "LocatePrefs";
    private SharedPreferences myPrefs;
    SharedPreferences.Editor myEditor;
	
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_locateinput);
		System.out.println("LocateInputActivity Started.");
		
		//--------------code for AutoCompletionText.--- developers.android.com helped.
		// Get a reference to the AutoCompleteTextView in the layout
		textView1 = (InstantAutoComplete) findViewById(R.id.AutoText1);
		textView2 = (InstantAutoComplete) findViewById(R.id.AutoText2);
		

		// Get the string array
		build_arr = getResources().getStringArray(R.array.buildings_array);
				
		// Create the adapter and set it to the AutoCompleteTextView 
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, build_arr);
		
		textView1.setAdapter(adapter);
		textView2.setAdapter(adapter);
		
		//Spinner code.
		startRoomSpin = (Spinner) findViewById(R.id.start_room);
		endRoomSpin = (Spinner) findViewById(R.id.end_room);
		
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
		startRoomSpin.setAdapter(spinRoomAdapter);
		endRoomSpin.setAdapter(spinRoomAdapter);
		
		startRmSpinListener = new startRoomOnItemSelectedListener(this, this.intAdapter);
		endRmSpinListener = new endRoomOnItemSelectedListener(this, this.intAdapter);
		
		startRoomSpin.setOnItemSelectedListener(startRmSpinListener);
		endRoomSpin.setOnItemSelectedListener(endRmSpinListener);
	
		myPrefs = getSharedPreferences(PREFERENCE_FILENAME, MODE_PRIVATE);
        myEditor = myPrefs.edit();
        
        localStartPos = 0;
        start_build = null;
        localEndPos = 0;
        end_build = null;
        endRmPos = 0;
        end_room = null;
        startRmPos = 0;
        start_room = null;
	}
	

	public class startRoomOnItemSelectedListener implements OnItemSelectedListener {

        /*
         * provide local instances of the mLocalAdapter and the mLocalContext
         */

        ArrayAdapter<Integer> mLocalAdapter;
        Activity mLocalContext;

        /**
         *  Constructor
         *  @param c - The activity that displays the Spinner.
         *  @param ad - The Adapter view that
         *    controls the Spinner.
         *  Instantiate a new listener object.
         */
        public startRoomOnItemSelectedListener(Activity c, ArrayAdapter<Integer> ad) {
          this.mLocalContext = c;
          this.mLocalAdapter = ad;
        }

        /**
         * When the user selects an item in the spinner, this method is invoked by the callback
         * chain. Android calls the item selected listener for the spinner, which invokes the
         * onItemSelected method.
         *
         * @see android.widget.AdapterView.OnItemSelectedListener#onItemSelected(
         *  android.widget.AdapterView, android.view.View, int, long)
         * @param parent - the AdapterView for this listener
         * @param v - the View for this listener
         * @param pos - the 0-based position of the selection in the mLocalAdapter
         * @param row - the 0-based row number of the selection in the View
         */
        public void onItemSelected(AdapterView<?> parent, View v, int pos, long row) {
        	startRmPos = pos;
        	start_room = parent.getItemAtPosition(pos).toString();
        }

        /**
         * The definition of OnItemSelectedListener requires an override
         * of onNothingSelected(), even though this implementation does not use it.
         * @param parent - The View for this Listener
         */
        public void onNothingSelected(AdapterView<?> parent) {
            // do nothing
        }
    }
	
	public class endRoomOnItemSelectedListener implements OnItemSelectedListener {

        /*
         * provide local instances of the mLocalAdapter and the mLocalContext
         */

        ArrayAdapter<Integer> mLocalAdapter;
        Activity mLocalContext;


        /**
         *  Constructor
         *  @param c - The activity that displays the Spinner.
         *  @param ad - The Adapter view that
         *    controls the Spinner.
         *  Instantiate a new listener object.
         */
        public endRoomOnItemSelectedListener(Activity c, ArrayAdapter<Integer> ad) {
          this.mLocalContext = c;
          this.mLocalAdapter = ad;
        }

        /**
         * When the user selects an item in the spinner, this method is invoked by the callback
         * chain. Android calls the item selected listener for the spinner, which invokes the
         * onItemSelected method.
         *
         * @see android.widget.AdapterView.OnItemSelectedListener#onItemSelected(
         *  android.widget.AdapterView, android.view.View, int, long)
         * @param parent - the AdapterView for this listener
         * @param v - the View for this listener
         * @param pos - the 0-based position of the selection in the mLocalAdapter
         * @param row - the 0-based row number of the selection in the View
         */
        public void onItemSelected(AdapterView<?> parent, View v, int pos, long row) {
        	endRmPos = pos;
        	end_room = parent.getItemAtPosition(pos).toString();
        }

        /**
         * The definition of OnItemSelectedListener requires an override
         * of onNothingSelected(), even though this implementation does not use it.
         * @param parent - The View for this Listener
         */
        public void onNothingSelected(AdapterView<?> parent) {
            // do nothing
        }
    }
	

	public void onFavorites(View f) {
		// Do stuff
		DatabaseHandler db = new DatabaseHandler(this);
		favList = db.getAllFavorites(); 
		for (int i = 0; i < favList.size(); i++){
			favs[i] = favList.get(i).getBuilding() + " " + favList.get(i).getRoom();
			// For logcat purposes only. you get to see what's happening with the database.
			String log = favList.get(i).getBuilding() + " " + favList.get(i).getRoom();
			Log.d("Testing", log);
		}
		
		switch (f.getId()) {
		        case R.id.startFav: // doStuff
		        	AlertDialog.Builder builder = new AlertDialog.Builder(this);
		        	builder.setTitle("Your Places");
		        	builder.setItems(favs, new DialogInterface.OnClickListener() {
		        		public void onClick(DialogInterface dialog, int fav) {
		        			String choice = favs[fav];
		        			
		        			Toast.makeText(getBaseContext(), choice, Toast.LENGTH_SHORT).show();	
						}
		        	});
		        	AlertDialog alert = builder.create();
		        	alert.show();
		            break;
		        case R.id.endFav: // doStuff
		        	AlertDialog.Builder endbuilder = new AlertDialog.Builder(this);
		        	endbuilder.setTitle("Your Favorites");
		        	endbuilder.setItems(favs, new DialogInterface.OnClickListener() {
		        		public void onClick(DialogInterface dialog, int fav) {
		        			String choice = favs[fav];
		        			
		        			Toast.makeText(getBaseContext(), choice, Toast.LENGTH_SHORT).show();	
						}
		        	});
		        	AlertDialog endalert = endbuilder.create();
		        	endalert.show();
		        	break;
		}
	}	
	
	public boolean isCorrectName(String name)
	{		
		for(int i = 0; i < build_arr.length; ++i)
			if(name.equals(build_arr[i]))
				return true;
		
		return false;
	}
	
    public void onGo(View v)
	{
    	start_build = textView1.getText().toString();
    	end_build = textView2.getText().toString();
    	start_pos = Arrays.asList(build_arr).indexOf(start_build);
    	end_pos = Arrays.asList(build_arr).indexOf(end_build);
    	
    	Toast.makeText(this, "Start Position: " + start_pos + "    End Position:  " + end_pos, Toast.LENGTH_LONG).show();
    	
    	if(start_build != null && end_build != null && isCorrectName(start_build) && isCorrectName(end_build))
    	{
	    	myEditor.putString("startBuild", start_build);
	    	myEditor.putString("endBuild", end_build);
	    	myEditor.putString("startRoom", start_room);
	    	myEditor.putString("endRoom", end_room);
	    	myEditor.putInt("startPos", start_pos);
	    	myEditor.putInt("endPos", end_pos);
	    	myEditor.commit();
	    	
	    	Intent myMapPath = new Intent(this, MapPathActivity.class);
			startActivity(myMapPath);
    	}
    	else
    	{
    		Toast.makeText(this, "Make sure that a start and end building and room has been chosen, "
    				       + "and that all buidling names have been spelled correctly. ",
    				       Toast.LENGTH_SHORT).show();
    	}
		
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
	    		Intent favoritesActivity = new Intent (this, EditFavsActivity.class);
	    		startActivity(favoritesActivity);
	        	break;
        	case R.id.mapmenu:
        		Intent mapView = new Intent (this, MapActivity.class);
        		startActivity(mapView);
        		break;
        	case R.id.aboutmenu:
        		TextView myView = new TextView(getApplicationContext());
        		myView.setText(R.string.about_text);
        		myView.setBackgroundColor(getResources().getColor(R.color.gray));
        		myView.setTextColor(getResources().getColor(R.color.white));
        			
        		// 1. Instantiate an AlertDialog.Builder with its constructor
        		AlertDialog.Builder b = new AlertDialog.Builder(LocateInputActivity.this);

        		// 2. Chain together various setter methods to set the dialog characteristics
        		b.setView(myView);
        		
        		// 3. Get the AlertDialog from create()
        		AlertDialog dialog = b.create();
        		dialog.setButton(DialogInterface.BUTTON_POSITIVE, "Close", new DialogInterface.OnClickListener() {
        		       public void onClick(DialogInterface dialog, int id) {
        		            dialog.dismiss();
        		       }});
        		
        		dialog.show();
        		
	            break;
        	default:
                return super.onOptionsItemSelected(item);
        }
        return super.onOptionsItemSelected(item);
    } 
 
}


/*  This is the test code for the options menu. It's correct version is implemented above.
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
        	case R.id.favoritesmenu:
	    		Intent favoritesActivity = new Intent (this, EditFavsActivity.class);
	    		startActivity(favoritesActivity);
	        	break;
        	case R.id.mapmenu:
        		Intent mapView = new Intent (this, MapActivity.class);
        		startActivity(mapView);
        		break;
        	case R.id.aboutmenu:
        		Intent about = new Intent (this, AboutActivity.class);
        		startActivity(about);
        		TextView myView = new TextView(getApplicationContext());
        		myView.setText(R.string.about_text);
        		
        		// 1. Instantiate an AlertDialog.Builder with its constructor
        		AlertDialog.Builder builder = new AlertDialog.Builder(LocateInputActivity.this);

        		// 2. Chain together various setter methods to set the dialog characteristics
        		builder.setView(myView);
        		builder.setTitle(R.string.about);

        		// 3. Get the AlertDialog from create()
        		AlertDialog dialog = builder.create();
        		dialog.show();
        		
        		AlertDialog.Builder abbuilder = new AlertDialog.Builder(this);
	    	    abbuilder.setMessage(R.string.about_text);
		        AlertDialog alert = abbuilder.create();
		        alert.show();
	            break;
	            
            	AlertDialog am = new AlertDialog.Builder(this).create();  
            	am.setCancelable(false); // This blocks the 'BACK' button  
            	am.setMessage(getBaseContext().getString(R.string.about_text));  
            	am.setButton("OK", new DialogInterface.OnClickListener() {  
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
        //return onOptionsItemSelected(item);      //not this return statement
        return super.onOptionsItemSelected(item);  //apparently the function must have this return statement.
    } 
 
}*/