package com.hevalvural.jokeapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.hevalvural.jokeapp.model.Joke


@Composable
fun JokeRow(joke: Joke){
    if(joke.type == "single"){
        Column(
            modifier = Modifier.fillMaxWidth()
                .background(Color(0xFF222831))
                .padding(2.dp)
        ) {
            Text(joke.joke!!,
                color = Color(0xFFEEEEEE),
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(2.dp)
            )
        }
    }
    else{
        Column(
            modifier = Modifier.fillMaxWidth()
                .background(Color(0xFF222831))
                .padding(2.dp)
        ) {
            Text(joke.setup!!,
                color = Color(0xFFEEEEEE),
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(2.dp)
            )
            Text(joke.delivery!!,
                color = Color(0xFFEEEEEE),
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(2.dp)
            )

        }

    }
}