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
import com.example.loditech.bitloanmerchant.Models.MerchantAccount;
import com.example.loditech.bitloanmerchant.Models.Wallet;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SettingsD_Activity extends AppCompatActivity
{
    EditText enterpName, enterpAddress, enterpDescription;
    TextView lblBalance;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_d);

        enterpName = (EditText) findViewById(R.id.txtEnterpriseName);
        enterpAddress = (EditText) findViewById(R.id.txtEnterpriseAddress);
        enterpDescription = (EditText) findViewById(R.id.txtEnterpriseDescription);

        lblBalance = (TextView) findViewById(R.id.lblBalance);
        lblBalance.setText(Double.toString(Wallet.wallet.getAmount()));
    }

    public void Update_onClick(View v)
    {
        if(Check())
        {
            final Bundle getBundle = getIntent().getExtras();

            MerchantAccount account = new MerchantAccount(
                    MerchantAccount.merchantAccount.getID(),
                    "",
                    "",
                    getBundle.getString("firstName"),
                    getBundle.getString("middleName"),
                    getBundle.getString("lastName"),
                    "",
                    getBundle.getString("address") + ", " + getBundle.getString("city") + ", " + getBundle.getString("province"),
                    "",
                    MerchantAccount.merchantAccount.getMerchantID(),
                    MerchantAccount.merchantAccount.getAccountID(),
                    enterpName.getText().toString(),
                    enterpAddress.getText().toString(),
                    enterpDescription.getText().toString());

            retrofit2.Call<Boolean> call = RetrofitClient.getInstance().getAPI().UpdateInformation(account);
            call.enqueue(new Callback<Boolean>()
            {
                @Override
                public void onResponse(Call<Boolean> call, Response<Boolean> response)
                {
                    try
                    {
                        if (response.body())
                        {
                            MerchantAccount.merchantAccount.setFirstName(getBundle.getString("firstName"));
                            MerchantAccount.merchantAccount.setMiddleName(getBundle.getString(" middleName"));
                            MerchantAccount.merchantAccount.setLastName(getBundle.getString(" lastName"));
                            MerchantAccount.merchantAccount.setAddress(getBundle.getString("address") + ", " + getBundle.getString("city") + ", " + getBundle.getString("province"));
                            MerchantAccount.merchantAccount.setEnterpriseName(enterpName.getText().toString());
                            MerchantAccount.merchantAccount.setEnterpriseAddress(enterpAddress.getText().toString());
                            MerchantAccount.merchantAccount.setEnterpriseDescription(enterpDescription.getText().toString());
                        }
                    }
                    catch (Exception e)
                    {
                        Toast.makeText(SettingsD_Activity.this, e.toString(), Toast.LENGTH_LONG).show();
                    }

                }

                @Override
                public void onFailure(Call<Boolean> call, Throwable t)
                {
                    Toast.makeText(SettingsD_Activity.this, "ERROR", Toast.LENGTH_LONG).show();
                }
            });
        }
    }

    public void Cancel_onClick(View v)
    {
        Intent intent = new Intent(SettingsD_Activity.this, SettingsMenuActivity.class);
        startActivity(intent);
    }

    public boolean Check()
    {
        if(!enterpName.getText().toString().isEmpty()&&!enterpName.getText().toString().equals(" ")&&!enterpAddress.getText().toString().isEmpty()&&!enterpAddress.getText().toString().equals(" ")&&!enterpDescription.getText().toString().isEmpty()&&!enterpDescription.getText().toString().equals(" "))
        {
            return true;
        }
        Toast.makeText(this, "Fill the required fields", Toast.LENGTH_LONG).show();
        return false;
    }
}
