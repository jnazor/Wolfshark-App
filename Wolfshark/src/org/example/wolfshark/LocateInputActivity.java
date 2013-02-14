package org.example.wolfshark;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
//import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

public class LocateInputActivity extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_locateinput);
		System.out.println("LocateInputActivity Started.");
	
		/*
		//code for AutoCompletetext.
		// Get a reference to the AutoCompleteTextView in the layout
		AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
		// Get the string array
		String[] buildings = getResources().getStringArray(R.array.buildings_array);
		// Create the adapter and set it to the AutoCompleteTextView 
		ArrayAdapter<String> adapter = 
	        new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, buildings);
		textView.setAdapter(adapter);
		//end autocomplete	*/
	
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
