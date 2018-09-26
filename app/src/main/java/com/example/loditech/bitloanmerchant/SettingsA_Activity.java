package com.example.loditech.bitloanmerchant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.loditech.bitloanmerchant.Data.RetrofitClient;
import com.example.loditech.bitloanmerchant.Models.Account;
import com.example.loditech.bitloanmerchant.Models.Wallet;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SettingsA_Activity extends AppCompatActivity
{
    EditText email, password;
    TextView balance;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_a);

        email = (EditText) findViewById(R.id.txtEmail);
        password = (EditText) findViewById(R.id.txtPassword);
        balance = (TextView) findViewById(R.id.lblBalance);
        balance.setText(Double.toString(Wallet.wallet.getAmount()));
    }

    public void UpdateA_onClick(View v)
    {
        if(Check())
        {
            Call<Boolean> call = RetrofitClient.getInstance().getAPI().ChangeEmail(Account.account.getID(), password.getText().toString(), email.getText().toString());
            call.enqueue(new Callback<Boolean>() {
                @Override
                public void onResponse(Call<Boolean> call, Response<Boolean> response)
                {
                    try
                    {
                        if(response.body())
                        {
                            Toast.makeText(SettingsA_Activity.this, "Email Changed.", Toast.LENGTH_LONG).show();
                            email.getText().clear();
                            password.getText().clear();

                            Intent intent = new Intent(SettingsA_Activity.this, SettingsMenuActivity.class);
                            startActivity(intent);
                        }
                        else
                        {
                            Toast.makeText(SettingsA_Activity.this, "Incorrect Password.", Toast.LENGTH_LONG).show();
                        }
                    }
                    catch (Exception e)
                    {
                        Toast.makeText(SettingsA_Activity.this, e.toString(), Toast.LENGTH_LONG).show();
                    }
                }

                @Override
                public void onFailure(Call<Boolean> call, Throwable t)
                {
                    Toast.makeText(SettingsA_Activity.this, "ERROR", Toast.LENGTH_LONG).show();
                }
            });
        }
    }

    public void CancelA_onClick(View v)
    {
        Intent intent = new Intent(SettingsA_Activity.this, SettingsMenuActivity.class);
        startActivity(intent);
    }

    public boolean Check()
    {
        if(!email.getText().toString().isEmpty()&&!email.getText().toString().equals(" ")&&!password.getText().toString().isEmpty()&&!password.getText().toString().equals(" ")){
            return true;
        }
        Toast.makeText(this, "Fill the required fields.", Toast.LENGTH_LONG).show();
        return false;
    }
}
