package com.example.loditech.bitloanmerchant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.loditech.bitloanmerchant.Data.RetrofitClient;
import com.example.loditech.bitloanmerchant.Models.Account;
import com.example.loditech.bitloanmerchant.Models.MerchantAccount;

import org.w3c.dom.Text;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
            Call<MerchantAccount> call = RetrofitClient.getInstance().getAPI().LoginUser(username.getText().toString(), password.getText().toString());
            call.enqueue(new Callback<MerchantAccount>() {
                @Override
                public void onResponse(Call<MerchantAccount> call, Response<MerchantAccount> response) {
                    MerchantAccount account = response.body();

                    if (account != null && response.code() == 200)
                    {
                        Account.account = account;
                        Intent intent = new Intent(LoginActivity.this, HomeMenuActivity.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                        username.getText().clear();
                        password.getText().clear();
                    }
                }

                @Override
                public void onFailure(Call<MerchantAccount> call, Throwable t) {
                    Toast.makeText(LoginActivity.this, "Login Failed Please contact App Developer", Toast.LENGTH_SHORT).show();
                }
            });
        }
        else
        {
            Toast.makeText(LoginActivity.this, "Fill Username and Password", Toast.LENGTH_SHORT).show();
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
