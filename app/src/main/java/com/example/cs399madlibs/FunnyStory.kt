package com.example.cs399madlibs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class FunnyStory : AppCompatActivity() {

    lateinit var editText: EditText




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_funny_story)
    }


    fun submit(v:View){
        editText = findViewById(R.id.FS_editText1) as EditText
        val adjective1= editText.text.toString()

        editText = findViewById(R.id.FS_editText2) as EditText
        val adjective2 = editText.text.toString()

        editText = findViewById(R.id.FS_editText3) as EditText
        val pronoun1= editText.text.toString()

        editText = findViewById(R.id.FS_editText4) as EditText
        val noun1= editText.text.toString()

        editText = findViewById(R.id.FS_editText5) as EditText
        val noun2 = editText.text.toString()

        editText = findViewById(R.id.FS_editText6) as EditText
        val pluralNoun1= editText.text.toString()

        editText = findViewById(R.id.FS_editText7) as EditText
        val adverb1= editText.text.toString()

        editText = findViewById(R.id.FS_editText8) as EditText
        val verb1= editText.text.toString()

        editText = findViewById(R.id.FS_editText9) as EditText
        val adjective3= editText.text.toString()

        editText = findViewById(R.id.FS_editText10) as EditText
        val pluralNoun2= editText.text.toString()


        display(adjective1,adjective2,pronoun1,noun1,noun2,pluralNoun1,adverb1,verb1,adjective3,pluralNoun2)



    }




    fun display (adjective1: String,adjective2 : String,pronoun1 : String,noun1 :String,noun2:String,pluralNoun1:String,
                 adverb1:String ,verb1: String ,adjective3 : String,pluralNoun2: String){

        val funny_madlib = findViewById<View>(R.id.funny_madlib_label) as TextView
        val textView = findViewById<View>(R.id.textView) as TextView
        val textView2 = findViewById<View>(R.id.textView2) as TextView
        val textView3 = findViewById<View>(R.id.textView3) as TextView
        val textView4 = findViewById<View>(R.id.textView4) as TextView
        val textView5 = findViewById<View>(R.id.textView5) as TextView
        val textView6 = findViewById<View>(R.id.textView6) as TextView
        val textView7 = findViewById<View>(R.id.textView7) as TextView

        funny_madlib.text = "Your Funny MadLib"
        textView.text = " " + adjective1 + " teachers always give out " + adjective2 + " assignments" +"."
        textView2.text =" But as everyone knows, if you want to pass all " + pronoun1 + " classes, you can go to a/an " + noun1+
                " and become president of a big International "+ noun2 + "."
        textView3.text = "Then, you'll have millions of " + pluralNoun1+ "."
        textView4.text = "In the bank, you must do your homework and study " + adverb1 + "."
        textView5.text = "If you just sit around and " + verb1 +" ,you wont get ahead in life."
        textView6.text = "You must learn to pay attention to every " + adjective3 + " thing your teacher says"
        textView7.text = "So when you teacher gives you a surprise quick, you will know all of the "+ pluralNoun2





    }



}
