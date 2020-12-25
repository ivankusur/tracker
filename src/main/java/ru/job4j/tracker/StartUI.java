package ru.job4j.tracker;


import static java.lang.String.valueOf;

public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            String msg = "Select:";
            System.out.print(msg);
            int select = Integer.valueOf(input.askStr(msg));
            if (select == 0) {
                msg = "=== Create a new Item ====\nEnter name:";
                String name = input.askStr(msg);
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                Item[] items = tracker.findAll();
                for (Item item : items) {
                    System.out.println(item.toString());
                }
            } else if (select == 2) {
                msg = "Enter id item";
                int selectId = Integer.valueOf(input.askStr(msg));
                msg = "Enter name: ";
                String selectName = valueOf(input.askStr(msg));
                Item item = new Item(selectName);
                if (tracker.replace(selectId, item)) {
                    System.out.println("Editing successful");
                } else {
                    System.out.println("ID not founded");
                }
            } else if (select == 3) {
                msg = "Enter id item";
                int selectId = Integer.valueOf(input.askStr(msg));
                if (tracker.delete(selectId)) {
                    System.out.println("Editing successful");
                } else {
                    System.out.println("ID not founded");
                }
            } else if (select == 4) {
                msg = "Enter id item";
                int selectId = Integer.valueOf(input.askStr(msg));
                Item item = tracker.findById(selectId);
                if (item != null) {
                    System.out.println(item.toString());
                } else {
                    System.out.println("Item with your ID not founded");
                }
            } else if (select == 5) {
                msg = "Enter name: ";
                String selectName = input.askStr(msg);
                Item[] items = tracker.findByName(selectName);
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item.toString());
                    }
                } else {
                    System.out.println("Items with this NAME not founded");
                }
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
