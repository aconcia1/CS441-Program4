package com.example.program4;
import android.graphics.Canvas;
import android.graphics.Point;
import android.widget.ImageView;

@SuppressWarnings("deprecation")
public class Cup implements GameObject{

    private ImageView bowl;

    @Override
    public void draw(Canvas canvas) {

        //bowl = (ImageView)findViewById(R.id.imageView);
        //bowl.setImageResource(R.drawable.Bowl);
    }

    @Override
    public void update() {


    }

    public void update(Point point) {

        bowl.setX(point.x);
        bowl.setY(point.y);
    }
}
