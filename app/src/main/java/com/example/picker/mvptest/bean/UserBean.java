package com.example.picker.mvptest.bean;

/**
 * Created by 17930 on 2016/2/5.
 */
public class UserBean {
    private String firstName;
    private String lastName;

    public UserBean(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
