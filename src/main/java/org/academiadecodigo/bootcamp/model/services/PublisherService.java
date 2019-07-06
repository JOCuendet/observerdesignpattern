package org.academiadecodigo.bootcamp.model.services;

import org.academiadecodigo.bootcamp.model.subscribers.Client;
import org.academiadecodigo.bootcamp.model.subscribers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class PublisherService {

    private List<Subscriber> subscribers = new ArrayList<>();
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void addSubscriber(String name) {
        Client newClientSubscriber = new Client(name);
        subscribers.add(newClientSubscriber);
    }

    public void notifyAllObservers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(message);
        }
    }
}
