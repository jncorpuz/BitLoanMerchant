package com.example.loditech.bitloanmerchant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignupA_Activity extends AppCompatActivity
{
    TextView txtLogin;
    Button cmdNextStep;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_a);

        txtLogin = findViewById(R.id.txtLoginSU);
        cmdNextStep = findViewById(R.id.cmdNextStepSU);
    }

    public void NextStepSU(View view)
    {
        Intent intent = new Intent(SignupA_Activity.this, SignupB_Activity.class);
        startActivity(intent);
    }

    public void LoginSU(View view)
    {
        Intent intent = new Intent(SignupA_Activity.this, LoginActivity.class);
        startActivity(intent);
    }
}
