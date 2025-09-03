package com.hevalvural.jokeapp.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import com.hevalvural.jokeapp.JokeList
import com.hevalvural.jokeapp.model.Joke
import com.hevalvural.jokeapp.service.JokeAPI
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Composable
fun MainScreen() {
    var jokes = remember { mutableStateListOf<Joke>() }

    val baseUrl = "https://raw.githubusercontent.com/"
    val retrofit =
        Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create())
            .build().create(
                JokeAPI::class.java
            )

    val call = retrofit.getData()
    call.enqueue(object : Callback<List<Joke>>{
        override fun onResponse(
            call: Call<List<Joke>?>,
            response: Response<List<Joke>?>
        ) {
            response.body()?.let {
                jokes.addAll(it)
            }
        }

        override fun onFailure(
            call: Call<List<Joke>?>,
            t: Throwable
        ) {
            t.printStackTrace()
        }

    }
    )

    JokeList(jokes)
}