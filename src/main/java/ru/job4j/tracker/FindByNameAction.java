package ru.job4j.tracker;

import java.util.List;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find Item by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String selectName = input.askStr("Enter name");
        List<Item> items = tracker.findByName(selectName);
        if (items.size() > 0) {
            for (Item item : items) {
               out.println(item.toString());
            }
        } else {
           out.println("Items with this NAME not founded");
        }
        return true;
    }
}
