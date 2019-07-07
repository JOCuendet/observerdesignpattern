package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.controllers.*;
import org.academiadecodigo.bootcamp.controllers.interfaces.Controller;
import org.academiadecodigo.bootcamp.lang.UserOptions;
import org.academiadecodigo.bootcamp.model.services.PublisherService;
import org.academiadecodigo.bootcamp.model.services.Slide;
import org.academiadecodigo.bootcamp.views.AddSubscriberView;
import org.academiadecodigo.bootcamp.views.ListSubscribersView;
import org.academiadecodigo.bootcamp.views.MenuView;
import org.academiadecodigo.bootcamp.views.SendBroadCastView;
import org.academiadecodigo.bootcamp.views.slides.SlideView;
import org.academiadecodigo.bootcamp.views.slides.SlidesMessages;

import java.util.HashMap;
import java.util.Map;

class Bootstrap {


    void init() {
        Prompt prompt = new Prompt(System.in, System.out);

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

        ListSubscribersController listSubscribersController = new ListSubscribersController();
        ListSubscribersView listSubscribersView = new ListSubscribersView();
        listSubscribersController.setView(listSubscribersView);
        listSubscribersView.setPrompt(prompt);
        listSubscribersController.setPublisherService(publisherService);
        listSubscribersView.setListSubscribersController(listSubscribersController);

        SlideController slideController = new SlideController();
        SlideView slideView = new SlideView();
        slideController.setSlide(new Slide(SlidesMessages.SLIDE1));
        slideController.setView(slideView);
        slideView.setSlideController(slideController);
        slideView.setPrompt(prompt);

        SlideController slide1Controller = new SlideController();
        SlideView slide1View = new SlideView();
        slide1Controller.setSlide(new Slide(SlidesMessages.SLIDE2));
        slide1Controller.setView(slide1View);
        slide1View.setSlideController(slide1Controller);
        slide1View.setPrompt(prompt);

        SlideController slide2Controller = new SlideController();
        SlideView slide2View = new SlideView();
        slide2Controller.setSlide(new Slide(SlidesMessages.SLIDE3));
        slide2View.setSlideController(slide2Controller);
        slide2View.setPrompt(prompt);
        slide2Controller.setView(slide2View);

        SlideController slide3Controller = new SlideController();
        SlideView slide3View = new SlideView();
        slide3Controller.setSlide(new Slide(SlidesMessages.SLIDE4));
        slide3Controller.setView(slide3View);
        slide3View.setSlideController(slide3Controller);
        slide3View.setPrompt(prompt);

        SlideController slide4Controller = new SlideController();
        slide4Controller.setSlide(new Slide(SlidesMessages.SLIDE5));
        SlideView slide4View = new SlideView();
        slide4Controller.setView(slide4View);
        slide4View.setSlideController(slide4Controller);
        slide4View.setPrompt(prompt);

        SlideController slide5Controller = new SlideController();
        slide5Controller.setSlide(new Slide(SlidesMessages.SLIDE6));
        SlideView slide5View = new SlideView();
        slide5Controller.setView(slide5View);
        slide5View.setSlideController(slide5Controller);
        slide5View.setPrompt(prompt);


        //next Slides Declarations
        slideController.setNextController(slide1Controller);
        slide1Controller.setNextController(slide2Controller);
        slide2Controller.setNextController(slide3Controller);
        slide3Controller.setNextController(slide4Controller);
        slide4Controller.setNextController(slide5Controller);
        slide5Controller.setNextController(null);

        Map<Integer, Controller> menuOptions = new HashMap<>();
        menuOptions.put(UserOptions.MENU_OPTION_START_PRESENTATION.getOption(), slideController);
        menuOptions.put(UserOptions.MENU_OPTION_ADD_SUBSCRIBER.getOption(), addSubscriberController);
        menuOptions.put(UserOptions.MENU_OPTION_LIST_SUBSCRIBER.getOption(), listSubscribersController);
        menuOptions.put(UserOptions.MENU_OPTION_SEND_BROADCAST.getOption(), sendBroadCastController);

        menuController.setMenuOptions(menuOptions);

        menuController.init(); // must be in last line of the bootstrap. Entry Point of program.
    }
}
