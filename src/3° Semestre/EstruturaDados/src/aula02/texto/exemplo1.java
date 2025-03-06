package aula02.texto;

import java.io.File;

public class exemplo1 {
    public static void main(String[] args) {
        String local = "C:\\Users\\joao_ponchiroli\\";
        File meuArquivo = new File(local + "teste.txt");

        if (meuArquivo.exists()) {
            System.out.println(
                    "Path do arquivo " +
                            meuArquivo.getAbsolutePath()
            );
            System.out.println(
                    "Tamanho " +
                            meuArquivo.length() + "bytes"
            );
            System.out.println(
                    "Pode ser escrito? " +
                            meuArquivo.canWrite()
            );
        } else {
            System.out.println("Arquivo não existe");
        }

    }
}
