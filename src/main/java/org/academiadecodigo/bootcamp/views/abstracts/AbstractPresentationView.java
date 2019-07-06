package org.academiadecodigo.bootcamp.views.abstracts;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.StringSetInputScanner;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractPresentationView extends AbstractView {

    public void nextMenuPrompt() {
        Prompt promptSlide = new Prompt(System.in,System.out);
        Set<String> options = new HashSet<>();
        options.add("n");
        options.add("N");
        StringSetInputScanner next = new StringSetInputScanner(options);
        next.setMessage("type n for next slide: ");
        promptSlide.getUserInput(next);

    }
}
