package ru.job4j.singleton;

import ru.job4j.tracker.Item;

public class TrackerSinglePrivatFinalStaticClass {
    private TrackerSinglePrivatFinalStaticClass() {
    }

    public static TrackerSinglePrivatFinalStaticClass getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final TrackerSinglePrivatFinalStaticClass INSTANCE = new TrackerSinglePrivatFinalStaticClass();
    }

    public static void main(String[] args) {
        TrackerSinglePrivatFinalStaticClass tracker = TrackerSinglePrivatFinalStaticClass.getInstance();
    }
}
