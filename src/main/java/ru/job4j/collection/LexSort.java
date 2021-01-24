package ru.job4j.collection;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();
        String[] leftStrings = left.split("");
        for (String s : leftStrings) {
            if (s.matches("[-+]?\\d+")) {
               firstList.add(Integer.parseInt(s));
            }
        }
        String[] rightStrings = right.split("");
        for (String s : rightStrings) {
            if (s.matches("[-+]?\\d+")) {
                secondList.add(Integer.parseInt(s));
            }
        }
        Integer[] firstInt = firstList.toArray(new Integer[0]);
        Integer[] secondInt = secondList.toArray(new Integer[0]);
        return Arrays.compare(firstInt,secondInt);
    }

    public static void main(String[] args) {
        String[] input = {
                "10. Task.",
                "1. Task.",
                "2. Task."
        };
        Arrays.sort(input, new LexSort());
        for (String s : input) {
            System.out.println(s);
        }
    }
}
