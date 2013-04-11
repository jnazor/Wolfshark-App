package org.example.wolfshark;

import android.app.Activity;
import android.content.Intent;
import android.database.CursorIndexOutOfBoundsException;
import android.os.Bundle;

public class OpeningActivity extends Activity {

	//Don't use this class as a good example!
	//I feel there should be a better way to do this
	//but found this on theNewBoston's tutorial
	//and it should work.
	//The use of try, catch, and finally is a good example
	//of Java programming.
	//Also has an Intent example
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		//have to have this
		setContentView(R.layout.activity_open);    //have to have this
		Thread mythread = new Thread(){
			public void run(){
				try{
					sleep(1000);    //3000 milliseconds == 2 seconds
			    	populateDatabase();
				}catch(InterruptedException e){
					//print to console, not to Android device
					System.out.println("Error occurred on Opening Screen.");
				}finally{
					//Use this style of Intent, 
					//     not the one shown in theNewBoston Tutorial 15
					Intent openMain = new Intent(OpeningActivity.this, LocateInputActivity.class);
					startActivity(openMain);
				}
			}
		};
		mythread.start();
	}
	
	private void populateDatabase(){
        DatabaseHandler pd = new DatabaseHandler(this);
		try {
			//right now everytime you open the app, the favorites table will be 
			//populated, no matter what was in them before.
			for (int n = 1; n < 6; n++){
				Favorite one = new Favorite(n, "01", "Anthropology");
				if((one.getBuilding() == null) && (one.getRoom() == null) 
						||((one.getBuilding() == "") && (one.getRoom() == "")))
				{
					pd.addFavorite(one);
				} else {
					pd.deleteFavorite(one);
					pd.addFavorite(one);
				}
			}
		} catch (NullPointerException e) {
					// TODO Auto-generated catch block	
		} catch (CursorIndexOutOfBoundsException e) {
					// TODO Auto-generated catch block
		} 
	}
}
