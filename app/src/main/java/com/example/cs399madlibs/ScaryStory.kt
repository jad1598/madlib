package com.example.cs399madlibs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class ScaryStory : AppCompatActivity() {

    lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scary_story)
    }




    fun submit(v: View){
        editText = findViewById(R.id.SS_editText1) as EditText
        val adjective1= editText.text.toString()

        editText = findViewById(R.id.SS_editText2) as EditText
        val personName1 = editText.text.toString()

        editText = findViewById(R.id.SS_editText3) as EditText
        val adjective2= editText.text.toString()

        editText = findViewById(R.id.SS_editText4) as EditText
        val noun1= editText.text.toString()

        editText = findViewById(R.id.SS_editText5) as EditText
        val verb1 = editText.text.toString()

        editText = findViewById(R.id.SS_editText6) as EditText
        val animalName1= editText.text.toString()

        editText = findViewById(R.id.SS_editText7) as EditText
        val verbing1= editText.text.toString()

        editText = findViewById(R.id.SS_editText8) as EditText
        val adverb1= editText.text.toString()

        editText = findViewById(R.id.SS_editText9) as EditText
        val noun2= editText.text.toString()

        editText = findViewById(R.id.SS_editText10) as EditText
        val verbing2= editText.text.toString()

        editText = findViewById(R.id.SS_editText12) as EditText
        val pluralNoun1= editText.text.toString()

        editText = findViewById(R.id.SS_editText12) as EditText
        val verbing3= editText.text.toString()


        display(adjective1,personName1,adjective2,noun1,verb1,animalName1,verbing1,adverb1,noun2,
            verbing2,pluralNoun1,verbing3)



    }



    fun display(adjective1: String,personName1:String, adjective2:String ,noun1:String,
                verb1:String, animalName1: String, verbing1: String, adverb1:String,noun2:String,
                verbing2:String, pluralNoun1:String,verbing3:String){


        val scary_madlib_label = findViewById<View>(R.id.scary_madlib_label) as TextView
        val textView5 = findViewById<View>(R.id.textView8) as TextView
        val textView6 = findViewById<View>(R.id.textView9) as TextView
        val textView7 = findViewById<View>(R.id.textView10) as TextView
        val textView8 = findViewById<View>(R.id.textView11) as TextView
        val textView9 = findViewById<View>(R.id.textView12) as TextView

        scary_madlib_label.text = "Your Scary MadLib"
        textView5.text = " They say my school is haunted; my " + adjective1 + " friend " +personName1 +
                " says she saw a "+ adjective2 + " " + noun1 + " floating at the end of the hall near the cafeteria. "
        textView6.text = "Some say if you " + verb1 + " down that hallway at night, you'll hear a " + animalName1+ " " + verbing1 + " " +
                adverb1+ "."
        textView7.text= " My " + adjective1 + " friend "+ personName1 + " saw a "+ adjective2 + " " + noun2+ " " + verbing2
                " under one of the tables once."
        textView8.text=" I hope I never see any " + pluralNoun1 + " " + verbing3 + "."




    }
}
