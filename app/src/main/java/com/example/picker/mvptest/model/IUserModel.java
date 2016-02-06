package com.example.picker.mvptest.model;

import com.example.picker.mvptest.bean.UserBean;

/**
 * Created by 17930 on 2016/2/5.
 */
public interface  IUserModel {
    void setID(int id);

    void setFirstName(String firstName);

    void setLastName(String lastName);

    UserBean load(int id);
}
