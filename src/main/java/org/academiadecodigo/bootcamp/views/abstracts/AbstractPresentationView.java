package org.academiadecodigo.bootcamp.views.abstracts;

import org.academiadecodigo.bootcamp.scanners.string.StringSetInputScanner;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractPresentationView extends AbstractView {

    protected void nextMenuPrompt() {

        Set<String> options = new HashSet<>();
        options.add("n");
        options.add("N");
        StringSetInputScanner next = new StringSetInputScanner(options);
        next.setMessage("\ntype n for next slide: \n");
        prompt.getUserInput(next);

    }


}
