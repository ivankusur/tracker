package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int length = left.length() > right.length() ? left.length() : right.length();
        for (int i = 0; i < length - 1; i++) {
            char firstStr = left.charAt(i);
            char secondStr = right.charAt(i);
            if (firstStr != secondStr) {
                return firstStr - secondStr;
            }
        }
        return left.length() - right.length();
    }
}
