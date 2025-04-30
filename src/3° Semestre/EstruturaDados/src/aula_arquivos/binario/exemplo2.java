package aula_arquivos.binario;

import java.io.*;

public class exemplo2 {
    public static void main(String[] args) {

        String local = "C:\\Users\\joao_ponchiroli\\Documents";
        File meuArquivo = new File(local + "\\novo.dat");

        int i = -1;
        FileInputStream fis = null;

        try {

            if (!meuArquivo.exists()) {
                meuArquivo.createNewFile();
            }

            FileOutputStream fos = new FileOutputStream(meuArquivo);

            fos.write(new byte[] {'U', 'n', 'i', 'S', 'E', 'N', 'A', 'I'});

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado");
        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo");
        }
    }
}
