package com.subway;

import com.subway.sandwiches.ChickenFillet;
import com.subway.sandwiches.Sandwich;
import com.subway.sandwiches.SpicyItalian;
import com.subway.sandwiches.Veggie;
import com.subway.users.User;

import java.util.Scanner;

public class Shop {
    public void order() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose your desired sandwich");
        System.out.println("1. Chicken Fillet");
        System.out.println("2. Spicy Pepperoni");
        System.out.println("3. Veggie");

        int selection = scanner.nextInt();
        sandwichSelection(selection);

        System.out.println("Enjoy your sandwich!!");
        User.endSession();
    }

    public void sandwichSelection(int selection) {
        switch (selection) {
            case 1 -> {
                Sandwich sandwich = new ChickenFillet();
                sandwich.makeSandwich();
            }
            case 2 -> {
                Sandwich sandwich = new SpicyItalian();
                sandwich.makeSandwich();
            }
            case 3 -> {
                Sandwich sandwich = new Veggie();
                sandwich.makeSandwich();
            }
            default -> {
                System.out.println("Bad input.");
                User.endSession();
            }
        }
    }
}
