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

    public static MerchantAccount account;

    public MerchantAccount(int merchantID, int accountID, String enterpriseName, String enterpriseAddress, String enterpriseDescription)
    {
        MerchantID = merchantID;
        AccountID = accountID;
        EnterpriseName = enterpriseName;
        EnterpriseAddress = enterpriseAddress;
        EnterpriseDescription = enterpriseDescription;
    }

    public int getMerchantID() { return MerchantID; }

    public void setMerchantID(int merchantID) { MerchantID = merchantID; }

    public int getAccountID() { return AccountID; }

    public void setAccountID(int accountID) { AccountID = accountID; }

    public String getEnterpriseName() { return EnterpriseName; }

    public void setEnterpriseName(String enterpriseName) { EnterpriseName = enterpriseName; }

    public String getEnterpriseAddress() { return EnterpriseAddress; }

    public void setEnterpriseAddress(String enterpriseAddress) { EnterpriseAddress = enterpriseAddress; }

    public String getEnterpriseDescription() { return EnterpriseDescription; }

    public void setEnterpriseDescription(String enterpriseDescription) { EnterpriseDescription = enterpriseDescription; }
}
