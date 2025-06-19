package ordenacao;

public class Busca {

    public static void main(String[] args) {
        int meuVetor[] = {1, 5, 7, 56, 8, 61, 52, 29, 45, 21, 4, 9, 51, 6};

        System.out.println("Iniciando...");
        for (int i = 0; i < meuVetor.length; i++) {
            System.out.print(meuVetor[i] + " ");
        }

        int elemento = 4;

        int resultadoBusca = buscaBinariaRecursiva(elemento, meuVetor);

        if (resultadoBusca != -1) {
            System.out.println("\nO elemento " + elemento + " foi encontrado na posição " + resultadoBusca + " do vetor!");
        } else {
            System.out.println("\nO elemento " + elemento + " não está presente no vetor!");
        }
    }

    public static int buscaLinear(int chave, int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            if (chave == vetor[i]) {
                return i;
            }
        }

        return -1;
    }
    public static int buscaLinearComSentinela(int chave, int vetor[]) {
        int n = vetor.length;
        int ultimo = vetor[n - 1];
        vetor[n - 1] = chave;
        int i = 0;

        while (chave != vetor[i]) {
            i++;
        }

        vetor[n - 1] = ultimo;
        if (i < ( n - 1) || chave == vetor[n - 1]) {
            return i;
        }

        return -1;
    }


    public static int buscaLinearOrdenada(int chave, int vetor[]) {
        Ordenacao.quickSort(vetor);

        int n = vetor.length;

        for (int i = 0; i < n; i++) {
            if (chave == vetor[i]) {
                return i;
            } else if (chave < vetor[i]) {
                return -1;
            }

        }

        return -1;
    }


    public static int buscaBinaria(int chave, int vetor[]) {
        Ordenacao.quickSort(vetor);

        int n = vetor.length;
        int ini = 0;
        int fim = n - 1;
        int meio;

        while (ini <= fim) {
            meio = (ini + fim) / 2;
            if (chave < vetor[meio]) {
                fim = meio - 1;
            } else if (chave > vetor[meio]) {
                ini = meio + 1;
            } else {
                return meio;
            }

        }

        return -1;
    }

    public static int buscaBinariaRecursiva(int chave, int vetor[]) {
        Ordenacao.quickSort(vetor);

        int n = vetor.length;
        return buscaBinariaRecursivaAux(chave, vetor, 0, n-1);
    }

    public static int buscaBinariaRecursivaAux(int chave, int vetor[], int ini, int fim) {
        if (ini <= fim) {
            int meio = (ini + fim) / 2;
            if (chave < vetor[meio]) {
                return buscaBinariaRecursivaAux(chave, vetor, ini, meio);
            } else if (chave > vetor[meio]) {
                return buscaBinariaRecursivaAux(chave, vetor, meio + 1, fim);
            } else {
                return meio;
            }
        }

        return -1;
    }


    public static int buscaTernaria(int chave, int vetor[]) { return -1;}
    public static int buscaSalto(int chave, int vetor[]) { return -1;}
}