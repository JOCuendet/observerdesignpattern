package org.academiadecodigo.bootcamp.views;

import org.academiadecodigo.bootcamp.controllers.SendBroadCastController;
import org.academiadecodigo.bootcamp.lang.Messages;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.academiadecodigo.bootcamp.views.abstracts.AbstractView;

public class SendBroadCastView extends AbstractView {

    private SendBroadCastController sendBroadCastController;


    public void setSendBroadCastController(SendBroadCastController sendBroadCastController) {
        this.sendBroadCastController = sendBroadCastController;
    }

    @Override
    public void show() {
        StringInputScanner message = new StringInputScanner();
        message.setMessage(Messages.SENDBROADCAST);
        String msg = prompt.getUserInput(message);
        sendBroadCastController.sendBroadcastMessage(msg);
    }
}
