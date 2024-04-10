package Atividade_2;

import java.util.Scanner;

public class Exe_08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String usarioAdmin = "admin", usuario;
        int senhaAdmin = 12345, senha;

        System.out.println("Informe o Usúario");
        usuario = s.next();

        System.out.println("Informe a Senha");
        senha = s.nextInt();

        if(usarioAdmin.equals(usuario)){
            if(senhaAdmin == senha){
                System.out.println("Acesso Autorizado");
            } else {
                System.out.println("Acesso Negado");
            }
        } else {
            System.out.println("Acesso Negado");
        }
    }
}
