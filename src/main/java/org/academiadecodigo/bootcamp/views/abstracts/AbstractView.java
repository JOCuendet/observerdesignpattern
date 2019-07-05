package org.academiadecodigo.bootcamp.views.abstracts;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.views.interfaces.View;

public abstract class AbstractView implements View {

    protected Prompt prompt;

    public void setPrompt(Prompt prompt) {
        this.prompt = prompt;
    }

}
