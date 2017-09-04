package com.example.xiaohui.mvp.model;

/**
 * Created by xiaohui on 2017/9/4.
 */

public interface IUserModel {
    void setUserName();
    boolean login(String username,String pwd);
}
