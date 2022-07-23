package com.example.memelist.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.memelist.R



/*
    RecyclerView
     -list item layout
     -RV layout
    Fragments
     -List of memes
     -Meme details
    Navigation Graph
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}