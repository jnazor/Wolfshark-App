package org.example.wolfshark;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;

public class MapView extends View {

	Paint imgPaint;
	Bitmap mapGraphic = BitmapFactory.decodeResource(getResources(), R.drawable.darwin_basement);
	
	private float mapX = 0;
	private float mapY = 0;
	private float mapZ;
	
	
	public MapView(Context context)
	{
		super(context);
		imgPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		this.setBackgroundColor(Color.WHITE);
	}
	
	@Override
	protected void onDraw(Canvas canvas)
	{
		
		canvas.drawBitmap(mapGraphic, mapX, mapY, imgPaint);
	
	}
	
	public void moveMap(float inputX, float inputY)
	{
		mapX = inputX;
		mapY = inputY;
		
	}
	
	public float getMapX()
	{
		return mapX;
	}
	
	public float getMapY()
	{
		return mapY;
	}
	
}