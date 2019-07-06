package org.academiadecodigo.bootcamp.views;

import org.academiadecodigo.bootcamp.controllers.PresentationController;
import org.academiadecodigo.bootcamp.views.abstracts.AbstractPresentationView;

public class PresentationView extends AbstractPresentationView {

    PresentationController presentationController;

    public void setPresentationController(PresentationController presentationController) {
        this.presentationController = presentationController;
    }

    @Override
    public void show() {
        showMainPresentation();
    }

    private void showMainPresentation() {
        clearscreen();
        System.out.println(presentationController.getSlide().getSlideText());
        nextMenuPrompt();
        presentationController.getNextSlide();
    }

}
