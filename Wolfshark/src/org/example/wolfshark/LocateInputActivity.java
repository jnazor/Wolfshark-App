package org.example.wolfshark;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
//import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

public class LocateInputActivity extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_locateinput);
		System.out.println("LocateInputActivity Started.");
	
		//code for AutoCompletetext.
		// Get a reference to the AutoCompleteTextView in the layout
		//InstantAutoComplete textView = (InstantAutoComplete) findViewById(R.id.AutoText1);
		// Get the string array
		String[] buildings = getResources().getStringArray(R.array.buildings_array);
		// Create the adapter and set it to the AutoCompleteTextView 
		ArrayAdapter<String> adapter = 
	        new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, buildings);
		//textView.setAdapter(adapter);
		//end autocomplete
	
		//Spinner code.
		Spinner spinner = (Spinner) findViewById(R.id.building_start);
		Spinner spinner2 = (Spinner) findViewById(R.id.end_building);
		// Create an ArrayAdapter using the string array and a default spinner layout
		ArrayAdapter<CharSequence> spinadapter = ArrayAdapter.createFromResource(this,
		        R.array.buildings_array, android.R.layout.simple_spinner_item);
		// Specify the layout to use when the list of choices appears
		spinadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// Apply the adapter to the spinner
		spinner.setAdapter(spinadapter);
		spinner2.setAdapter(spinadapter);
	
	}
    
    public void onGo(View v)
	{
		Intent myMapPath = new Intent(this, MapPathActivity.class);
		startActivity(myMapPath);
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
