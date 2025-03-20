package aula02.texto;

import java.io.File;
import java.io.IOException;

public class criarArquivo {
    public static void main(String[] args) {
        File arquivo = new File("C:\\Users\\joao_ponchiroli\\Documents\\arquivo1.txt");

        try {
            arquivo.createNewFile();
            System.out.print("Arquivo criado com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
