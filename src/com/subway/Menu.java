package com.subway;

import java.util.Scanner;

public class Menu {
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();

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
