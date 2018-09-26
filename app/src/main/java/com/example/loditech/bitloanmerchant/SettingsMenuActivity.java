package com.example.loditech.bitloanmerchant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SettingsMenuActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_menu);
    }

    public void ChangeEmailAddress_onClick(View v)
    {
        Intent intent =  new Intent(SettingsMenuActivity.this, SettingsA_Activity.class);
        startActivity(intent);
    }

    public void ChangePassword_onClick(View v)
    {
        Intent intent = new Intent(SettingsMenuActivity.this, SettingsB_Activity.class);
        startActivity(intent);
    }

    public void UpdateInformation_onClick(View v)
    {
        Intent intent = new Intent(SettingsMenuActivity.this, SettingsC_Activity.class);
        startActivity(intent);
    }
}
