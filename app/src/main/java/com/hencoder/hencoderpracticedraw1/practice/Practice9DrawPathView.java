package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        int width = getWidth();
        int height = getHeight();
        int circle_radius = 40;
        int left = (width - circle_radius * 2 * 2) / 2;
        int center_x = left+circle_radius;//第一个圆的圆心x坐标
        int right = center_x + circle_radius * 3;
        int center_y = height / 2;//圆y坐标

        Path path = new Path();
        path.addCircle(center_x,center_y,circle_radius, Path.Direction.CW);
        path.addCircle(center_x+circle_radius*2,center_y,circle_radius,Path.Direction.CW);
        paint.setAntiAlias(true);
        canvas.drawPath(path,paint);
        path.moveTo(left,center_y);
        path.lineTo(right,center_y);
        path.rLineTo(-2*circle_radius,circle_radius*3);
        canvas.drawPath(path,paint);
    }
}
