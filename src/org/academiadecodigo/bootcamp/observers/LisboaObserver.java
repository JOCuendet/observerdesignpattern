package org.academiadecodigo.bootcamp.observers;


import org.academiadecodigo.bootcamp.Subject;

public class LisboaObserver implements Observer {

    private Subject subject;

    public LisboaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        if(subject.getState())
            System.out.println("LisboaObserver awoke!");

        if(!subject.getState())
            System.out.println("LisboaObserver went to sleep");

    }
}
