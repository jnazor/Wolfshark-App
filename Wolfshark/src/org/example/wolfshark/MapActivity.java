package org.example.wolfshark;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;

public class MapActivity extends Activity
{
	MapView mainView;
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		mainView = new MapView(this);
		mainView.setOnTouchListener(new View.OnTouchListener(){
			
			@Override
			public boolean onTouch(View v, MotionEvent event){

				int action = event.getAction();
				float oldX = mainView.getMapX();
				float oldY = mainView.getMapY();
				
				float newX;
				float newY;
				
				switch(action){
					case MotionEvent.ACTION_UP:
						break;
					case MotionEvent.ACTION_DOWN:
						break;
					case MotionEvent.ACTION_MOVE:{
						newX = event.getX();
						newY = event.getY();
						mainView.moveMap(newX, newY);
						mainView.postInvalidate();
						break;
					}
				}
				return true;
			}
		});
		setContentView(mainView);
	}
	
	public void onNewPath(View v)
	{ }
	
}