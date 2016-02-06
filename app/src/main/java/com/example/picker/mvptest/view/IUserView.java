package com.example.picker.mvptest.view;

/**
 * Created by 17930 on 2016/2/5.
 */
public interface  IUserView {
    int getID();
    String getFristName();
    String getLastName();
    void setFirstName (String firstName);
    void setLastName (String lastName);
    void SetLog(String logMessage);
}
