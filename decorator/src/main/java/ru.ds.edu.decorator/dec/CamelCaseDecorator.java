package ru.ds.edu.decorator.dec;

import ru.ds.edu.decorator.Printable;

public class CamelCaseDecorator implements Printable {
    private final Printable decoratee;

    public CamelCaseDecorator(Printable decoratee) {
        this.decoratee = decoratee;
    }

    @Override
    public String getMessage() {
        return decoratee.getMessage().replaceAll("([a-z])([A-Z]+)", "$1_$2").toLowerCase();
    }

    @Override
    public void updateMessage(String text) {
        decoratee.updateMessage(text);
    }
}
