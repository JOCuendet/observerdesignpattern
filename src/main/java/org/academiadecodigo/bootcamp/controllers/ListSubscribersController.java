package org.academiadecodigo.bootcamp.controllers;

import org.academiadecodigo.bootcamp.controllers.abstracts.AbstractController;
import org.academiadecodigo.bootcamp.model.services.PublisherService;

public class ListSubscribersController extends AbstractController {

    private PublisherService publisherService;

    public void setPublisherService(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    public String getSubscribersList() {
        return publisherService.getSubscribersList();
    }
}
