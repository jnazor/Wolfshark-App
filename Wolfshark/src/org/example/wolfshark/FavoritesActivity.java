package org.example.wolfshark;

import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.database.CursorIndexOutOfBoundsException;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FavoritesActivity extends Activity {
	
	Button favs1;
	Button favs2;
	Button favs3;
	Button favs4;
	Button favs5;
	DatabaseHandler db;
	Favorite favList;
	
	//Button objects have been created and set up in this file 
	//using setText() so that their values can be changed later
	//in the program.
		
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_favs);
		
//		favs1 = (Button) findViewById(R.id.favs1);
//		favs1.setText("Loading...");
//		favs2 = (Button) findViewById(R.id.favs2);
//		favs2.setText("Loading...");
//		favs3 = (Button) findViewById(R.id.favs3);
//		favs3.setText("Loading...");
//		favs4 = (Button) findViewById(R.id.favs4);
//		favs4.setText("Loading...");
//		favs5 = (Button) findViewById(R.id.favs5);
//		favs5.setText("Loading...");
		//For the AsyncTask if it ever gets implemented.
//		new QueryDatabase().execute();
		
		DatabaseHandler db = new DatabaseHandler(this);
		List<Favorite> favList = db.getAllFavorites();
		
		try {
			String[] favs = new String[5];
			for (int i = 0; i < favList.size(); i++){
				favs[i] = favList.get(i).getBuilding() + " " + favList.get(i).getRoom();
				// For logcat purposes only. you get to see what's happening with the database.
//				String log = favList.get(i).getBuilding() + " " + favList.get(i).getRoom();
//				Log.d("Testing", log);
			}
			favs1 = (Button) findViewById(R.id.favs1);
			favs1.setText(favs[0]); 
			
			favs2 = (Button) findViewById(R.id.favs2);
			favs2.setText(favs[1]); 
			
			favs3 = (Button) findViewById(R.id.favs3);
			favs3.setText(favs[2]); 
			
			favs4 = (Button) findViewById(R.id.favs4);
			favs4.setText(favs[3]); 
			
			favs5 = (Button) findViewById(R.id.favs5);
			favs5.setText(favs[4]);    
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
		} catch (CursorIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
		} 
	}
//	-- Eventually we might have to implement something like this to update the database in the background. 
//	 private class QueryDatabase extends AsyncTask<Void, Void, Void> {
//		 @Override
//			protected void onPostExecute(Void result) {
//				// TODO Auto-generated method stub
//			 try{
//				
//				favs1 = (Button) findViewById(R.id.favs1);
//				favs1.setText("" + fav1.getBuilding() + " " + fav1.getRoom()); 
//				
//				favs2 = (Button) findViewById(R.id.favs2);
//				favs2.setText("" + fav2.getBuilding() + " " + fav2.getRoom()); 
//				
//				favs3 = (Button) findViewById(R.id.favs3);
//				favs3.setText("" + fav3.getBuilding() + " " + fav3.getRoom()); 
//				
//				favs4 = (Button) findViewById(R.id.favs4);
//				favs4.setText("" + fav4.getBuilding() + " " + fav4.getRoom()); 
//				
//				favs5 = (Button) findViewById(R.id.favs5);
//				favs5.setText("" + fav5.getBuilding() + " " + fav5.getRoom());    
//			 } catch (NullPointerException e) {
//					// TODO Auto-generated catch block
//			 }
//			 loaded();
//
//			}
//
//			@Override
//			protected void onPreExecute() {
//				// TODO Auto-generated method stub
//				Loading();
//			}
//
//			@Override
//			protected void onProgressUpdate(Void... values) {
//				// TODO Auto-generated method stub
//				super.onProgressUpdate(values);
//			}
//			
//		 protected Void doInBackground(Void... arg0){
//				try {
//					fav1 = db.getFavorite(1);
//					fav2 = db.getFavorite(2);
//					fav3 = db.getFavorite(3);
//					fav4 = db.getFavorite(4);
//					fav5 = db.getFavorite(5);
//				} catch (NullPointerException e) {
//					// TODO Auto-generated catch block
//				} catch (CursorIndexOutOfBoundsException e) {
//					// TODO Auto-generated catch block
//				}
//				return null; 
//		 }		 
//	 }
//	 
//	 private void Loading(){
//		 Toast.makeText(this, "Loading, Please wait.", Toast.LENGTH_LONG).show();
//	 }
//
//	 private void loaded(){
//		 Toast.makeText(this, "Loaded!", Toast.LENGTH_LONG).show();
//	 }

	//Used in place of calling the onClick listener - much easier!
	//The button in the activity_favs.xml file must have the attribute:
	//    android:onClick="onEditFavs"
	public void onEditFavs(View v)
	{
		Intent EditFavsActivity = new Intent (this, EditFavsActivity.class);
		startActivity(EditFavsActivity);
	}
	
	public void onFavs1(View v){
			// Do stuff
		 	AlertDialog ab2 = new AlertDialog.Builder(this).create();
		 	ab2.setMessage(favList.getBuilding()+" "+favList.getRoom());
        	ab2.show();	
    }
};