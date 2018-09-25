package com.example.loditech.bitloanmerchant.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Account
{
    @SerializedName("ID")
    @Expose
    public int ID;
    @SerializedName("Username")
    @Expose
    public String Username;
    @SerializedName("Password")
    @Expose
    public String Password;
    @SerializedName("FirstName")
    @Expose
    public String FirstName;
    @SerializedName("MiddleName")
    @Expose
    public String MiddleName;
    @SerializedName("LastName")
    @Expose
    public String LastName;
    @SerializedName("EmailAddress")
    @Expose
    public String EmailAddress;
    @SerializedName("Address")
    @Expose
    public String Address;
    @SerializedName("Role")
    public String Role;

    public static MerchantAccount account;

    public Account()
    {

    }

    public Account(int ID, String username, String password, String firstName, String middleName, String lastName, String emailAddress, String address, String role )
    {
        this.ID = ID;
        Username = username;
        Password = password;
        FirstName = firstName;
        MiddleName = middleName;
        LastName = lastName;
        EmailAddress = emailAddress;
        Address = address;
        Role = role;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }
}
