package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice5DrawOvalView extends View {

    public Practice5DrawOvalView(Context context) {
        super(context);
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawOval() 方法画椭圆
        int width = getWidth();
        int height = getHeight();
        int oval_width = 200;
        int oval_height = 100;
        float left = (width - oval_width) / 2;
        float top = (height - oval_height) / 2;
        float right = left + oval_width;
        float bottom = top + oval_height;
        paint.setAntiAlias(true);
        RectF rectF = new RectF(left, top, right, bottom);
        canvas.drawOval(rectF,paint);
    }
}
