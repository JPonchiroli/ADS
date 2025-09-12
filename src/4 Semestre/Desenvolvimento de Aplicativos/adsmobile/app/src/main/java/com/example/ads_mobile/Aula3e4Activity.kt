package com.example.ads_mobile

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity

class Aula3e4Activity : ComponentActivity() {

    fun main() {
        // === Exercício 1: Lógica do Cinema ===
        val precoPadrao = 30.0
        print("Digite a idade do cliente: ")
        val idadeCliente = readLine()?.toIntOrNull() ?: 0
        val precoFinal = if (idadeCliente < 12 || idadeCliente > 60) precoPadrao / 2 else precoPadrao
        println("Cliente com $idadeCliente anos.")
        println("Preço do ingresso: R$ $precoFinal")

        // === Exercício 2: Catálogo de Produtos ===
        val produtos = listOf("Sabonete", "Shampoo", "Pasta de Dente", "Fio Dental")
        val produtoEmPromocao = "Pasta de Dente"
        println("\nCatálogo de produtos (categoria Higiene):")
        for (produto in produtos) {
            println("Produto: $produto")
            if (produto == produtoEmPromocao) {
                println(">>> PRODUTO EM OFERTA!")
            }
        }

        // === Exercício 3: Calculadora Inteligente ===
        fun calculadora(numeroA: Double, numeroB: Double, operacao: String): Double {
            return when (operacao) {
                "+" -> numeroA + numeroB
                "-" -> numeroA - numeroB
                "*" -> numeroA * numeroB
                "/" -> numeroA / numeroB
                else -> 0.0
            }
        }

        print("\nDigite o primeiro número: ")
        val a = readLine()?.toDoubleOrNull() ?: 0.0
        print("Digite o segundo número: ")
        val b = readLine()?.toDoubleOrNull() ?: 0.0
        print("Digite a operação (+, -, *, /): ")
        val op = readLine() ?: "+"
        val resultado = calculadora(a, b, op)
        println("Resultado de $a $op $b é $resultado")

        // === Exercício 4: Contagem Regressiva ===
        fun iniciarContagemRegressiva(segundos: Int) {
            var contador = segundos
            while (contador > 0) {
                println("Contagem: $contador")
                contador--
            }
            println("Lançar!")
        }

        print("\nDigite o número de segundos para a contagem regressiva: ")
        val segundos = readLine()?.toIntOrNull() ?: 5
        iniciarContagemRegressiva(segundos)
    }

}