package com.subway;

import com.subway.users.User;

import java.io.File;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    public void loginAttempt() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("username?");
        String username = scanner.nextLine();
        System.out.println("password?");
        String password = scanner.nextLine();

        if (validateCredentials(username, password) && User.getSessionStatus()) {
            System.out.println("You have succesfully logged in!");
        } else {
            System.out.println("Wrong credentials, please try again!");
            loginAttempt();
        }
    }

    public boolean validateCredentials(String username, String password) {
        ArrayList<ArrayList<String>> users = readUsers();

        for (ArrayList<String> user : users) {
            if (user.get(0).equals(username) && user.get(1).equals(password)) {
                User.getInstance(user);
                return User.getSessionStatus();
            }
        }
        return false;
    }

    public static ArrayList<ArrayList<String>> readUsers() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> userInfo = new ArrayList<>();
        ArrayList<ArrayList<String>> users = new ArrayList<>();

        try {
            File file = new File("src/com/subway/users.csv");
            scanner = new Scanner(file);
        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                userInfo.add(scanner.next());
            }
            users.add(userInfo);
        }

        return users;
    }

}
