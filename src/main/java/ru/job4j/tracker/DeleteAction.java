package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int selectId = Integer.valueOf(input.askStr("Enter Id Item"));
        if (tracker.delete(selectId)) {
            out.println("Editing successful");
        } else {
            out.println("ID not founded");
        }
        return true;
    }
}
