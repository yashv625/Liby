package com.example.arnavbose.libyv2;

/**
 * Created by arnavbose on 14-02-2016.
 */
public class HomeDataSet {

    private int mImage;
    private String mText1;
    private String mText2;
    private String mText3;

    HomeDataSet(int image, String text1, String text2, String text3){
        mImage = image;
        mText1 = text1;
        mText2 = text2;
        mText3 = text3;
    }

    public int getmImage(){
        return mImage;
    }

    public void setmImage(int mImage){
        this.mImage = mImage;
    }

    public String getmText1() {
        return mText1;
    }

    public void setmText1(String mText1) {
        this.mText1 = mText1;
    }

    public String getmText2() {
        return mText2;
    }

    public void setmText2(String mText2) {
        this.mText2 = mText2;
    }

    public String getmText3(){
        return mText3;
    }

    public void setmText3(String mText3){
        this.mText3 = mText3;
    }
}
