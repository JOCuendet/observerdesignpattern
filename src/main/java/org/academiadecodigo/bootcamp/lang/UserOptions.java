package org.academiadecodigo.bootcamp.lang;


public enum UserOptions {


    GET_BALANCE(1, Messages.MENU_OPTION_START_PRESENTATION),


    DEPOSIT(2, Messages.MENU_OPTION_ADD_SUBSCRIBER),


    WITHDRAW(3, Messages.MENU_OPTION_SEND_BROADCAST),


    QUIT(4, Messages.MENU_OPTION_QUIT);

    private int option;
    private String message;

    UserOptions(int option, String message) {
        this.option = option;
        this.message = message;
    }


    public int getOption() {
        return option;
    }


    public String getMessage() {
        return message;
    }


    public static String[] getMessages() {

        String[] messages = new String[values().length];

        for (UserOptions option : values()) {
            messages[option.getOption() - 1] = option.getMessage();
        }

        return messages;
    }
}
