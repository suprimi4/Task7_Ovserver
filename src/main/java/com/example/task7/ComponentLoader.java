package com.example.task7;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class ComponentLoader implements Observer {

    Rectangle load = new Rectangle();
    Text txt = new Text();
    private int countX = 0;
    @Override
    public void update(Subject st) {
        load.setX(countX);
        load.setY(countX);
        countX++;
        txt.setText(""+ countX+"%");
        load.setStroke(Color.BLACK);
        load.setFill(Color.BLUE);
        load.setStrokeWidth(2);
        load.setWidth(countX);
        load.setHeight(25);


    }
}
