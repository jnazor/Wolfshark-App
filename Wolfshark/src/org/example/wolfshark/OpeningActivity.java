package org.example.wolfshark;

import android.app.Activity;
import android.content.Intent;
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
					sleep(2000);    //3000 milliseconds == 2 seconds
				}catch(InterruptedException e){
					//print to console, not to Android device
					System.out.println("Error occurred on Opening Screen.");
				}finally{
					//Use this style of Intent, 
					//     not the one shown in theNewBoston Tutorial 15
					Intent openMain = new Intent(OpeningActivity.this, MainActivity.class);
					startActivity(openMain);
				}
			}
		};
		mythread.start();
	}	
}
