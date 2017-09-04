package com.example.xiaohui.mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.xiaohui.mvp.R;
import com.example.xiaohui.mvp.model.IUserModel;
import com.example.xiaohui.mvp.model.UserModel;
import com.example.xiaohui.mvp.presenter.UserPresenter;

public class MainActivity extends AppCompatActivity implements IUserView, View.OnClickListener {

    private EditText pwd;
    private EditText username;
    private UserModel userModel;
    private UserPresenter userPresenter;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        username = (EditText) findViewById(R.id.usename);
        pwd = (EditText) findViewById(R.id.pwd);
        button = (Button) findViewById(R.id.login);
        button.setOnClickListener(this);
        userPresenter = new UserPresenter(this);
    }

    @Override
    public String getUserName() {
        return username.getText().toString().trim();
    }

    @Override
    public String getPassWord() {
        return pwd.getText().toString().trim();
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(MainActivity.this,"登陆成功",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFail() {
        Toast.makeText(MainActivity.this,"登陆失败",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.login:
                userPresenter.login(getUserName(), getPassWord());
                break;
        }
    }
}
