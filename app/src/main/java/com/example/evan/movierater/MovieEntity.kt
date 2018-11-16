package com.example.evan.movierater



import android.graphics.Movie

class MovieEntity (mTitle: String, mOverview: String, mLang: String, mReleaseDate: String, mSuitability: String){

    var mTitle: String
    var mOverview: String
    var mLang: String
    var mReleaseDate: String
    var mSuitability: String

    init {
        this.mTitle = mTitle;
        this.mOverview = mOverview;
        this.mLang = mLang;
        this.mReleaseDate = mReleaseDate;
        this.mSuitability = mSuitability;
    }
}



