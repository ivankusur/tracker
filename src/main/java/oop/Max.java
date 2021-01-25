package oop;

public class Max {
    public static int maximum(int first, int second) {
        return first > second ? first : second;
    }

    public static double maximum(double first, double second) {
        return first > second ? first : second;
    }

    public static int maximum(int first, int second, int third) {
        return maximum(first, maximum(second, third));
    }

    public static int maximum(int first, int second, int third, int fourth) {
        return maximum(first, maximum(second, third), fourth);
    }

    public static void main(String[] args) {
        System.out.println(maximum(20, 50));
        System.out.println(maximum(1.1, 1.2));
        System.out.println(maximum(6, 8, 7));
        System.out.println(maximum(1, 10, 6, 1));
    }
}

