package com.example.evan.movierater

import android.graphics.Movie
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DialogTitle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_main2.*
import org.w3c.dom.Text

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val movieEntity = MovieEntity("Venom",
            "When Eddie Brock acquires the powers of a symbiote, he will have to release his alter-ego 'Venom' to save his life",
            "English",
            "03-18-2018",
            "Yes")

        mTitle.text = movieEntity.mTitle;
        mOverview.text = movieEntity.mOverview;
        mLang.text = movieEntity.mLang;
        mReleaseDate.text = movieEntity.mReleaseDate;
        mSuitability.text = movieEntity.mSuitability;




    }


}

