package org.academiadecodigo.bootcamp.views.slides;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.controllers.Slide1Controller;
import org.academiadecodigo.bootcamp.scanners.string.StringSetInputScanner;
import org.academiadecodigo.bootcamp.views.abstracts.AbstractPresentationView;

import java.util.HashSet;
import java.util.Set;

public class Slide1View extends AbstractPresentationView {

    private Slide1Controller slide1Controller;

    public void setSlide1Controller(Slide1Controller slide1Controller) {
        this.slide1Controller = slide1Controller;
    }

    @Override
    public void show() {

        System.out.println(slide1Controller.getSlide().getSlideText());
        nextMenuPrompt();
        slide1Controller.getNextSlide();
    }
}
