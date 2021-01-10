package ru.job4j.singleton;

public class TrackerSingleStaticFinalField {
    private static final TrackerSingleStaticFinalField INSTANCE = new TrackerSingleStaticFinalField();

    private TrackerSingleStaticFinalField() {
    }

    public static TrackerSingleStaticFinalField getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        TrackerSingleStaticFinalField tracker = TrackerSingleStaticFinalField.getInstance();
    }
}

