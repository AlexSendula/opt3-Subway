package com.subway;

import com.subway.sandwiches.ChickenFillet;
import com.subway.sandwiches.Sandwich;
import com.subway.sandwiches.SpicyItalian;
import com.subway.sandwiches.Veggie;
import java.util.Scanner;

public class Shop {
    Scanner scanner = new Scanner(System.in);

    public void order() {
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
        if (selection == 1) {
            Sandwich sandwich = new ChickenFillet();
            sandwich.makeSandwich();
        } else if (selection == 2) {
            Sandwich sandwich = new SpicyItalian();
            sandwich.makeSandwich();
        } else if (selection == 3) {
            Sandwich sandwich = new Veggie();
            sandwich.makeSandwich();
        } else {
            System.out.println("Bad input.");
            User.endSession();
        }
    }
}
