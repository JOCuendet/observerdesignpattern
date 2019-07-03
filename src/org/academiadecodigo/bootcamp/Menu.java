package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.observers.LisboaObserver;
import org.academiadecodigo.bootcamp.observers.PortoObserver;

public class Menu {



    public void init() {
        Subject subject = new Subject();
        new LisboaObserver(subject);
        new PortoObserver(subject);
        System.out.println("went to sleep");
        subject.setState(true);

        System.out.println("awoke");
        subject.setState(false);
    }


}
