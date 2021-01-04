package ru.job4j.exception;

public class FindEl {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element " + key + " is absent");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value = {"a", "b", "c"};
        try {
            indexOf(value, "abc");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
