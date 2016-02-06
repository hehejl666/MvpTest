package com.example.picker.mvptest.presenter;

import com.example.picker.mvptest.bean.UserBean;
import com.example.picker.mvptest.model.IUserModel;
import com.example.picker.mvptest.model.UserModel;
import com.example.picker.mvptest.view.IUserView;

/**
 * Created by 17930 on 2016/2/5.
 */
public class UserPresenter {
    private IUserView mUserView ;
    private IUserModel mUserModel ;

    public UserPresenter (IUserView view) {
        mUserView = view;
        mUserModel = new UserModel();
    }

    public void saveUser( int id , String firstName , String lastName) {
        mUserView.SetLog("执行存储");


        mUserModel.setID(id);
        mUserModel.setFirstName(firstName);
        mUserModel.setLastName(lastName);
        mUserView.SetLog("执行存储成功");
    }

    public void loadUser( int id ) {
        mUserView.SetLog("执行读取");
        UserBean user = mUserModel.load(id);
        mUserView.setFirstName(user.getFirstName ());//通过调用IUserView的方法来更新显示
        mUserView.setLastName(user.getLastName());
        mUserView.SetLog("执行读取成功");
    }
}
