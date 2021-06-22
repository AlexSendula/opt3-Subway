package com.subway;

import java.util.ArrayList;

public class User {
    private String id;
    private String username;
    private String password;
    private String email;

    private static User user = null;

    private User(ArrayList<String> userInfo) {
        this.id = userInfo.get(0);
        this.username = userInfo.get(1);
        this.password = userInfo.get(2);
        this.email = userInfo.get(3);
    }

    public static User getInstance(ArrayList<String> userInfo) {
        if (user == null) {

            user = new User(userInfo);
        }

        return user;
    }

    public static Boolean getSessionStatus() {
        return user != null;
    }

    public static void endSession() {
        user = null;
    }
}
