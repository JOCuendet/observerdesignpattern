package org.academiadecodigo.bootcamp.controllers.interfaces;

import org.academiadecodigo.bootcamp.model.services.Slide;

public interface SlideInterface {

    void getNextSlide();

    Slide getSlide();

    void setSlide(Slide slide);

    void setNextController(Controller nextController);
}
