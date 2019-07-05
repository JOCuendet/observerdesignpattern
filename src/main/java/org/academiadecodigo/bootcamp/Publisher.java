package main.java.org.academiadecodigo.bootcamp;

import main.java.org.academiadecodigo.bootcamp.subscribers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        notifyAllObservers(message);
    }

    public void attach(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void notifyAllObservers(String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(message);
        }
    }
}
