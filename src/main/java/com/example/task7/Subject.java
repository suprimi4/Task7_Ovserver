package com.example.task7;


public interface Subject {

    void notifyAllObserver();

    void attach(Observer obs);
    void detach(Observer obs);
    int getState();
}
