package ru.ds.edu.decorator.dec;

import ru.ds.edu.decorator.Printable;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimestampDecorator implements Printable {
    private final Printable decoratee;

    public TimestampDecorator(Printable decoratee) {
        this.decoratee = decoratee;
    }

    @Override
    public String getMessage() {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
        return "[" + timestamp + "]" + decoratee.getMessage();
    }

    @Override
    public void updateMessage(String text) {
        decoratee.updateMessage(text);
    }


}
