package com.mindboardapps.android.example.popupmenuwithdivider;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Copyright © 2017 tomoaki oshima All Rights Reserved.
 */

public class DividerView extends View {

    private final Paint paint;
    private final Path path;
    public DividerView(Context ctx, AttributeSet attributeSet){
        super(ctx, attributeSet);

        paint = new Paint();
        paint.setColor( Color.LTGRAY );

        float dividerStrokeWidth = 1f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth( dividerStrokeWidth );


        path = new Path();
    }
    
    @Override protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = getWidth();
        int height = getHeight();

        float start = 0;
        float end = width;
        float y = height/2f;

        path.reset();
        path.moveTo( start, y );
        path.lineTo( end, y );

        canvas.drawPath(path, paint);
    }
}
