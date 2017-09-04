package com.example.xiaohui.mvp.bean;

/**
 * Created by xiaohui on 2017/9/4.
 */

public class UserBean {
    private String mUserName;
    private String mPassword;

    public UserBean(String userName, String password) {
        this.mUserName = userName;
        this.mPassword = password;
    }

    public void setUserName(String userName) {
        this.mUserName = userName;
    }

    public void setmPassWord(String password) {
        this.mPassword = password;
    }

    public String getUserName() {
        return mUserName;
    }

    public String getmPassWord() {
        return mPassword;
    }
}
