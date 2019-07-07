package org.academiadecodigo.bootcamp.views.slides;


public enum SlidesOptions {

    SLIDE1(1, SlidesMessages.SLIDE1),

    SLIDE2(2, SlidesMessages.SLIDE2);


    private int option;
    private String message;

    SlidesOptions(int option, String message) {
        this.option = option;
        this.message = message;
    }


    public int getOption() {
        return option;
    }


    public String getMessage() {
        return message;
    }
}
