package ru.job4j.singleton;

import ru.job4j.tracker.Tracker;

public enum TrackerSingleEnum {
    INSTANCE;

    private final Tracker singleTracker = new Tracker();

    public Tracker getSingleTracker() {
        return singleTracker;
    }

    public static void main(String[] args) {
        TrackerSingleEnum tracker =  TrackerSingleEnum.INSTANCE;
    }
}
