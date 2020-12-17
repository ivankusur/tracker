package oop;

public class Student {

    public void music() {
        System.out.println("tra tra tra");
    }

    public void song() {
        System.out.println("i believe i can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();
    }
}