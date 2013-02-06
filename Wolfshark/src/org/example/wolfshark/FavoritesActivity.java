package org.example.wolfshark;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FavoritesActivity extends Activity {
	
	Button favs1;
	Button favs2;
	Button favs3;
	Button favs4;
	Button favs5;
	
	
	//Button objects have been created and set up in this file 
	//using setText() so that their values can be changed later
	//in the program.  The buttons are currently set up with
	//filler values for demonstration purposes.
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_favs);
		
		favs1 = (Button) findViewById(R.id.favs1);
		favs1.setText("Darwin 31");
		
		favs2 = (Button) findViewById(R.id.favs2);
		favs2.setText("Darwin 109");
		
		favs3 = (Button) findViewById(R.id.favs3);
		favs3.setText("Stevenson 3072");

		favs4 = (Button) findViewById(R.id.favs4);
		favs4.setText("Salazar 2009A");
		
		favs5 = (Button) findViewById(R.id.favs5);
		favs5.setText("Ives 41");
	}
	
	
	
	
	//Used in place of calling the onClick listener - much easier!
	//The button in the activity_favs.xml file must have the attribute:
	//    android:onClick="onEditFavs"
	public void onEditFavs(View v)
	{
		//Add Intent Code here for Screen 6
	}

}
