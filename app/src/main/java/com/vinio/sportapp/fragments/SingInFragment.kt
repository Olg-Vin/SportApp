package com.vinio.sportapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.vinio.sportapp.InriaSans
import com.vinio.sportapp.Inter
import com.vinio.sportapp.R
import com.vinio.sportapp.fragments.bottoms.SignInBottom

class SingInFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val composeView = ComposeView(requireContext())
        composeView.setContent {
            SignInPlease()
        }

        return composeView
    }

    @Preview
    @Composable
    fun SignInPlease() {
        // Переменные состояния для полей ввода
        val username = remember { mutableStateOf("") }
        val password = remember { mutableStateOf("") }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Всего один шаг до спорта!",
                style = TextStyle(
                    fontFamily = InriaSans,
                    fontWeight = FontWeight.Bold,
                    fontSize = 40.sp
                ),
                modifier = Modifier
                    .width(600.dp)
//                    .height(230.dp)
                    .padding(40.dp, 100.dp, 40.dp, 130.dp),
                textAlign = TextAlign.Center
            )
            // Поле ввода для имени пользователя
            OutlinedTextField(
                value = username.value,
                onValueChange = { username.value = it },
                placeholder = {
                    Text(
                        text = "Введите ваш логин или e-mail. . . ",
                        style = TextStyle(
                            fontFamily = Inter,
                            fontWeight = FontWeight.Normal
                        )
                    )
                },
                modifier = Modifier
                    .width(300.dp)
                    .padding(bottom = 40.dp)
            )

            // Поле ввода для пароля
            OutlinedTextField(
                value = password.value,
                onValueChange = { password.value = it },
                placeholder = {
                    Text(
                        text = "Введите пароль. . .",
                        style = TextStyle(
                            fontFamily = Inter,
                            fontWeight = FontWeight.Normal
                        )
                    )
                },
                modifier = Modifier
                    .width(300.dp)
                    .padding(bottom = 40.dp)
            )

            // Кнопка
            Button(
                onClick = {
                    findNavController().navigate(R.id.action_signIn_to_home)
                },
                modifier = Modifier
                    .width(300.dp)
                    .padding(bottom = 140.dp, top = 20.dp)
            ) {
                Text("Войти")
            }

            SignInBottom(findNavController())
        }
    }
}