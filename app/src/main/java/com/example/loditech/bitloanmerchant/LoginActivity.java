package com.example.loditech.bitloanmerchant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity
{
    EditText username, password;
    Button cmdLogin;
    TextView txtSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.txtUsername);
        password = (EditText) findViewById(R.id.txtPassword);
        cmdLogin = (Button) findViewById(R.id.cmdLogin);
        txtSignup = (TextView) findViewById(R.id.txtSignUp);
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
        Intent intent = new Intent(LoginActivity.this, SignupA_Activity.class);
        startActivity(intent);
    }
}
