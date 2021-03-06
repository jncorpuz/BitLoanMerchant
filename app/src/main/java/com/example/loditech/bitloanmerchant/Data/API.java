package com.example.loditech.bitloanmerchant.Data;

import com.example.loditech.bitloanmerchant.Models.*;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface API
{
    String BASE_URL = "https://bitloan.azurewebsites.net/api/";

    @POST("Account/LoginMerchant")
    Call<MerchantAccount> LoginUser(@Query("username") String username, @Query("password") String password);
    @GET("Account/ChangeEmail")
    Call<Boolean> ChangeEmail(@Query("ID") int ID, @Query("password") String password, @Query("emailAddress") String emailAddress);
    @GET("Account/ChangePassword")
    Call<Boolean> ChangePassword(@Query("ID") int ID, @Query("password") String password, @Query("newPasspord") String newPassword);
    @POST("Account/UpdateMerchantInformation")
    Call<Boolean> UpdateInformation(@Body MerchantAccount account);
}
