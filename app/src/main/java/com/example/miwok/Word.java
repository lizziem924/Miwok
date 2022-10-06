package com.example.miwok;

public class Word
{
    //attributes
    private String englishTranslation;
    private String miwokTranslation;

    //constructor
    public Word (String english, String miwok)
    {
        englishTranslation = english;
        miwokTranslation = miwok;
    }

    //getters
    public String getEnglishTranslation() {return englishTranslation;}
    public String getMiwokTranslation() {return miwokTranslation;}
}
