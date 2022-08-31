package com.example.showmethemovies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.codepath.asynchttpclient.AsyncHttpClient
import com.codepath.asynchttpclient.RequestParams
import com.codepath.asynchttpclient.callback.JsonHttpResponseHandler
import com.example.showmethemovies.model.MovieData
import com.example.showmethemovies.model.app_p1.RVModel
import com.google.gson.Gson
import okhttp3.Headers

class MainActivity : AppCompatActivity() {
    private val client = AsyncHttpClient()
    private val params = RequestParams()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gson = Gson()
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val listModel = ArrayList<RVModel>()

        // url
        val url = "https://api.themoviedb.org/3/movie/now_playing"
        params["api_key"] = "a07e22bc18f5cb106bfe4cc1f83ad8ed"
        params["page"] = "1"

        client.get(url, params, object :
            JsonHttpResponseHandler() {
            override fun onSuccess(statusCode: Int, headers: Headers, json: JSON) {
                val jsonModel = gson.fromJson(json.jsonObject.toString(), MovieData::class.java)
                for (item in jsonModel.results) {
                    listModel.add(
                        RVModel(
                            item.poster_path,
                            item.title,
                            item.overview
                        )
                    )
                    val adapter = RecyclerViewAdapter(listModel)
                    recyclerView.adapter = adapter
                }
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
}