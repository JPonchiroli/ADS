package aula_hash;

import java.util.Arrays;

public class TabelaHash {
    private Aluno[] tabela;

    public TabelaHash(Integer n) {
        this.tabela = new Aluno[n];
        for (int i = 0; i < n; i++) {
            tabela[i] = null;
        }
    }

    private int hash(int chave) {
        return chave % tabela.length;
    }

    public Aluno busca(int chave) {
        int h = hash(chave);
        Aluno p = tabela[h];
        if (p == null) {
            return null;
        }
        while (p != null) {
            if (p.getMatricula() == chave) {
                return p;
            } else {
                p = p.getProx();
            }
        }
        return null;
    }

    public void insere(Aluno aluno) {
        int h = hash(aluno.getMatricula());

        Aluno p = tabela[h];
        while (p != null) {
            if(p.getMatricula() == aluno.getMatricula()) {
                break;
            }

            p = p.getProx();
        }

        if (p == null) {
            p = new Aluno();
            p.setMatricula(aluno.getMatricula());
            p.setProx(tabela[h]);
        }

        p.setNome(aluno.getNome());
        p.setMediaGeral(aluno.getMediaGeral());
    }

    public boolean remove(int chave) {
        int h = hash(chave);
        Aluno p = tabela[h];
        if (p == null) {
            return false;
        }
        Aluno anterior = null;
        while (p != null) {
            if (p.getMatricula() == chave) {
                if (anterior != null) {
                    anterior.setProx(p.getProx());
                } else {
                    tabela[h] = p.getProx();
                }
                return true;
            } else {
                anterior = p;
                p = p.getProx();
            }
        }
        return false;
    }

    public void imprime() {
        for (int i = 0; i < tabela.length; i++) {
            System.out.print("Indice: " + i + " = ");
            if (tabela[i] != null) {
                Aluno tmp = tabela[i];
                while (tmp != null) {
                    System.out.print(tmp.getMatricula() + "|" + tmp.getNome() + ", ");
                    tmp = tmp.getProx();
                }
                System.out.println("");
            } else {
                System.out.println("null");
            }
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < tabela.length; i++) {
            s += "[" + i + "] ";
            if (tabela[i] != null) {
            }
        }
        return "";
    }
}
