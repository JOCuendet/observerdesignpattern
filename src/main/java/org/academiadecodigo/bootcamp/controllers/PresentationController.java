package org.academiadecodigo.bootcamp.controllers;

import org.academiadecodigo.bootcamp.controllers.abstracts.AbstractController;
import org.academiadecodigo.bootcamp.controllers.interfaces.Controller;
import org.academiadecodigo.bootcamp.controllers.interfaces.SlideInterface;
import org.academiadecodigo.bootcamp.model.services.Slide;

public class PresentationController extends AbstractController implements SlideInterface {


    private Controller nextController;
    private Slide slide;

    public void setNextController(Controller nextController) {
        this.nextController = nextController;
    }

    public void setSlide(Slide slide) {
        this.slide = slide;
    }

    public void getNextSlide() {
        nextController.init();
    }

    @Override
    public Slide getSlide() {
        return slide;
    }
}
