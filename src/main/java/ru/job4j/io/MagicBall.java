package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = input.nextLine();
        int bound = new Random().nextInt(3);
        String answer = "";
        if (bound == 0) {
            answer = "Yes";
        }
        if (bound == 1) {
            answer = "No";
        }
        if  (bound == 2) {
            answer = "Maybe";
        }
        System.out.println(answer + ", You are lucky today");
    }
}
