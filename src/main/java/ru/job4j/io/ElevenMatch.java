package ru.job4j.io;

import java.util.Scanner;

public class ElevenMatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean player = true;
        int count = 11;
        while (count > 0) {
            if (player) {
                System.out.println("First player take a matches (1,2, or 3)");
            } else {
                System.out.println("Second player take a matches (1,2, or 3)");
            }
            int select = Integer.valueOf(input.nextLine());
            while (select < 1 || select > 3 || select > count) {
                System.out.println("Take correct number of matches (1,2, or 3)");
                select = Integer.valueOf(input.nextLine());
            }
            count -= select;
            System.out.println(count + " matches left");
            player = !player;
        }
        if (player) {
            System.out.println("Second player WIN");
        } else {
            System.out.println("First player WIN");
        }
    }
}




