package com.subway;

public class Main {

    public static void main(String[] args) {
        Login login = new Login();
        try {
            login.loginAttempt();
            while (User.getSessionStatus()) {
                Shop shop = new Shop();
                shop.menu();
            }
            System.out.println("User has logged out.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
