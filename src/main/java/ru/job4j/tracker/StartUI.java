package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item getTime = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = getTime.getCreated().format(formatter);
        System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);

        Item firstItem = new Item(1, "firstItem");
        Tracker firstTracker = new Tracker();
        firstTracker.add(firstItem);
        System.out.println(firstTracker.findById(1));
    }
}

