package com.subway;

import com.subway.users.User;

import java.util.Scanner;

public class Menu {
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();

        System.out.println("1. Order");
        System.out.println("2. Log out");

        switch (scanner.nextInt()) {
            case 1 -> {
                shop.order();
                menu();
            }
            case 2 -> User.endSession();
        }
    }
}
