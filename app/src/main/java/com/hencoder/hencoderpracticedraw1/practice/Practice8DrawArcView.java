package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        int width = getWidth();
        int height = getHeight();
        int rect_width = 300;
        int rect_height = 100;
        int left = (width - rect_width) / 2;
        int top = (height - rect_height) / 2;
        int right = left + rect_width;
        int bottom = top + rect_height;
        RectF rectF = new RectF(left, top, right, bottom);
        canvas.drawArc(rectF,-100,100,true,paint);
        canvas.drawArc(rectF,20,160,false,paint);
        paint.reset();
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(rectF,200,58,false,paint);
    }
}
