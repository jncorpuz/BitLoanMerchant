package com.example.loditech.bitloanmerchant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import retrofit2.Call;

public class LoginActivity extends AppCompatActivity
{
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.editText2);
    }

    public void Login(View v)
    {
        if(Check())
        {

        }
    }

    public boolean Check()
    {
        if(!username.getText().toString().isEmpty() && !username.getText().toString().equals(" ") && !password.getText().toString().isEmpty() && !password.getText().toString().equals(" "))
            return true;

        return false;
    }

    public void SignUp(View v)
    {

    }
}
