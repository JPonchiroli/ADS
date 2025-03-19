package aula02.texto.leituraObj;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Pessoa p1 = new Pessoa("Joao");

        String local = "C:\\Users\\joao_ponchiroli\\Documents";
        File meuArquivo = new File(local + "\\teste.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(meuArquivo);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(p1);

        FileInputStream fileInputStream = new FileInputStream(meuArquivo);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        System.out.println(objectInputStream.readObject());

        objectInputStream.close();
        objectOutputStream.close();
    }
}
