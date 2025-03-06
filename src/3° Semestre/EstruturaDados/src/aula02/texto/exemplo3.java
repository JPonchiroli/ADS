package aula02.texto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class exemplo3 {
    public static void main(String[] args) {
        String local = "C:\\Users\\joao_ponchiroli\\Documents";
        File meuArquivo = new File(local + "\\teste.txt");

        try {
            FileReader r = new FileReader(meuArquivo);

            int c;

            while ( (c = r.read()) != -1) {
                System.out.println("Li o caractere: " + (char) c);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
