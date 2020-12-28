package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "Find Item by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String selectName = input.askStr("Enter name");
        Item[] items = tracker.findByName(selectName);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item.toString());
            }
        } else {
            System.out.println("Items with this NAME not founded");
        }
        return true;
    }
}
