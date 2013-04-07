package org.example.wolfshark;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.DisplayMetrics;
import android.view.View;

public class CustomView extends View {
	
	Paint imgPaint;
	Bitmap mapGraphic_1 = BitmapFactory.decodeResource(getResources(), R.drawable.campus_map_nw);
	Bitmap mapGraphic_2 = BitmapFactory.decodeResource(getResources(), R.drawable.campus_map_ne);
	Bitmap mapGraphic_3 = BitmapFactory.decodeResource(getResources(), R.drawable.campus_map_sw);
	Bitmap mapGraphic_4 = BitmapFactory.decodeResource(getResources(), R.drawable.campus_map_se);
	Path thePath;
	Paint pathPaint;

	int mapX = 0;
	int mapY = 0;
	
	int testx = 0;
	int testy = 0;
	
	public int offsetX = 0;
	public int offsetY = 0;

	int startX;
	int startY;
	
	final int locate_x = 840;
	final int locate_y = 860;
	
	int coord_x = 0;
	int coord_y = 0;
	
	DisplayMetrics metrics;
	
	boolean moved = false;
	
	public CustomView(Context myContext)
	{
		super(myContext);
		this.setBackgroundColor(Color.WHITE);
		
		metrics = getResources().getDisplayMetrics();
		
		imgPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		thePath = new Path();
		
//		pathPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
//		pathPaint.setColor(Color.BLACK);
//		pathPaint.setStrokeWidth(3);
//		pathPaint.setStyle(Paint.Style.STROKE);
		
		
		pathPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		pathPaint.setColor(Color.BLUE);
		//pathPaint.setStrokeWidth(3);
		pathPaint.setStyle(Paint.Style.FILL);
		
		coord_x = (mapGraphic_1.getWidth() - 1200) * (400 / mapGraphic_1.getDensity());
		coord_y = (mapGraphic_1.getHeight() - 1200) * (400 / mapGraphic_1.getDensity());
		
		
	}
	
	
	@Override
	protected void onDraw(Canvas canvas)
	{

		
		canvas.drawBitmap(mapGraphic_1, mapX + offsetX, mapY + offsetY, imgPaint);
		canvas.drawBitmap(mapGraphic_2, mapX + offsetX + mapGraphic_1.getWidth(), mapY + offsetY, imgPaint);
		canvas.drawBitmap(mapGraphic_3, mapX + offsetX, mapY + offsetY + mapGraphic_1.getHeight(), imgPaint);
		canvas.drawBitmap(mapGraphic_4, mapX + offsetX + mapGraphic_1.getWidth(), mapY + offsetY + mapGraphic_2.getHeight(), imgPaint);
		
		thePath.reset();
		
//		thePath.moveTo(250+offsetX+mapX, 250+offsetY+mapY);
//		thePath.lineTo(200+offsetX+mapX, 200+offsetY+mapY);
//		thePath.lineTo(600+offsetX+mapX, 200+offsetY+mapY);
//		thePath.lineTo(300+offsetX+mapX, 1200+offsetY+mapY);
		
		thePath.addCircle(locate_x + mapX + offsetX + coord_x, locate_y + mapY + offsetY + coord_y, 25, Path.Direction.CW);
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
