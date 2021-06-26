package com.subway;

import com.subway.users.User;

public class Main {

    public static void main(String[] args) {
        Login login = new Login();
        try {
            login.loginAttempt();
            while (User.getSessionStatus()) {
                Menu menu = new Menu();
                menu.menu();
            }
            System.out.println("User has logged out.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
