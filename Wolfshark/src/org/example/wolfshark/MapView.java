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
	

	int mapX = 0;
	int mapY = 0;
	
	int testx = 0;
	int testy = 0;
	
	public int offsetX = 0;
	public int offsetY = 0;

	private int mapZ;
	int startX;
	int startY;
	
	boolean moved = false;
	
	public MapView(Context context)
	{
		super(context);
		imgPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		this.setBackgroundColor(Color.WHITE);
	}
	
	@Override
	protected void onDraw(Canvas canvas)
	{
		
		canvas.drawBitmap(mapGraphic, mapX + offsetX, mapY + offsetY, imgPaint);
	
	}
	
	public void moveMap(int inputX, int inputY)
	{


	}
	
	public int getMapX()
	{
		return mapX;
	}
	
	public int getMapY()
	{
		return mapY;
	}
	
}