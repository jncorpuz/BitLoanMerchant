package com.example.loditech.bitloanmerchant.Models;

import java.util.Date;

public class AuditLog
{
    public int ID;
    public int AccountID;
    public Date TimeStamp;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAccountID() {
        return AccountID;
    }

    public void setAccountID(int accountID) {
        AccountID = accountID;
    }

    public Date getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        TimeStamp = timeStamp;
    }
}
