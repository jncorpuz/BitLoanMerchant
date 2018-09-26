package com.example.loditech.bitloanmerchant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SettingsC_Activity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_c);
    }

    public void NextPage_onClick(View v)
    {
        Intent intent = new Intent(SettingsC_Activity.this, SettingsD_Activity.class);
        startActivity(intent);
    }

    public void Cancel_onClick(View v)
    {
        Intent intent = new Intent(SettingsC_Activity.this, SettingsMenuActivity.class);
        startActivity(intent);
    }
}
