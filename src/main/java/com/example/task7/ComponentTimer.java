package com.example.task7;

import javafx.scene.control.TextField;

public class ComponentTimer implements  Observer {
    private int hours;
    private int minutes;
    private int seconds;
    private TextField textField;

    public ComponentTimer(TextField textField) {
        hours = 0;
        minutes = 0;
        seconds = 0;
        this.textField = textField;
    }

    @Override
    public void update(Subject st) {
        double timer = st.getState();
        hours = (int)Math.floor(timer / 60 / 60);
        minutes = (int)Math.floor(timer / 60);
        seconds = (int)(timer % 60);
        textField.setText("Время: " + hours + " ч, " + minutes + " м, " + seconds + " сек");
    }
}
