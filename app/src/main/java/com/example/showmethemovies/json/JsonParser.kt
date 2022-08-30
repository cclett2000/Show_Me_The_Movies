package com.example.showmethemovies.json

import com.google.gson.Gson

object JsonParser {
    val gson = Gson()
    fun prettyData(jsonString: String) {
        return gson.fromJson(jsonString, MovieData::class.java)
    }
}