package org.academiadecodigo.bootcamp.views;

import org.academiadecodigo.bootcamp.controllers.MenuController;
import org.academiadecodigo.bootcamp.lang.Messages;
import org.academiadecodigo.bootcamp.lang.UserOptions;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.academiadecodigo.bootcamp.views.abstracts.AbstractView;

public class MenuView extends AbstractView {
    private MenuController menuController;

    public void setMenuController(MenuController menuController) {
        this.menuController = menuController;
    }

    @Override
    public void show() {
        System.out.println(Messages.WELCOME_MESSAGE);
        MenuInputScanner menuInputScanner = new MenuInputScanner(UserOptions.getMessages());
        menuInputScanner.setMessage("chose an option");
        int option = prompt.getUserInput(menuInputScanner);
        menuController.handleMenuInput(option);
    }
}