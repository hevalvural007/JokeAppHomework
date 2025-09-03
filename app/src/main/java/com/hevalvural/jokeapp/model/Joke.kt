package com.hevalvural.jokeapp.model

data class Joke(
    val error: Boolean,
    val category: String,
    val type : String,
    val setup : String?,
    val delivery: String?,
    val joke : String?,
    val flags: Flags,
    val id: Int,
    val safe: Boolean,
    val lang: String
    )
