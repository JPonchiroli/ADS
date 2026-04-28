package com.example.ads_mobile

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.ads_mobile.ui.theme.AdsmobileTheme

class MiniCalculadoraActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Apenas XML
        setContentView(R.layout.activity_mini_calculadora)

        // Referências dos componentes
        val editAnoNascimento = findViewById<EditText>(R.id.edit_ano_nascimento)
        val buttonCalcular = findViewById<Button>(R.id.button_calcular)
        val textResultado = findViewById<TextView>(R.id.text_resultado_idade)

        // Lógica do botão
        buttonCalcular.setOnClickListener {
            val anoTexto = editAnoNascimento.text.toString()
            if (anoTexto.isNotBlank()) {
                val ano = anoTexto.toIntOrNull()
                if (ano != null) {
                    if (ano <= 2025) {
                        val idade = 2025 - ano
                        textResultado.text = "Você tem (ou fará) $idade anos."
                    } else {
                        Toast.makeText(this, "Por favor, digite um ano de nascimento válido.", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(this, "Digite um número válido.", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Por favor, digite seu ano de nascimento.", Toast.LENGTH_SHORT).show()
            }
        }

        val buttonVoltar = findViewById<Button>(R.id.button_voltar)
        buttonVoltar.setOnClickListener {
            finish() // Fecha a activity atual e volta para a MainActivity
        }

    }
}