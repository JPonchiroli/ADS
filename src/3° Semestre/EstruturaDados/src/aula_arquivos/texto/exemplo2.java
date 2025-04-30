package aula_arquivos.texto;

import java.io.File;
import java.io.IOException;

public class exemplo2 {
    public static void main(String[] args) throws IOException {
        String local = "C:\\Users\\joao_ponchiroli\\Documents\\";

        File diretorio = new File(local + "novo");

        File subDir1 = new File(diretorio, "subdir1");
        File subDir2 = new File(diretorio, "subdir2");
        subDir1.mkdir();
        subDir2.mkdir();

        File arquivo = new File(diretorio + "arquivoVazio.txt");

        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }

        String arquivos[] = diretorio.list();
        for (String nome : arquivos) {
            File filho = new File(diretorio, nome);
            if (filho.isDirectory())
                System.out.println("[X] ");
            else
                System.out.println("[] ");
            System.out.println(filho.getAbsolutePath());
        }
    }
}
