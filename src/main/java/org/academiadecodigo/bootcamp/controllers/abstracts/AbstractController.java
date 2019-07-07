package org.academiadecodigo.bootcamp.controllers.abstracts;

import org.academiadecodigo.bootcamp.controllers.interfaces.Controller;
import org.academiadecodigo.bootcamp.views.interfaces.View;

public class AbstractController implements Controller {

    private View view;

    public void setView(View view) {
        this.view = view;
    }

    @Override
    public void init() {
        clearScreen();
        view.show();
    }

    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
