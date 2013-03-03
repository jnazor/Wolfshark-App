package org.example.wolfshark;

import android.app.Activity;
import android.content.Intent;
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
	//in the program.
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_favs);
		
		DatabaseHandler db = new DatabaseHandler(this);
		
		Favorite fav1 = db.getFavorite(1);
		Favorite fav2 = db.getFavorite(2);
		Favorite fav3 = db.getFavorite(3);
		Favorite fav4 = db.getFavorite(4);
		Favorite fav5 = db.getFavorite(5);
		
		favs1 = (Button) findViewById(R.id.favs1);
		favs1.setText("" + fav1.getBuilding() + " " + fav1.getRoom()); 
		
		favs2 = (Button) findViewById(R.id.favs2);
		favs2.setText("" + fav2.getBuilding() + " " + fav2.getRoom()); 
		
		favs3 = (Button) findViewById(R.id.favs3);
		favs3.setText("" + fav3.getBuilding() + " " + fav3.getRoom()); 
		
		favs4 = (Button) findViewById(R.id.favs4);
		favs4.setText("" + fav4.getBuilding() + " " + fav4.getRoom()); 
		
		favs5 = (Button) findViewById(R.id.favs5);
		favs5.setText("" + fav5.getBuilding() + " " + fav5.getRoom()); 
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