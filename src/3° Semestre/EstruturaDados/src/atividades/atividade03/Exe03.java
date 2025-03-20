package atividades.atividade03;

import java.io.*;
import java.util.*;

public class Exe03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();
        String userHome = System.getProperty("user.home");
        String filePath = userHome + "/Desktop/dados.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                Pessoa pessoa = new Pessoa(dados[0].trim(), dados[1].trim().charAt(0), Integer.parseInt(dados[2].trim()));
                pessoas.add(pessoa);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Nomes das pessoas no arquivo CSV:");
        for (Pessoa p : pessoas) {
            System.out.println(p.getNome());
        }
    }
}

class Pessoa {
    private String nome;
    private char genero;
    private int idade;

    public Pessoa(String nome, char genero, int idade) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
}
