package org.academiadecodigo.bootcamp.model.services;

import org.academiadecodigo.bootcamp.model.subscribers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class PublisherService {

    private List<Subscriber> subscribers = new ArrayList<>();
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        notifyAllObservers(message);
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void notifyAllObservers(String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(message);
        }
    }
}
