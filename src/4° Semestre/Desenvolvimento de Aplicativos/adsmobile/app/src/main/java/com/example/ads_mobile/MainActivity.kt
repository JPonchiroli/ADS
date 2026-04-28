package com.example.ads_mobile

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ads_mobile.ui.theme.AdsmobileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdsmobileTheme {
                // Container principal
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center, // centraliza verticalmente
                    horizontalAlignment = Alignment.CenterHorizontally // centraliza horizontalmente
                ) {
                    Button(onClick = {
                        val intent = Intent(this@MainActivity, Aula2Exercicio1Activity::class.java)
                        startActivity(intent)
                    }) {
                        Text("Aula 2 Exercício 1")
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Button(onClick = {
                        val intent = Intent(this@MainActivity, MiniCalculadoraActivity::class.java)
                        startActivity(intent)
                    }) {
                        Text("Mini Calculadora")
                    }
                }
            }
        }
    }
}

@Composable
fun HomeScreen(onNavigate: () -> Unit) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center
        ) {
            Button(onClick = onNavigate, modifier = Modifier.padding(16.dp)) {
                Text("Abrir Aula 2 Exercício 1")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHome() {
    AdsmobileTheme {
        HomeScreen {}
    }
}
