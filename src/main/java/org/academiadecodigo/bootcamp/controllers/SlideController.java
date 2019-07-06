package org.academiadecodigo.bootcamp.controllers;

import org.academiadecodigo.bootcamp.controllers.abstracts.AbstractController;
import org.academiadecodigo.bootcamp.controllers.interfaces.Controller;
import org.academiadecodigo.bootcamp.controllers.interfaces.SlideInterface;
import org.academiadecodigo.bootcamp.model.services.Slide;

public class SlideController extends AbstractController implements SlideInterface {

    private Controller nextController;
    private Slide slide;

    @Override
    public void setSlide(Slide slide) {
        this.slide = slide;
    }

    @Override
    public void setNextController(Controller nextController) {
        this.nextController = nextController;
    }

    @Override
    public void getNextSlide() {
        if(nextController == null){
            return;
        }
        nextController.init();
    }

    @Override
    public Slide getSlide() {
        return slide;
    }
}
