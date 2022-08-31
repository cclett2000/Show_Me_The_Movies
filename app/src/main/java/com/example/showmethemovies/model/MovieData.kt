package com.example.showmethemovies.model

data class MovieData(
    var dates: Dates? = Dates(),
    var page: Int? = null,
    val results: ArrayList<Results> = arrayListOf(),
    val total_pages: Int? = null,
    val total_results: Int? = null
)

