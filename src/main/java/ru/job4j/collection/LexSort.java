package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] leftStrings = left.split("\\.");
        String[] rightStrings = right.split("\\.");
        return Integer.compare(Integer.parseInt(leftStrings[0]),
                Integer.parseInt(rightStrings[0]));
    }
}
