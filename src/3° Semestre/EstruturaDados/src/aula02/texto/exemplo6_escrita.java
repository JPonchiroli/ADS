package aula02.texto;

import java.io.*;

public class exemplo6_escrita {
    public static void main(String[] args) {
        String local = "C:\\Users\\joao_ponchiroli\\Documents";
        File meuArquivo = new File(local + "\\teste.txt");

        try {
            FileWriter fw = new FileWriter(meuArquivo);
            BufferedWriter out = new BufferedWriter(fw);

            out.write("Essa é a primeira linha do texto \n");
            out.write("Essa é a segunda linha do texto \n");
            out.write("Essa é a terceira linha do texto \n");

            out.close();
            fw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não existe!");
        } catch (IOException e) {
            System.out.println("Erro de leitura");
        }
        System.out.println("Escrita no texto realizada!");
    }
}
