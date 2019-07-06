package org.academiadecodigo.bootcamp.controllers;

import org.academiadecodigo.bootcamp.controllers.abstracts.AbstractController;
import org.academiadecodigo.bootcamp.controllers.interfaces.Controller;
import org.academiadecodigo.bootcamp.controllers.interfaces.SlideInterface;
import org.academiadecodigo.bootcamp.model.services.Slide;

public class Slide1Controller extends AbstractController implements SlideInterface {

    private Controller controller;
    private Slide slide;

    @Override
    public void setSlide(Slide slide) {
        this.slide = slide;
    }

    @Override
    public void setNextController(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void getNextSlide() {
        controller.init();
    }

    @Override
    public Slide getSlide() {
        return slide;
    }
}
