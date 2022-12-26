package com.example.task7;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class ComponentIterator implements Observer {

    TimerTask task;
    Timer timer = new Timer();
    Image first = new Image("Cos1.jpg");
    Image last = new Image("Cos3.jpg");
    ImageView imageView;
    public ComponentIterator(ImageView imageView){
        this.imageView = imageView;
    }
    @Override
    public void update(Subject st) {
        imageView.setImage(first);
        task = new TimerTask() {
            @Override
            public void run() {

                imageView.setImage(last);
            }
        };
        timer.schedule(task,2500);
    }
}
