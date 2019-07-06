package org.academiadecodigo.bootcamp.views.slides;

import org.academiadecodigo.bootcamp.controllers.SlideController;
import org.academiadecodigo.bootcamp.views.abstracts.AbstractPresentationView;

public class SlideView extends AbstractPresentationView {

    private SlideController slideController;

    public void setSlideController(SlideController slideController) {
        this.slideController = slideController;
    }

    @Override
    public void show() {

        System.out.println(slideController.getSlide().getSlideText());
        nextMenuPrompt();
        slideController.getNextSlide();
    }
}
