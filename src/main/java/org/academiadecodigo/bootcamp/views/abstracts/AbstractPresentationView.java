package org.academiadecodigo.bootcamp.views.abstracts;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.StringSetInputScanner;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractPresentationView extends AbstractView {

    public void nextMenuPrompt() {
        clearscreen();
        Prompt promptSlide = new Prompt(System.in,System.out);
        Set<String> options = new HashSet<>();
        options.add("n");
        options.add("N");
        StringSetInputScanner next = new StringSetInputScanner(options);
        next.setMessage("\ntype n for next slide: \n");
        promptSlide.getUserInput(next);

    }

    public void clearscreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
