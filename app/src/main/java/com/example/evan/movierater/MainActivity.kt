package com.example.evan.movierater

import android.content.Intent
import android.opengl.Visibility
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstCheckbox.setOnClickListener(View.OnClickListener {
            if (firstCheckbox.isChecked) {
                checkBox1.visibility = View.VISIBLE;
                checkBox2.visibility = View.VISIBLE;

            } else {
                checkBox1.visibility = View.GONE;
                checkBox2.visibility = View.GONE;

            }
        })


    }



    fun addMovieBtn(v: View) {

        var language :String = "";

        if (radioEng.isChecked) {

            language = "English";

        } else if (radioChi.isChecked) {

            language = "Chinese";

        } else if (radioMalay.isChecked) {

            language = "Malay";

        } else if (radioTamil.isChecked) {

            language = "Tamil";

        }

        var reason :String = "";

        if(checkBox1.isChecked){

            reason += "\nViolence";

        }

        if(checkBox2.isChecked) {

            reason += "\nLanguage Used";

        }



        if (movieName.length() == 0 ) {

            movieName.setError("Field empty")

        }

        if (descriptionName.length() == 0) {

            descriptionName.setError("Field empty")

        }

        if (releaseDate.length() == 0) {

          releaseDate.setError("Field empty")

        }

        else {

            Toast.makeText(this, "Title = " + movieName.text + "\nOverview = " + descriptionName.text + "\nRelease date = " + releaseDate.text + "\nLanguage = " + language + "\nNot Suitable for all ages = " + firstCheckbox.isChecked() + "\nReason:"+ reason, Toast.LENGTH_LONG).show();

        }


    }


}
