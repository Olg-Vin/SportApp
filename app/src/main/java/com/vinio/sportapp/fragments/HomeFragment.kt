package com.vinio.sportapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.vinio.sportapp.fragments.bottoms.Footer
import com.vinio.sportapp.fragments.cards.CardMain

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val composeView = ComposeView(requireContext())
        composeView.setContent {
            Home()
        }

        return composeView
    }

    @Preview
    @Composable
    fun Home() {
        // Используем Box для наложения элементов
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 16.dp) // Оставляем отступ для Footer
        ) {
            DateSelector("15.02", {}, {})
            // Список карточек
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 56.dp) // Отступ для размещения Footer
            ) {
                CardMain()
                Spacer(modifier = Modifier.height(8.dp))
                CardMain()
                Spacer(modifier = Modifier.height(8.dp))
                CardMain()
                Spacer(modifier = Modifier.height(8.dp))
                CardMain()
                Spacer(modifier = Modifier.height(8.dp))
                CardMain()
                Spacer(modifier = Modifier.height(8.dp))
                CardMain()
                Spacer(modifier = Modifier.height(8.dp))
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