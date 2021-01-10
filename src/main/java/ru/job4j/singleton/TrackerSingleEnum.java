package ru.job4j.singleton;

public enum TrackerSingleEnum {
    INSTANCE;

    public static void main(String[] args) {
        TrackerSingleEnum tracker =  TrackerSingleEnum.INSTANCE;
    }
}
