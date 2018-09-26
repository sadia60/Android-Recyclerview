package com.example.aleenarehman.aleena;

/**
 * Created by Aleena Rehman on 11/09/2017.
 */

public class Flag {

    String fName;
    int fImage;
    String key;
    public Flag(String flagName, int flagImage, String key)
    {
        this.fImage=flagImage;
        this.fName=flagName;
        this.key = key;;
    }
    public String getFlagName()
    {
        return fName;
    }
    public int getFlagImage()
    {
        return fImage;
    }
    public String getKey() { return key;}
}