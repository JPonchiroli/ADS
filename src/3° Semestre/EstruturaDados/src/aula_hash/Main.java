package aula_hash;

public class Main {
    public static void main(String[] args) {
        TabelaHash tabela = new TabelaHash(3);

        tabela.insere(new Aluno("joao", 9, 5.5));

        tabela.imprime();

    }
}
