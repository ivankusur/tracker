package oop;

public class Reduce {
    private int[] array;
    // Обьект класса reduce в методе to принимает не переменную array,
    // а поле класса с таким же названием

    public void to(int[] array) {
        this.array = array;
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce shrink = new Reduce();
        shrink.to(array);
        shrink.print();
    }
}
