package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.controllers.MenuController;
import org.academiadecodigo.bootcamp.model.services.PublisherService;
import org.academiadecodigo.bootcamp.model.subscribers.Client;
import org.academiadecodigo.bootcamp.views.MenuView;

public class Bootstrap {



    public void init() {
        Prompt prompt = new Prompt(System.in,System.out);

        PublisherService publisherService = new PublisherService();

        publisherService.addSubscriber(new Client("Jonathan")); // test account

        MenuView menuView = new MenuView();
        MenuController menuController = new MenuController();

        menuController.setPublisherService(publisherService);
        menuController.setView(menuView);
        menuView.setMenuController(menuController);
        menuView.setPrompt(prompt);
        menuController.init();
    }


}
