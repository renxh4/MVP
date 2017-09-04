package com.example.xiaohui.mvp.model;

/**
 * Created by xiaohui on 2017/9/4.
 */

public class UserModel implements IUserModel {
    @Override
    public void setUserName() {

    }

    @Override
    public boolean login(String username, String pwd) {
        if (username.equals("renxh") && pwd.equals("1234")) {
            return true;
        }
        return false;
    }

}
