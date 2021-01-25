package ru.job4j.tracker;

import static java.lang.String.valueOf;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

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
            out.println("Editing successful");
        } else {
            out.println("Item with this ID not founded");
        }
        return true;
    }
}
