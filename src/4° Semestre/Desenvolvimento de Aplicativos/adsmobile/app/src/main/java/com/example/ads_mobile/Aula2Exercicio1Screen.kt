package com.example.ads_mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ads_mobile.LoggedScreen
import com.example.ads_mobile.ui.theme.AdsmobileTheme

class Aula2Exercicio1Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AdsmobileTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Aula2Exercicio1Screen(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Aula2Exercicio1Screen(modifier: Modifier = Modifier) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val context = LocalContext.current

    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            Text(
                text = "Aula 2 Exercício 1 - Login",
                fontSize = 28.sp
            )

            TextField(
                value = username,
                onValueChange = { username = it },
                label = { Text("Usuário") },
                modifier = Modifier.fillMaxWidth()
            )

            TextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Senha") },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier.fillMaxWidth()
            )

            Button(
                onClick = {
                    if (username.isBlank() || password.isBlank()) {
                        Toast.makeText(context, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(context, "Login realizado!", Toast.LENGTH_SHORT).show()
                        val intent = Intent(context, LoggedScreen::class.java)
                        context.startActivity(intent)
                    }
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Logar")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Aula2Exercicio1Preview() {
    AdsmobileTheme {
        Aula2Exercicio1Screen()
    }
}
