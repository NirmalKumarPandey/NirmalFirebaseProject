package com.example.a20secondchattingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener
{
    private EditText mUsername,mPassword,mSex,mAddress;
    private Button bRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mUsername=findViewById(R.id.username_reg);
        mPassword=findViewById(R.id.password_reg);
        mSex=findViewById(R.id.sex_reg);
        mAddress=findViewById(R.id.address_reg);
        bRegister=findViewById(R.id.register_reg);
    }

    @Override
    public void onClick(View view)
    {
        String username=mUsername.getText().toString().trim();
        String password=mPassword.getText().toString().trim();
        String sex=mSex.getText().toString().trim();
        String address=mAddress.getText().toString().trim();
        if(username.isEmpty())
        {
            mUsername.setError("Please Enter Username:");
        }
        if(password.isEmpty())
        {
            mPassword.setError("Please Enter Password:");
        }
        if(sex.isEmpty())
        {
            mSex.setError("Please Enter Sex:");
        }
        if(address.isEmpty())
        {
            mAddress.setError("Please Enter Address:");
        }

        if(view==bRegister)
        {



        }

    }
}
