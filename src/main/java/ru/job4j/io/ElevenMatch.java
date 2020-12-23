package ru.job4j.io;

import java.util.Scanner;

public class ElevenMatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int count = 11;
        while (count > 0) {
            System.out.println("Player 1 take a matches (1,2, or 3)");
            int selectFirstPlayer = Integer.valueOf(input.nextLine());
            while (selectFirstPlayer < 1 || selectFirstPlayer > 3) {
                System.out.println("Take correct number of matches (1,2, or 3)");
                selectFirstPlayer = Integer.valueOf(input.nextLine());
            }
            count -= selectFirstPlayer;
            System.out.println(count + " matches left");
            if (count == 0) {
                System.out.println("Player 1 WIN");
                break;
            }
            System.out.println("Player 2 take a matches (1,2, or 3)");
            int selectSecondPlayer = Integer.valueOf(input.nextLine());
            while (selectSecondPlayer < 1 || selectSecondPlayer > 3) {
                System.out.println("Take correct number of matches (1,2, or 3)");
                selectSecondPlayer = Integer.valueOf(input.nextLine());
            }
            count -= selectSecondPlayer;
            System.out.println(count + " matches left");
            if (count == 0) {
                System.out.println("Player 2 WIN");
                break;
            }
        }
    }
}

