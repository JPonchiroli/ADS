package praticaAV01;

import aula02.texto.leituraObj.Pessoa;

import java.io.*;
import java.util.Scanner;

public class PraticaAV01_JoaoPedroFerreiraPonchiroli {
    public static void main(String[] args) throws IOException, ClassNotFoundException{

        Scanner s = new Scanner(System.in);

        String local = "C:\\Users\\joao_ponchiroli\\Documents";
        String colecaoDesejada, nomeLivro, autorLivro, anoPublicacaoLivro;
        File colecao;

        System.out.println("##### GERENCIADOR DE COLEÇÕES DE LIVROS");
        System.out.println("##### DIRETÓRIO BASE DE EXECUÇÃO: " + local);
        System.out.println("##### João Pedro Ferreira Ponchiroli");

        int pararLoop = 0;

        System.out.println();

        while (pararLoop != 1) {
            System.out.println("Selecione uma das opções do menu abaixo:");

            System.out.println("[1] Criar nova coleção");
            System.out.println("[2] Adicionar livro");
            System.out.println("[3] Consultar informações");
            System.out.println("[4] Apagar coleção");
            System.out.println("[5] Sair");

            int opcaoDesejada = s.nextInt();

            switch (opcaoDesejada) {
                case 1:
                    String nomeColecao;
                    File novaColecao;
                    System.out.print("Informe o nome da nova coleção de livros (sem espaços ou caracteres especiais): ");
                    nomeColecao = s.next();

                    novaColecao = new File(local + "\\" + nomeColecao + ".books");

                    if (novaColecao.exists()) {
                        System.out.println("Colção " + nomeColecao + " já existe... Deseja sobrescrever (S/N)?");
                        String reescreverColecao = s.next().toUpperCase();

                        if (reescreverColecao.equals("S")) {
                            System.out.print("Informe o nome da nova coleção de livros (sem espaços ou caracteres especiais): ");
                            nomeColecao = s.next();

                            novaColecao = new File(local + "\\" + nomeColecao + ".books");
                        } else if (reescreverColecao.equals("N")) {
                            break;
                        }
                    }

                    FileOutputStream fileOutputStream = new FileOutputStream(novaColecao);
                    fileOutputStream.close();

                    System.out.println("Arquivo " + local + "\\" + nomeColecao + " criado com sucesso!\n");
                    break;
                case 2:
                    System.out.print("Informe o nome da coleção: ");
                    colecaoDesejada = s.next();

                    System.out.print("Informe o nome do livro: ");
                    nomeLivro = s.next();

                    System.out.print("Informe o nome do autor: ");
                    autorLivro = s.next();

                    System.out.print("Informe o ano de publicação do livro: ");
                    anoPublicacaoLivro = s.next();

                    Livros livro = new Livros(nomeLivro, autorLivro, anoPublicacaoLivro);

                    colecao = new File(local + "\\" + colecaoDesejada + ".books");

                    if (!colecao.exists()) {
                        System.out.println("Coleção não existe\n");
                        break;
                    } else {
                        escreverArquivo(colecao, livro);
                    }

                    break;
                case 3:
                    System.out.print("Informe o nome da coleção : ");
                    colecaoDesejada = s.next();

                    colecao = new File(local + "\\" + colecaoDesejada + ".books");

                    if (colecao.exists()) {

                        System.out.println("A coleção " + colecaoDesejada + " possui " + qtdLivros(colecao) + " títulos cadastrados!");

                        System.out.print("Deseja listar os títulos (S/N)? ");
                        String listarLivros = s.next().toUpperCase();

                        if (listarLivros.equals("S")) {
                            listarLivros(colecao);
                        } else  {
                            break;
                        }
                    }

                    break;

                case 4:
                    System.out.print("Informe o nome da coleção : ");
                    colecaoDesejada = s.next();

                    colecao = new File(local + "\\" + colecaoDesejada + ".books");

                    if (colecao.exists()){
                        colecao.delete();
                        System.out.println("Coleção: " + (local + "\\" + colecaoDesejada) + " deleteda com sucesso");
                        break;
                    } else {
                        System.out.println("Coleção não existe");
                        break;
                    }
                case 5: pararLoop = 1;
                    break;
            }
        }
    }

    private static void listarLivros(File colecao) throws IOException {
        FileReader r = new FileReader(colecao);
        BufferedReader in = new BufferedReader(r);
        String linha = in.readLine();
        int qtdLinhas = 0;

        while (linha != null) {
            System.out.println(linha);
            linha = in.readLine();
        }

        in.close();
        r.close();
    }

    private static void escreverArquivo(File colecao, Livros livro) throws IOException {
        FileWriter out = new FileWriter(colecao, true);
        out.write(livro.getTitulo() + ", ");
        out.write(livro.getAutor() + ", ");
        out.write(livro.getAno());
        out.write("   \n");
        out.close();
    }

    private static int qtdLivros(File colecao) throws IOException {
        FileReader r = new FileReader(colecao);
        BufferedReader in = new BufferedReader(r);
        String linha = in.readLine();
        int qtdLinhas = 0;

        while (linha != null) {
            linha = in.readLine();

            qtdLinhas++;
        }

        in.close();
        r.close();

        return qtdLinhas;
    }
}
