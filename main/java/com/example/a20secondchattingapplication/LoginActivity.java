package com.example.a20secondchattingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener
{
    private EditText mUserName,mUserPassoword;
    private Button bLogin,bRegister;
    private TextView tForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mUserName=findViewById(R.id.username);
        mUserPassoword=findViewById(R.id.password);
        bLogin=findViewById(R.id.login);
        bRegister=findViewById(R.id.register);
        tForgotPassword=findViewById(R.id.forgot_password);
        bLogin.setOnClickListener(this);
        bRegister.setOnClickListener(this);
        tForgotPassword.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        if(view==bLogin)
        {

        }
        if(view==bRegister)
        {


        }
        if(view==tForgotPassword)
        {

        }

    }
}
