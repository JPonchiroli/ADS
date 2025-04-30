package aula_arquivos.binario;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class exemplo1 {
    public static void main(String[] args) {
        String local = "C:\\Users\\joao_ponchiroli\\Desktop";
        File meuArquivo = new File(local + "\\Arquivo-binario.docx");

        int i = -1;
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(meuArquivo);

            do {
                i = fis.read();
                if (i != -1) {
                    System.out.println((char) i);
                }
            } while(i != -1);

            fis.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado");
        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo");
        }
    }
}
