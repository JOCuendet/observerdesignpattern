package org.academiadecodigo.bootcamp.model.subscribers;

import org.academiadecodigo.bootcamp.model.services.PublisherService;

public class Client implements Subscriber {
    private PublisherService publisher;

    protected String name;

    public Client(String name) {
        this.name = name;

    }

    public void setPublisher(PublisherService publisher) {
        this.publisher = publisher;
    }

    @Override
    public void update(String message) {
        System.out.println("\n Hello "+name+"\n you have received a message from the publisher!\n\n");
        System.out.println("Publisher Message: "+ message +"\n");
    }
}
