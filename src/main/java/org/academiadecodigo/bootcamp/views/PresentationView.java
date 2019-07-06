package org.academiadecodigo.bootcamp.views;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.controllers.PresentationController;
import org.academiadecodigo.bootcamp.scanners.string.StringSetInputScanner;
import org.academiadecodigo.bootcamp.views.abstracts.AbstractPresentationView;

import java.util.HashSet;
import java.util.Set;


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
        System.out.println(presentationController.getSlide().getSlideText());
        nextMenuPrompt();
        presentationController.getNextSlide();
    }

}
