package com.example.miwoklanguageapp;

public class Object {

    private static final int NO_IMAGE_PROVIDER = -1;

    private int mIcon = NO_IMAGE_PROVIDER;
    private String mDefaultTranslation;
    private String mMiwokTranslation;



    public Object(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    public Object(String mDefaultTranslation, String mMiwokTranslation,int mIcon) {
        this.mIcon = mIcon;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }
    public boolean hasImage(){
        return mIcon != NO_IMAGE_PROVIDER;
    }


    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getmIcon() { return mIcon; }
}