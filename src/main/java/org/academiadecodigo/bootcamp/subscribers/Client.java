package main.java.org.academiadecodigo.bootcamp.subscribers;

import main.java.org.academiadecodigo.bootcamp.Publisher;

public class Client implements Subscriber{
    private Publisher publisher;
    protected String name;
    private String message;

    public Client(Publisher publisher) {
        this.publisher = publisher;
        this.publisher.attach(this);
    }
    @Override
    public void update(String message) {
        System.out.println("\n Hello "+name+"\n you have received a message from the publisher!\n\n");
        System.out.println("Publisher Message: "+ message +"\n");
    }
}
