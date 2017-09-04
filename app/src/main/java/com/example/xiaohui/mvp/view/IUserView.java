package com.example.xiaohui.mvp.view;

/**
 * Created by xiaohui on 2017/9/4.
 */

public interface IUserView {
    String getUserName();
    String getPassWord();
    void loginSuccess();
    void loginFail();
}
