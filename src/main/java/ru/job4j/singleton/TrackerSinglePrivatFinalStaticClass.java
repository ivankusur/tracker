package ru.job4j.singleton;

public class TrackerSinglePrivatFinalStaticClass {
    private TrackerSinglePrivatFinalStaticClass() {
    }

    public static TrackerSinglePrivatFinalStaticClass getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final TrackerSinglePrivatFinalStaticClass INSTANCE = new TrackerSinglePrivatFinalStaticClass();
    }

    public static void main(String[] args) {
        TrackerSinglePrivatFinalStaticClass tracker = TrackerSinglePrivatFinalStaticClass.getInstance();
    }
}
