package com.example.miwoklanguageapp;

public class Object {

    private static final int NO_IMAGE_PROVIDER = -1;

    private int mIcon = NO_IMAGE_PROVIDER;
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mAudiofile;




    public Object(String defaultTranslation, String miwokTranslation , int audiofile) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudiofile = audiofile;
    }



    public Object(String mDefaultTranslation, String mMiwokTranslation, int mIcon, int audiofile) {
        this.mIcon = mIcon;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        mAudiofile = audiofile;
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
    public int getmAudiofile() { return mAudiofile; }
}