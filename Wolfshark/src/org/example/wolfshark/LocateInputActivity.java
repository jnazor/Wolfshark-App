package org.example.wolfshark;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
//import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;
//import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

public class LocateInputActivity extends Activity {
	
	
	//protected int mPos;
	//protected String mSelection;
	private ArrayAdapter<String> adapter;
	private ArrayAdapter<Integer> intAdapter;
	private OnItemSelectedListener spinnerListener;
	private OnItemSelectedListener spinnerListener2;
	private OnItemSelectedListener startRmSpinListener;
	private OnItemSelectedListener endRmSpinListener;
	private Spinner spinner;
	private Spinner spinner2;
	private Spinner startRoomSpin;
	private Spinner endRoomSpin;
	private String[] build_arr;
	private int[] darRooms_primArr;
	private Integer[] darRooms_arr;
	
	//values to be sent to MapPath
	int localStartPos;
    String start_build;
    int localEndPos;
    String end_build;
    int endRmPos;
    String end_room;
    int startRmPos;
    String start_room;
	
	//For Bundle to be passed to MapPath
	public static final String PREFERENCE_FILENAME = "LocatePrefs";
    private SharedPreferences myPrefs;
    SharedPreferences.Editor myEditor;
	
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_locateinput);
		System.out.println("LocateInputActivity Started.");
	
		//code for AutoCompletetext.
		// Get a reference to the AutoCompleteTextView in the layout
		//InstantAutoComplete textView = (InstantAutoComplete) findViewById(R.id.AutoText1);
		
		// Get the string array
		build_arr = getResources().getStringArray(R.array.buildings_array);
		darRooms_primArr = getResources().getIntArray(R.array.darwin_array);
		
		//need to convert for intAdapter
		darRooms_arr = new Integer[darRooms_primArr.length];
		for(int k = 0; k < darRooms_primArr.length; ++k)
			darRooms_arr[k] = Integer.valueOf(darRooms_primArr[k]);
		
		// Create the adapter and set it to the AutoCompleteTextView 
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, build_arr);
		intAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, darRooms_arr);
		
		//textView.setAdapter(adapter);
		//end autocomplete
	
		//Spinner code.
		spinner = (Spinner) findViewById(R.id.building_start);
		spinner2 = (Spinner) findViewById(R.id.end_building);
		startRoomSpin = (Spinner) findViewById(R.id.start_room);
		endRoomSpin = (Spinner) findViewById(R.id.end_room);
		
		
		// Create an ArrayAdapter using the string array and a default spinner layout
		ArrayAdapter<CharSequence> spinadapter = ArrayAdapter.createFromResource(this,
		        R.array.buildings_array, android.R.layout.simple_spinner_item);
		ArrayAdapter<CharSequence> spinIntAdapter = ArrayAdapter.createFromResource(this,
		        R.array.darwin_array, android.R.layout.simple_spinner_dropdown_item);
		
		
		
		// Specify the layout to use when the list of choices appears
		spinadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		//spinIntAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		// Apply the adapter to the spinner
		spinner.setAdapter(spinadapter);
		spinner2.setAdapter(spinadapter);

		startRoomSpin.setAdapter(spinIntAdapter);
		endRoomSpin.setAdapter(spinIntAdapter);
		
		spinnerListener = new startBuildOnItemSelectedListener(this, this.adapter);
		spinnerListener2 = new endBuildOnItemSelectedListener(this, this.adapter);
		startRmSpinListener = new startRoomOnItemSelectedListener(this, this.intAdapter);
		endRmSpinListener = new endRoomOnItemSelectedListener(this, this.intAdapter);
		
		spinner.setOnItemSelectedListener(spinnerListener);
		spinner2.setOnItemSelectedListener(spinnerListener2);
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
	
	
	
	//buildOnItemSelectedListener is based off of the example given in:
	//Android->Samples->Spinner in the Android SDK directory
	public class startBuildOnItemSelectedListener implements OnItemSelectedListener {

        /*
         * provide local instances of the mLocalAdapter and the mLocalContext
         */

        ArrayAdapter<String> mLocalAdapter;
        Activity mLocalContext;
        
        /**
         *  Constructor
         *  @param c - The activity that displays the Spinner.
         *  @param ad - The Adapter view that
         *    controls the Spinner.
         *  Instantiate a new listener object.
         */
        public startBuildOnItemSelectedListener(Activity c, ArrayAdapter<String> ad) {
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
        	localStartPos = pos;
        	start_build = parent.getItemAtPosition(pos).toString();
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
	
	
	
	
	public class endBuildOnItemSelectedListener implements OnItemSelectedListener {

        /*
         * provide local instances of the mLocalAdapter and the mLocalContext
         */

        ArrayAdapter<String> mLocalAdapter;
        Activity mLocalContext;
        
        /**
         *  Constructor
         *  @param c - The activity that displays the Spinner.
         *  @param ad - The Adapter view that
         *    controls the Spinner.
         *  Instantiate a new listener object.
         */
        public endBuildOnItemSelectedListener(Activity c, ArrayAdapter<String> ad) {
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
        	localEndPos = pos;
        	end_build = parent.getItemAtPosition(pos).toString();
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
	
	
	
    
    public void onGo(View v)
	{
    	
    	if(start_build != null && end_build != null /*&& start_room != 0 && end_room != 0*/)
    	{
	    	myEditor.putString("startBuild", start_build);
	    	myEditor.putString("endBuild", end_build);
	    	myEditor.putString("startRoom", start_room);
	    	myEditor.putString("endRoom", end_room);
	    	myEditor.commit();
	    	
	    	Intent myMapPath = new Intent(this, MapPathActivity.class);
			startActivity(myMapPath);
    	}
    	else
    	{
    		Toast.makeText(this, "Make sure that a start and end building and room has been chosen.", 
    				       Toast.LENGTH_SHORT).show();
    	}
//    	myEditor.putFloat("mySum", entry);
//		myEditor.putInt("myCount", count);
//		myEditor.commit();
    	
		
	}
}
    /*Makes AutoCompletTextView Show list even if user hasn't typed anything.
    public class MyAutoCompleteTextView extends AutoCompleteTextView {

        private int myThreshold;

        public MyAutoCompleteTextView(Context context) {
            super(context);
        }

        public MyAutoCompleteTextView(Context context, AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);
        }

        public MyAutoCompleteTextView(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        @Override
        public void setThreshold(int threshold) {
            if (threshold < 1) {
                threshold = 0;
            }
            myThreshold = threshold;
        }

        @Override
        public boolean enoughToFilter() {
            return getText().length() >= myThreshold;
        }

        @Override
        public int getThreshold() {
            return myThreshold;
        }

    }
    
}*/
