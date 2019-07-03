package org.academiadecodigo.bootcamp.observers;

import org.academiadecodigo.bootcamp.Subject;

public class PortoObserver implements Observer {

    private Subject subject;

    public PortoObserver(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        if(subject.getState())
            System.out.println("PortoObserver awoke!");

        if(!subject.getState())
            System.out.println("PortoObserver went to sleep");
    }
}
