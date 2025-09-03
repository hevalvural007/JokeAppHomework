package com.hevalvural.jokeapp.service

import com.hevalvural.jokeapp.model.Joke
import retrofit2.Call
import retrofit2.http.GET

interface JokeAPI {
    //base -> https://raw.githubusercontent.com/
    //raw -> atilsamancioglu/ProgrammingJokesJSON/refs/heads/main/jokes.json
    @GET("atilsamancioglu/ProgrammingJokesJSON/main/jokes.json")
    fun getData() : Call<List<Joke>>


}