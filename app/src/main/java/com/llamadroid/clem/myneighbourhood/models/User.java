package com.llamadroid.clem.myneighbourhood.models;

import java.io.Serializable;
import java.util.Date;

/**
 * Class storing all the user's details
 * Implements Serializable to be passed from one activity to another
 */
public class User implements Serializable
{
    private String mEmail;
    private String mFirstName;
    private String mLastName;
    private String mPassword;
    private String mPostcode;
    private String mAddress;
    private String mPhone;
    private Date mDOB;
    private char mGender;
    private String mDescription;
    private boolean mVerified;
    private boolean mIsLoggedOn;


    public User()
    {
        mVerified = false;
        mIsLoggedOn = true;
    }

    public User(String email, String firstName, String lastName, String password, String postcode)
    {
        mEmail = email;
        mFirstName = firstName;
        mLastName = lastName;
        mPassword = password;
        mPostcode = postcode;
        mVerified = false;
        mIsLoggedOn = true;
    }

    public String getEmail()
    {
        return mEmail;
    }

    public void setEmail(String email)
    {
        mEmail = email;
    }

    public String getFirstName()
    {
        return mFirstName;
    }

    public void setFirstName(String firstName)
    {
        mFirstName = firstName;
    }

    public String getLastName()
    {
        return mLastName;
    }

    public void setLastName(String lastName)
    {
        mLastName = lastName;
    }

    public String getPassword()
    {
        return mPassword;
    }

    public void setPassword(String password)
    {
        mPassword = password;
    }

    public String getPostcode()
    {
        return mPostcode;
    }

    public void setPostcode(String postcode)
    {
        mPostcode = postcode;
    }

    public String getAddress()
    {
        return mAddress;
    }

    public void setAddress(String address)
    {
        mAddress = address;
    }

    public String getPhone()
    {
        return mPhone;
    }

    public void setPhone(String phone)
    {
        mPhone = phone;
    }

    public Date getDOB()
    {
        return mDOB;
    }

    public void setDOB(Date DOB)
    {
        mDOB = DOB;
    }

    public char getGender()
    {
        return mGender;
    }

    public void setGender(char gender)
    {
        mGender = gender;
    }

    public boolean isVerified()
    {
        return mVerified;
    }

    public void setVerified(boolean verified)
    {
        mVerified = verified;
    }

    public String getDescription()
    {
        return mDescription;
    }

    public void setDescription(String description)
    {
        mDescription = description;
    }

    public boolean isLoggedOn()
    {
        return mIsLoggedOn;
    }

    public void setIsLoggedOn(boolean isLoggedOn)
    {
        mIsLoggedOn = isLoggedOn;
    }
}
