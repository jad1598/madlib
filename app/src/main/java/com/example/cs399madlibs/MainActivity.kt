package com.example.cs399madlibs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToScary(view: View)
    {
        val scaryStoryIntent = Intent(this, ScaryStory::class.java)
        startActivity(scaryStoryIntent)
    }

    fun goToFunny(view: View)
    {
        val funnyStoryIntent = Intent(this, FunnyStory::class.java)
        startActivity(funnyStoryIntent)
    }
}
