package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.controllers.*;
import org.academiadecodigo.bootcamp.controllers.interfaces.Controller;
import org.academiadecodigo.bootcamp.lang.SlidesMessages;
import org.academiadecodigo.bootcamp.lang.UserOptions;
import org.academiadecodigo.bootcamp.model.services.PublisherService;
import org.academiadecodigo.bootcamp.model.services.Slide;
import org.academiadecodigo.bootcamp.views.AddSubscriberView;
import org.academiadecodigo.bootcamp.views.MenuView;
import org.academiadecodigo.bootcamp.views.PresentationView;
import org.academiadecodigo.bootcamp.views.SendBroadCastView;
import org.academiadecodigo.bootcamp.views.slides.Slide1View;

import java.util.HashMap;
import java.util.Map;

public class Bootstrap {



    public void init() {
        Prompt prompt = new Prompt(System.in,System.out);

        PublisherService publisherService = new PublisherService();

        MenuView menuView = new MenuView();
        MenuController menuController = new MenuController();

        menuController.setPublisherService(publisherService);
        menuController.setView(menuView);
        menuView.setMenuController(menuController);
        menuView.setPrompt(prompt);

        AddSubscriberController addSubscriberController = new AddSubscriberController();
        AddSubscriberView addSubscriberView = new AddSubscriberView();
        addSubscriberController.setPublisherService(publisherService);
        addSubscriberController.setView(addSubscriberView);
        addSubscriberView.setAddSubscriberController(addSubscriberController);
        addSubscriberView.setPrompt(prompt);

        SendBroadCastController sendBroadCastController = new SendBroadCastController();
        SendBroadCastView sendBroadCastView = new SendBroadCastView();
        sendBroadCastController.setPublisherService(publisherService);
        sendBroadCastController.setView(sendBroadCastView);
        sendBroadCastView.setSendBroadCastController(sendBroadCastController);
        sendBroadCastView.setPrompt(prompt);

        PresentationController presentationController = new PresentationController();
        PresentationView presentationView = new PresentationView();
        presentationView.setPrompt(prompt);
        presentationView.setPresentationController(presentationController);
        presentationController.setView(presentationView);
        presentationController.setSlide(new Slide(SlidesMessages.SLIDE1));

        Slide1Controller slide1Controller = new Slide1Controller();
        Slide1View slide1View = new Slide1View();
        slide1Controller.setSlide(new Slide(SlidesMessages.SLIDE2));
        slide1Controller.setView(slide1View);
        slide1View.setSlide1Controller(slide1Controller);

        //next Slides Declarations
        presentationController.setNextController(slide1Controller);
        slide1Controller.setNextController(null);

        Map<Integer, Controller> menuOptions = new HashMap<>();
        menuOptions.put(UserOptions.MENU_OPTION_START_PRESENTATION.getOption(), presentationController);
        menuOptions.put(UserOptions.MENU_OPTION_ADD_SUBSCRIBER.getOption(), addSubscriberController);
        menuOptions.put(UserOptions.MENU_OPTION_SEND_BROADCAST.getOption(), sendBroadCastController);

        menuController.setMenuOptions(menuOptions);

        menuController.init(); // must be in last line of the bootstrap. Entry Point of program.
    }
}
