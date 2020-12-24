package ru.job4j.tracker;

import java.util.Scanner;

import static java.lang.String.valueOf;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                Item[] items = tracker.findAll();
                for (Item item : items) {
                    System.out.println(item.toString());
                }
            } else if (select == 2) {
                System.out.println("Enter id item");
                int selectId = Integer.valueOf(scanner.nextLine());
                System.out.print("Enter name: ");
                String selectName = valueOf(scanner.nextLine());
                Item item = new Item(selectName);
                if (tracker.replace(selectId, item)) {
                    System.out.println("Editing successful");
                } else {
                    System.out.println("ID not founded");
                }
            } else if (select == 3) {
                System.out.println("Enter id item");
                int selectId = Integer.valueOf(scanner.nextLine());
                if (tracker.delete(selectId)) {
                    System.out.println("Editing successful");
                } else {
                    System.out.println("ID not founded");
                }
            } else if (select == 4) {
                System.out.println("Enter id");
                int selectId = Integer.valueOf(scanner.nextLine());
                Item item = tracker.findById(selectId);
                if (item != null) {
                    System.out.println(item.toString());
                } else {
                    System.out.println("Item with your ID not founded");
                }
            } else if (select == 5) {
                System.out.print("Enter name: ");
                String selectName = valueOf(scanner.nextLine());
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
