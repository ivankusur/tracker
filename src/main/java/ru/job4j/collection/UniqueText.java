package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originalText, String duplicateText) {
        String[] origin = originalText.split(" ");
        String[] duplicate = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        HashSet<String> verifiable = new HashSet<>();
        for (String word : origin) {
            check.add(word);
        }
        for (String word : duplicate) {
            verifiable.add(word);
        }
        return check.containsAll(verifiable);
    }
}
