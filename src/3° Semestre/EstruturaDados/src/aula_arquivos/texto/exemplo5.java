package aula_arquivos.texto;

import java.io.*;

public class exemplo5 {
    public static void main(String[] args) {
        String local = "C:\\Users\\joao_ponchiroli\\Documents";
        File meuArquivo = new File(local + "\\teste.txt");

        try {
            FileWriter out = new FileWriter(meuArquivo);

            byte a = (byte) System.in.read();

            while ( a != '\n' ) {
                out.write(a);
                a = (byte) System.in.read();
            }

            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não existe!");
        } catch (IOException e) {
            System.out.println("Erro de leitura");
        }
    }
}
