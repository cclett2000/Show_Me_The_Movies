package com.example.showmethemovies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.codepath.asynchttpclient.AsyncHttpClient
import com.codepath.asynchttpclient.RequestParams
import com.codepath.asynchttpclient.callback.JsonHttpResponseHandler
import okhttp3.Headers

class MainActivity : AppCompatActivity() {
    private val client = AsyncHttpClient()
    private val params = RequestParams()
    fun requestMovieInf() {
        var jsonData = "No Data"

        // url
        val url = "https://api.themoviedb.org/3/movie/now_playing"
        params["api_key"] = "a07e22bc18f5cb106bfe4cc1f83ad8ed"
        params["page"] = "1"

        client.get(url, params, object :
            JsonHttpResponseHandler() {
            override fun onSuccess(statusCode: Int, headers: Headers, json: JSON) {
                Log.i("JSONINF", json.toString())
                //mainText.text = json.jsonArray.toString()
            }

            override fun onFailure(
                statusCode: Int,
                headers: Headers?,
                response: String,
                throwable: Throwable?
            ) {
            }
        })
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // UI
        val mainText = findViewById<TextView>(R.id.main_text)
    }
}