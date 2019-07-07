package org.academiadecodigo.bootcamp.model.subscribers;

import org.academiadecodigo.bootcamp.aesthetics.ConsoleColors;


public class Client implements Subscriber {


    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {

        System.out.println(updateString(message));
    }

    public String getName() {
        return name;
    }

    private String warpString(String message) {
        StringBuilder sb = new StringBuilder(message);

        int i = 0;
        while (i + 40 < sb.length() && (i = sb.lastIndexOf(" ", i + 40)) != -1) {
            sb.replace(i, i + 1, "\n         ");
        }

        return sb.toString();
    }


    private String updateString(String message) {
        return "\n  =======================================================" +
                "\n                     hello " + ConsoleColors.PURPLE_BOLD_BRIGHT + name + ConsoleColors.RESET + "!                        " +
                "\n               you have received a message!                " +
                "\n  _______________________________________________________" +
                "\n" +
                "\n        " + ConsoleColors.GREEN + " " + warpString(message) + ConsoleColors.RESET +
                "\n" +
                "\n  =======================================================";


    }
}
