package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Tracker() {

    }
    public Tracker(int ids) {
        this.ids = ids;
    }

    public Item[] getItems() {
        return items;
    }
    public int getIds() {
        return ids;
    }
    public void setIds(int ids) {
        this.ids = ids;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item.toString().equals(key)) {
                rsl[i] = item;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        int size = 0;
        Item[] itemsWithoutNull = new Item[items.length];
        for (int index = 0; index <= items.length - 1; index++) {
            Item item = items[index];
            if (item != null) {
                itemsWithoutNull[index] = item;
                size++;
            }
        }
        return Arrays.copyOf(itemsWithoutNull, size);
    }
}


