package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int selectId = Integer.valueOf(input.askStr("Enter Id Item"));
        if (tracker.delete(selectId)) {
            System.out.println("Editing successful");
        } else {
            System.out.println("ID not founded");
        }
        return true;
    }
}
