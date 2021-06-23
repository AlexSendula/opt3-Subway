package com.subway;

import java.util.ArrayList;

public class User {
    private String id;
    private String username;
    private String password;
    private String email;
    private String street;
    private String housenumber;
    private String zipcode;
    private String city;

    private static User user = null;

    private User(ArrayList<String> userInfo) {
        this.id = userInfo.get(0);
        this.username = userInfo.get(1);
        this.password = userInfo.get(2);
        this.email = userInfo.get(3);
        this.street = userInfo.get(4);
        this.housenumber = userInfo.get(5);
        this.zipcode = userInfo.get(6);
        this.city = userInfo.get(7);
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
