package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice4DrawPointView extends View {

    public Practice4DrawPointView(Context context) {
        super(context);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPoint() 方法画点
//        一个圆点，一个方点
//        圆点和方点的切换使用 paint.setStrokeCap(cap)：`ROUND` 是圆点，`BUTT` 或 `SQUARE` 是方点

        int width = getWidth();
        int height = getHeight();
        int rect_width = 50;//正方形宽和圆直径都为40
        int margin = 260;//水平间隔200
        int left = (width - margin-rect_width * 2) / 2;
        int top = (height - rect_width) / 2;


        //圆点
        paint.setAntiAlias(true);
        paint.setStrokeWidth(rect_width);
        paint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoint(left,top,paint);
        paint.reset();
        //方点
        paint.setAntiAlias(true);
        paint.setStrokeWidth(rect_width);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawPoint(left+margin,top,paint);
    }
}
