package com.example.musicapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.musicapp.Song

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var songShowTxt = findViewById<TextView>(R.id.songDisplayId)
        var songDisplay = ""

        //accessing the Song class to populate song objects with specific attributes
        var song1 = Song("Choosin' Texas", "Ella Langley", 2026, "3.5")
        var song2 = Song("Man I Need", "Olivia Dean", 2026, "2.5")
        var song3 = Song("I Just Might", "Bruno Mars")

        //creating an array to hold the song objects
        var songs = arrayOf<Song>(song1, song2, song3)

        //for loop to loop through and display songs from the songs array
        for (song in songs){
            songDisplay += "${song.DisplaySong()}\n\n"
        }

        songShowTxt.text = songDisplay

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}