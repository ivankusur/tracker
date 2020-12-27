package ru.job4j.tracker;

public class FIndAllAction implements UserAction {
    @Override
    public String name() {
        return "Find all item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        for (Item item : items) {
            System.out.println(item.toString());
        }
        return true;
    }
}
