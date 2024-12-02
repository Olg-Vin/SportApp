package com.vinio.sportapp.fragments.bottoms

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.vinio.sportapp.R

@Composable
fun Footer(modifier: Modifier = Modifier, navController: NavController) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp), // Отступы вокруг Row
        horizontalArrangement = Arrangement.spacedBy(16.dp) // Отступы между кнопками
    ) {
        // Первая кнопка
        Button(
            onClick = { navController.navigate(R.id.homeFragment) },
            modifier = Modifier.weight(1f) // Каждая кнопка займет равное пространство
        ) {
            Text("Дом")
        }

        // Вторая кнопка
        Button(
            onClick = { /* Обработка нажатия */ },
            modifier = Modifier.weight(1f) // Каждая кнопка займет равное пространство
        ) {
            Text("Календарь")
        }

        // Третья кнопка
        Button(
            onClick = { /* Обработка нажатия */ },
            modifier = Modifier.weight(1f) // Каждая кнопка займет равное пространство
        ) {
            Text("Обед")
        }

        // Четвёртая кнопка
        Button(
            onClick = { navController.navigate(R.id.settingsFragment) },
            modifier = Modifier.weight(1f) // Каждая кнопка займет равное пространство
        ) {
            Text("Настройки")
        }
    }
}
