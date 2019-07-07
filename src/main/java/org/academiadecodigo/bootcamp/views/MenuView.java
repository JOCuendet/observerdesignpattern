package org.academiadecodigo.bootcamp.views;

import org.academiadecodigo.bootcamp.controllers.MenuController;
import org.academiadecodigo.bootcamp.lang.Messages;
import org.academiadecodigo.bootcamp.lang.UserOptions;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.views.abstracts.AbstractView;
import org.academiadecodigo.bootcamp.views.slides.SlidesMessages;

public class MenuView extends AbstractView {
    private MenuController menuController;

    public void setMenuController(MenuController menuController) {
        this.menuController = menuController;
    }

    @Override
    public void show() {
        showMenu();
    }

    private void showMenu() {
        System.out.println(Messages.WELCOME_MESSAGE);
        MenuInputScanner menuInputScanner = new MenuInputScanner(UserOptions.getMessages());
        menuInputScanner.setMessage("chose an option");

        int option;

        while ((option = prompt.getUserInput(menuInputScanner)) != UserOptions.QUIT.getOption()) {
            System.out.println("option " + option);
            menuController.handleMenuInput(option);
        }
        System.out.println(SlidesMessages.SLIDE_GOODBYE);
        System.exit(0);
    }
}
