package com.subway.users;

import java.util.ArrayList;

public class Address {
    private String street;
    private int housenumber;
    private String zipcode;
    private String city;

    public Address(ArrayList<String> userInfo) {
        this.street = userInfo.get(4);
        this.housenumber = Integer.parseInt(userInfo.get(5));
        this.zipcode = userInfo.get(6);
        this.city = userInfo.get(7);
    }
}
