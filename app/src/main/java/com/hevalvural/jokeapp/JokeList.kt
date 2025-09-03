package com.hevalvural.jokeapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.hevalvural.jokeapp.model.Joke

@Composable
fun JokeList(jokeList: List<Joke>){
    Box(modifier = Modifier.fillMaxSize().background(Color(0xFF222831)).padding(6.dp)){
        LazyColumn {
            items(jokeList) {
                JokeRow(it)
                Box(modifier = Modifier.height(2.dp).fillMaxWidth().background(Color(0xFFFFD369)))
            }
        }
    }
}