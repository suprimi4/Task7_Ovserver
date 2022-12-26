package com.example.task7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    public TextField TimeArea;
    public ImageView iView;
    public HBox downloadBox;
    TimeServer timeServer = new TimeServer();
    ComponentTimer compTimer;
    ComponentIterator compIter;

    ComponentLoader compLoad;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        compTimer = new ComponentTimer(TimeArea);
        compIter = new ComponentIterator(iView);
        compLoad = new ComponentLoader();
        downloadBox.getChildren().add(compLoad.load);
        downloadBox.getChildren().add(compLoad.txt);

    }


    public void TimerStart(ActionEvent actionEvent) {
        timeServer.attach(compTimer);
    }

    public void TimerStop(ActionEvent actionEvent) {
        timeServer.detach(compTimer);
    }

    public void startServer(ActionEvent actionEvent) {
        timeServer.start();
    }

    public void stopServer(ActionEvent actionEvent) {
        timeServer.stop();
    }

    public void imageStart(ActionEvent actionEvent) {
        timeServer.attach(compIter);
    }

    public void imageStop(ActionEvent actionEvent) {
        timeServer.detach(compIter);
    }

    public void startDownload(ActionEvent actionEvent) {

        timeServer.attach(compLoad);
    }

    public void stopDownload(ActionEvent actionEvent) {
        timeServer.detach(compLoad);

    }
}