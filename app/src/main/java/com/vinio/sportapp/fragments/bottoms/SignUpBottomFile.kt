package com.vinio.sportapp.fragments.bottoms

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.vinio.sportapp.R

@Composable
fun SignUpBottom(navController: NavController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp), // Отступы вокруг Row
        horizontalArrangement = Arrangement.spacedBy(16.dp) // Отступы между кнопками
    ) {
        // Первая кнопка
        Button(
            onClick = { /* Обработка нажатия */ },
            modifier = Modifier.weight(1f) // Каждая кнопка займет равное пространство
        ) {
            Text("Впервые в сервисе?")
        }

        // Вторая кнопка
        Button(
            onClick = { navController.navigate(R.id.action_signUp_to_signIn) },
            modifier = Modifier.weight(1f) // Каждая кнопка займет равное пространство
        ) {
            Text("Авторизация")
        }
    }
}