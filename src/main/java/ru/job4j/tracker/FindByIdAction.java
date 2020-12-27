package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "Find items by ID";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int selectId = Integer.valueOf(input.askStr("Enter id item"));
        Item item = tracker.findById(selectId);
        if (item != null) {
            System.out.println(item.toString());
        } else {
            System.out.println("Item with your ID not founded");
        }
        return true;
    }
}
