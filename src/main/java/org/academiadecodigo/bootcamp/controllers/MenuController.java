package org.academiadecodigo.bootcamp.controllers;

import org.academiadecodigo.bootcamp.controllers.abstracts.AbstractController;
import org.academiadecodigo.bootcamp.model.services.PublisherService;

public class MenuController extends AbstractController {

    private PublisherService publisherService;
    private AddSubscriberController addSubscriberController;
    @Override
    public void init() {
        view.show();
    }

    public void setPublisherService(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    public void handleMenuInput(int option) {



    }
}
