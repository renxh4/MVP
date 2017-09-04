package com.example.xiaohui.mvp.presenter;

import com.example.xiaohui.mvp.model.UserModel;
import com.example.xiaohui.mvp.view.IUserView;

/**
 * Created by xiaohui on 2017/9/4.
 */

public class UserPresenter {

    private final IUserView mIuserView;
    private final UserModel userModel;

    public UserPresenter(IUserView iUserView) {
        this.mIuserView = iUserView;
        userModel = new UserModel();
    }

    public boolean login(String username, String pwd) {
        boolean login = userModel.login(username, pwd);
        if (login) {
            mIuserView.loginSuccess();
        } else {
            mIuserView.loginFail();
        }
        return login;
    }


}
