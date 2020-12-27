package ru.job4j.tracker;

import static java.lang.String.valueOf;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "Replace item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int selectId = Integer.valueOf(input.askStr("Enter id item"));
        String selectName = valueOf(input.askStr("Enter name: "));
        Item item = new Item(selectName);
        if (tracker.replace(selectId, item)) {
            System.out.println("Editing successful");
        } else {
            System.out.println("Item with this ID not founded");
        }
        return true;
    }
}
