package aula_arquivos.texto;

import java.io.*;

public class exemplo4_leitura {
    public static void main(String[] args) {
        String local = "C:\\Users\\joao_ponchiroli\\Documents";
        File meuArquivo = new File(local + "\\teste.txt");

        try {
            FileReader r = new FileReader(meuArquivo);
            BufferedReader in = new BufferedReader(r);
            String linha = in.readLine();

            while ( linha != null) {
                System.out.println(linha);
                linha = in.readLine();
            }

            in.close();
            r.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não existe!");
        } catch (IOException e) {
            System.out.println("Erro de leitura");
        }
    }
}
