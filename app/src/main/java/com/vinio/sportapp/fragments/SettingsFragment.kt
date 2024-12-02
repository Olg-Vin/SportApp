package com.vinio.sportapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.vinio.sportapp.fragments.bottoms.Footer
import com.vinio.sportapp.fragments.cards.CardMain

class SettingsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val composeView = ComposeView(requireContext())
        composeView.setContent {
            Settings()
        }

        return composeView
    }

    @Preview
    @Composable
    fun Settings() {
        // Используем Box для наложения элементов
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 16.dp) // Оставляем отступ для Footer
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Button(
                    onClick = { /* Обработка перехода на экран личных данных */ },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Личные данные", fontWeight = FontWeight.Bold)
                }

                Button(
                    onClick = { /* Обработка перехода на экран уведомлений */ },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Уведомления", fontWeight = FontWeight.Bold)
                }

                Button(
                    onClick = { /* Обработка перехода на экран связи с устройством */ },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Связать с устройством", fontWeight = FontWeight.Bold)
                }

                Button(
                    onClick = { /* Обработка выхода */ },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Выйти", fontWeight = FontWeight.Bold)
                }
            }

            // Footer закреплён внизу
            Footer(
                modifier = Modifier
                    .align(Alignment.BottomCenter) // Закрепляем Footer внизу
                    .fillMaxWidth(),
                findNavController()
            )
        }
    }

}