package org.example.wolfshark;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;

public class MapView extends View {

	Paint imgPaint;
	Bitmap mapGraphic = BitmapFactory.decodeResource(getResources(), R.drawable.darwin_basement);
	Path thePath;
	Paint pathPaint;

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
		this.setBackgroundColor(Color.WHITE);
		
		imgPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		thePath = new Path();
		
		pathPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		pathPaint.setColor(Color.BLACK);
		pathPaint.setStrokeWidth(3);
		pathPaint.setStyle(Paint.Style.STROKE);
		

	}
	
	@Override
	protected void onDraw(Canvas canvas)
	{

		
		canvas.drawBitmap(mapGraphic, mapX + offsetX, mapY + offsetY, imgPaint);
		
		thePath.reset();
		
		thePath.moveTo(250+offsetX+mapX, 250+offsetY+mapY);
		thePath.lineTo(200+offsetX+mapX, 200+offsetY+mapY);
		thePath.lineTo(600+offsetX+mapX, 200+offsetY+mapY);
		thePath.lineTo(300+offsetX+mapX, 1200+offsetY+mapY);
		canvas.drawPath(thePath, pathPaint);
		
	
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