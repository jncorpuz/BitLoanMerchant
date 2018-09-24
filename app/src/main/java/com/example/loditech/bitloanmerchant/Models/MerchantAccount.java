package com.example.loditech.bitloanmerchant.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MerchantAccount
{
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
