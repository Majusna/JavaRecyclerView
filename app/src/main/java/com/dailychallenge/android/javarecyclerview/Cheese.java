package com.dailychallenge.android.javarecyclerview;

public class Cheese {

    private int mCheeseImage;
    private int mBoxImage;
    private String mCheeseName;
    private int mOrigin;
    private int mCategory;
    private String mHowToCut;
    private String mDescription;

    public Cheese (String cheeseName, int category, int origin, String howToCut, String description,
                   int cheeseImage, int boxImage){
        mCheeseName = cheeseName;
        mCategory = category;
        mOrigin =origin;
        mHowToCut = howToCut;
        mDescription = description;
        mCheeseImage = cheeseImage;
        mBoxImage = boxImage;

    }

    public String getCheeseName(){
        return mCheeseName;
    }

    public int getCategory(){
        return mCategory;
    }

    public String getOrigin(){

        switch (mOrigin){
            case (0):{
                return "local";
            }case (1):{
                return  "europe";
            }default:
                return "";
        }

    }

    public String getCut(){
        return mHowToCut;
    }

    public String getDescription(){
        return mDescription;
    }

    public int getCheeseImage(){
        return mCheeseImage;
    }

    public int getBoxImage(){
        return mBoxImage;
    }
}
