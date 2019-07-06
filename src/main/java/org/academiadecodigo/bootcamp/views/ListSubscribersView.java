package org.academiadecodigo.bootcamp.views;

import org.academiadecodigo.bootcamp.controllers.ListSubscribersController;
import org.academiadecodigo.bootcamp.views.abstracts.AbstractView;

public class ListSubscribersView extends AbstractView {

    private ListSubscribersController listSubscribersController;

    public void setListSubscribersController(ListSubscribersController listSubscribersController) {
        this.listSubscribersController = listSubscribersController;
    }

    @Override
    public void show() {
        System.out.println(listSubscribersController.getSubscribersList());
    }
}
