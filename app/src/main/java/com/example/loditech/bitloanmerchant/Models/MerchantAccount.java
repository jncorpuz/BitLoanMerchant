package com.example.loditech.bitloanmerchant.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MerchantAccount extends Account
{
    @SerializedName("MerchantID")
    @Expose
    public int MerchantID;
    @SerializedName("AccountID")
    @Expose
    public int AccountID;
    @SerializedName("EnterpriseName")
    @Expose
    public String EnterpriseName;
    @SerializedName("EnterpriseAddress")
    @Expose
    public String EnterpriseAddress;
    @SerializedName("EnterpriseDescription")
    @Expose
    public String EnterpriseDescription;
}
