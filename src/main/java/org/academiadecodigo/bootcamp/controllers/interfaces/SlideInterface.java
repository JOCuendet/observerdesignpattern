package org.academiadecodigo.bootcamp.controllers.interfaces;

import org.academiadecodigo.bootcamp.model.services.Slide;

public interface SlideInterface {

    void getNextSlide();
    void setSlide(Slide slide);
    Slide getSlide();
    void setNextController(Controller nextController);
}
