package org.academiadecodigo.bootcamp.controllers;

import org.academiadecodigo.bootcamp.controllers.abstracts.AbstractController;
import org.academiadecodigo.bootcamp.controllers.interfaces.Controller;
import org.academiadecodigo.bootcamp.lang.Messages;
import org.academiadecodigo.bootcamp.model.services.PublisherService;

import java.util.Map;

public class MenuController extends AbstractController {

    private PublisherService publisherService;
    private AddSubscriberController addSubscriberController;
    private Map<Integer, Controller> menuOptions;

    public void setMenuOptions(Map<Integer, Controller> menuOptions) {
        this.menuOptions = menuOptions;
    }

    public void setPublisherService(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    public void handleMenuInput(int option) {

        if (!menuOptions.containsKey(option)) {
            throw new IllegalStateException(Messages.SYSTEM_ERROR);
        }

        menuOptions.get(option).init();

    }
}
