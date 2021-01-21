package ru.job4j.tracker.sorting;

import ru.job4j.tracker.Item;

import java.util.Comparator;

public class DescendingSortByNameItem implements Comparator<Item> {

    @Override
    public int compare(Item first, Item second) {
        return second.getName().compareTo(first.getName());
    }
}