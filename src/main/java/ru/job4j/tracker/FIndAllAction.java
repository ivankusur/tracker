package ru.job4j.tracker;

import java.util.List;

public class FIndAllAction implements UserAction {
    private final Output out;

    public FIndAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find all item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> items = tracker.findAll();
        for (Item item : items) {
            out.println(item.toString());
        }
        return true;
    }
}
