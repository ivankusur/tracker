package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int length = Math.min(left.length(), right.length());
        for (int i = 0; i < length; i++) {
            char firstStr = left.charAt(i);
            char secondStr = right.charAt(i);
            if (firstStr != secondStr) {
                return Character.compare(firstStr, secondStr);
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}
