package com.example.showmethemovies.json

data class MovieData (
    val page: Int,
    val results: Array<Any>,
    val dates: Any,
    val total_pages: Int,
    val total_results: Int
)