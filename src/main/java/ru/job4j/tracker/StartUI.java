package ru.job4j.tracker;


import static java.lang.String.valueOf;

public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void findAll(Tracker tracker) {
        Item[] items = tracker.findAll();
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        int selectId = Integer.valueOf(input.askStr("Enter id item"));
        String selectName = valueOf(input.askStr("Enter name: "));
        Item item = new Item(selectName);
        if (tracker.replace(selectId, item)) {
            System.out.println("Editing successful");
        } else {
            System.out.println("Item with this ID not founded");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        int selectId = Integer.valueOf(input.askStr("Enter Id Item"));
        if (tracker.delete(selectId)) {
            System.out.println("Editing successful");
        } else {
            System.out.println("ID not founded");
        }
    }

    public static void findById(Input input, Tracker tracker) {
        int selectId = Integer.valueOf(input.askStr("Enter id item"));
        Item item = tracker.findById(selectId);
        if (item != null) {
            System.out.println(item.toString());
        } else {
            System.out.println("Item with your ID not founded");
        }
    }

    public static void findByName(Input input, Tracker tracker) {
        String selectName = input.askStr("Enter name");
        Item[] items = tracker.findByName(selectName);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item.toString());
            }
        } else {
            System.out.println("Items with this NAME not founded");
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            String msg = "Select:";
            int select = Integer.valueOf(input.askStr(msg));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.findAll(tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findById(input, tracker);
            } else if (select == 5) {
                StartUI.findByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
