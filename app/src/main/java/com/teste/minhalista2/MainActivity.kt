package com.teste.minhalista2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.teste.minhalista2.ui.theme.MinhaLista2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            MinhaLista2Theme {
                MinhaListaFavorita()
            }
        }
    }
}

@Composable
fun MinhaListaFavorita() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "📝 Minha Lista de Coisas Favoritas",
            fontSize = 22.sp
        )

        val lista = listOf(
            "Personagens de dragon ball",
            "Goku",
            "Piccolo",
            "Vegeta",
            "Trunks",
            "Yamcha",
            "Kuririn",
            "Bulma",
            "Gohan"
        )

        lista.forEach { item ->
            Text(
                text = "• $item",
                fontSize = 18.sp,
                modifier = Modifier.padding(top = 4.dp)
            )
        }
    }
}