package com.example.loditech.bitloanmerchant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.loditech.bitloanmerchant.Models.Account;
import com.example.loditech.bitloanmerchant.Models.Wallet;

public class SettingsC_Activity extends AppCompatActivity
{
    EditText firstName, middleName, lastName, address, city, province;
    TextView lblBalance;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_c);

        firstName = (EditText) findViewById(R.id.txtEnterpriseName);
        middleName = (EditText) findViewById(R.id.txtPassword);
        lastName = (EditText) findViewById(R.id.txtLastName);
        address = (EditText) findViewById(R.id.txtEnterpriseDescription);
        city = (EditText) findViewById(R.id.txtCity);
        province = (EditText) findViewById(R.id.txtProvince);

        lblBalance = (TextView) findViewById(R.id.lblBalance);
        lblBalance.setText(Double.toString(Wallet.wallet.getAmount()));

        firstName.setText(Account.account.getFirstName());
        middleName.setText(Account.account.getMiddleName());
        lastName.setText(Account.account.getLastName());
        String[] address1 = Account.account.getAddress().split(", ");
        address.setText(address1[0]);
        city.setText(address1[1]);
        province.setText(address1[2]);
    }

    public void NextPage_onClick(View v)
    {
        if(Check())
        {
            Intent intent = new Intent(SettingsC_Activity.this, SettingsD_Activity.class);
            Bundle extras = new Bundle();
            extras.putString("firstName", firstName.getText().toString());
            extras.putString("middleName", middleName.getText().toString());
            extras.putString("lastName", lastName.getText().toString());
            extras.putString("address", address.getText().toString());
            extras.putString("city", city.getText().toString());
            extras.putString("province", province.getText().toString());

            intent.putExtras(extras);
            startActivity(intent);
        }
        else
        {

        }
    }

    public void Cancel_onClick(View v)
    {
        Intent intent = new Intent(SettingsC_Activity.this, SettingsMenuActivity.class);
        startActivity(intent);
    }

    public boolean Check()
    {
        if(!firstName.getText().toString().isEmpty()&&!firstName.getText().toString().equals(" ")&&!lastName.getText().toString().isEmpty()&&!lastName.getText().toString().equals(" ")&&!address.getText().toString().isEmpty()&&!address.getText().toString().equals(" ")&&!city.getText().toString().isEmpty()&&!city.getText().toString().equals(" ")&&!province.getText().toString().isEmpty()&&!province.getText().toString().equals(" "))
        {
            return true;
        }
        Toast.makeText(this, "Fill the required fields", Toast.LENGTH_LONG).show();
        return false;
    }
}
