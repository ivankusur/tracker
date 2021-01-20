package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originalText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originalText.split(" ");
        String[] duplicate = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String word : origin) {
            check.add(word);
        }
        for (String word : duplicate) {
            if (!check.contains(word)) {
                return false;
            }
        }
        return rsl;
    }
}
