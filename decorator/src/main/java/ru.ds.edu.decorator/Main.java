package ru.ds.edu.decorator;

import ru.ds.edu.decorator.dec.CamelCaseDecorator;
import ru.ds.edu.decorator.dec.TimestampDecorator;
import ru.ds.edu.decorator.impl.DetailedErrorPrintable;
import ru.ds.edu.decorator.impl.SimplePrintable;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Main {
    private static final int DEFAULT_BUFFER_SIZE = 10;

    public static void main(String[] args) {
        PrintableObjectsBuffer buffer = new PrintableObjectsBuffer(DEFAULT_BUFFER_SIZE);
        Map<String, String> map = new HashMap<>();

        Printable mapPrintable = new DetailedErrorPrintable(map, "Hello World!");
        Printable simplePrintable = new SimplePrintable("Всё идёт по плану");

        mapPrintable = new TimestampDecorator(mapPrintable);
        mapPrintable = new CamelCaseDecorator(mapPrintable);

        simplePrintable = new TimestampDecorator(simplePrintable);
        simplePrintable = new CamelCaseDecorator(simplePrintable);

        addPrintablesToBuffer(buffer, mapPrintable, simplePrintable);

        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");

        String[] forPrint = buffer.printObjects();
        for (String print: forPrint) {
            System.out.println(print);
        }

        map.put("four", "4");
        Printable t = buffer.get(0); //get map printable
        t.updateMessage("    Превышен рекомендованный размер.\r\n");

        forPrint = buffer.printObjects();
        for (String print: forPrint) {
            System.out.println(print);
        }

        // Необходимо добавить в буффер объекты Printable так,
        // чтобы при вызове метода printObject перед выводом getMessage в квадратных скобках выводился timestamp,
        // в который производился последний вызов метода Printable#updateMessage
        // [2024-03-13 14:01:01.813]Всё идёт по плану - пример
        // Реализовать ниже и для DetailedErrorPrintable и для SimplePrintable
        // TODO:

        // Необходимо добавить в буффер объекты Printable так,
        // чтобы при вызове метода getMessage CamelCase был заменен на SnakeCase
        // Пример:
        // Error happened with object: java.util.HashMap@{one=1, two=2, three=3} : ->
        // Error happened with object: java.util.hash_map@{one=1, two=2, three=3} :
        // Реализовать ниже и для DetailedErrorPrintable и для SimplePrintable
        // TODO:

        // Необходимо добавить в буффер объекты Printable, результаты выполнения которых совмещают обе предыдущие
        // модификации
        // TODO:
    }

    private static void addPrintablesToBuffer(PrintableObjectsBuffer buff, Printable... printables) {
        for (Printable p: printables) {
            buff.add(p);
        }
    }
}
