package com.subway;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    private Shop shop = new Shop();

    public void menu() {
        System.out.println("1. Order");
        System.out.println("2. Log out");

        int selection = scanner.nextInt();
        if (selection == 1) {
            shop.order();
            menu();
        } else if (selection == 2) {
            User.endSession();
        }
    }
}
