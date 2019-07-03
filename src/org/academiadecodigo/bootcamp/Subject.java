package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private boolean state;

    public boolean getState() {
        return state;
    }

    public void setState(boolean sleep) {
        if(!sleep){
            this.state = true;
        }else{
            this.state = false;
        }

        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
