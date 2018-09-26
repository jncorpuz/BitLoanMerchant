package com.example.loditech.bitloanmerchant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SettingsA_Activity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_a);
    }

    public void UpdateA_onClick(View v)
    {

    }

    public void CancelA_onClick(View v)
    {
        Intent intent = new Intent(SettingsA_Activity.this, SettingsMenuActivity.class);
        startActivity(intent);
    }
}
