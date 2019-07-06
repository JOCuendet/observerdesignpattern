package org.academiadecodigo.bootcamp.views;

import org.academiadecodigo.bootcamp.controllers.AddSubscriberController;
import org.academiadecodigo.bootcamp.lang.Messages;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.academiadecodigo.bootcamp.views.abstracts.AbstractView;

public class AddSubscriberView extends AbstractView {

    private AddSubscriberController addSubscriberController;

    public void setAddSubscriberController(AddSubscriberController addSubscriberController) {
        this.addSubscriberController = addSubscriberController;
    }

    @Override
    public void show() {
        StringInputScanner subscriberName = new StringInputScanner();
        subscriberName.setMessage(Messages.NEWSUBSCRIPERNAME);
        String name = prompt.getUserInput(subscriberName);
        addSubscriberController.addNewSubscriber(name);
    }
}
