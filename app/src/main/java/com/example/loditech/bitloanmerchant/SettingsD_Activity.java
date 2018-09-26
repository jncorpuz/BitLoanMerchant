package com.example.loditech.bitloanmerchant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SettingsD_Activity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_d);
    }

    public void Update_onClick(View v)
    {

    }

    public void Cancel_onClick(View v)
    {
        Intent intent = new Intent(SettingsD_Activity.this, SettingsMenuActivity.class);
        startActivity(intent);
    }
}
