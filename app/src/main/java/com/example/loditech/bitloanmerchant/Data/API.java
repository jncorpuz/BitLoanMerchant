package com.example.loditech.bitloanmerchant.Data;

import com.example.loditech.bitloanmerchant.Models.*;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface API
{
    String BASE_URL = "https://bitloan.azurewebsites.net/api/";

    @POST("Account/LoginMerchant")
    Call<MerchantAccount> LoginUser(@Query("username") String username, @Query("password") String password);
}
