package org.example.wolfshark;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class CustomView extends View {
	
	public CustomView(Context myContext)
	{
		super(myContext);
	}
	
	protected void onDraw(Canvas myCanvas)
	{
		super.onDraw(myCanvas);
		Paint myPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		myPaint.setColor(Color.BLUE);
		myPaint.setStrokeWidth(10);
		
		myCanvas.drawLine(0, 0, 100, 100, myPaint);
		
	}

}
