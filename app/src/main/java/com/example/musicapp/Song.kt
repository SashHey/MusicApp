package com.example.musicapp

import android.util.Log

class Song {
    //created variables to hold song object's attributes
    var name: String = ""
    var artist: String = ""
    var year: Int = 0
    var duration: String = ""

    //function to play song
    fun Play(){
        Log.v("Song ", "$name is playing.")
    }

    //function to pause song
    fun Pause(){
        Log.v("Song ", "$name is paused.")
    }

    //function to stop song
    fun Stop(){
        Log.v("Song ", "$name is stopped.")
    }

    //function to favourite song
    fun Favourite() : Boolean{
        Log.v("Song ", "$name is favourited.")
        return true
    }
}