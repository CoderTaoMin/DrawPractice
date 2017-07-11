package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        int left = 70;
        int width = 600;
        int height = 370;
        int top = 50;
        final int margin = 10;//直方间隔
        final int rect_count = 7;//直方条数
        final int rect_width = (width-(8*margin))/rect_count;//直方宽

        canvas.drawColor(Color.parseColor("#666699"));//#009966
        Path path = new Path();
        path.moveTo(left, top);
        path.lineTo(left,height);
        path.rLineTo(width,0);
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(path,paint);
        paint.setTextSize(30);
        paint.setAntiAlias(true);
        canvas.drawText("直方图",340,440,paint);
        paint.reset();
        paint.setTextSize(14);
        paint.setColor(Color.WHITE);
        paint.setAntiAlias(true);
        String[] strs = new String[]{"Froyo","GB","ICS","JB","KitKat","L","M"};
        List<Integer> item_positions = new ArrayList<>();
        for (int i=0;i<rect_count;i++){//记录下所有item的起始位置
            int left1 = margin + i * (margin + rect_width)+left;
            item_positions.add(left1);
            canvas.drawText(strs[i],left1,height+20,paint);
        }
    }
}
