package com.gita.futsalkathmandu;

/**
 * Created by adv on 4/9/2017.
 */

public class MyData {
    String name;
    String email;
    String phone;


    public MyData(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
