package com.example.loditech.bitloanmerchant.Models;

import java.util.Date;

public class Transaction
{
    public int ID;
    public Date TransactionDateTime;
    public int SenderID;
    public int ReceiverID;
    public double Amount;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getTransactionDateTime() {
        return TransactionDateTime;
    }

    public void setTransactionDateTime(Date transactionDateTime) {
        TransactionDateTime = transactionDateTime;
    }

    public int getSenderID() {
        return SenderID;
    }

    public void setSenderID(int senderID) {
        SenderID = senderID;
    }

    public int getReceiverID() {
        return ReceiverID;
    }

    public void setReceiverID(int receiverID) {
        ReceiverID = receiverID;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }
}
