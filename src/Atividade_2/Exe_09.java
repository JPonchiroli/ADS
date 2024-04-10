package Atividade_2;

import java.util.Scanner;

public class Exe_09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String cadastrarUsuario, usuario;
        int cadastrarSenha, senha;

        System.out.println("Cadastre um nome de Usúario");
        cadastrarUsuario = s.next();

        System.out.println("Cadastre uma Senha");
        cadastrarSenha = s.nextInt();

        System.out.println("Informe o Usúario");
        usuario = s.next();

        System.out.println("Informe a Senha");
        senha = s.nextInt();

        if(cadastrarUsuario.equals(usuario)){
            if(cadastrarSenha == senha){
                System.out.println("Acesso Autorizado");
            } else {
                System.out.println("Acesso Negado");
            }
        } else {
            System.out.println("Acesso Negado");
        }
    }
}
