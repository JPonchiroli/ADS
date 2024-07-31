public class Exe_09 {
    public static void main(String[] args) {
        int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, qtdNumerosNoIntervalo = 0, qtdNumerosForaDoIntervalo = 0;

        for (int i = 0; i <= 9; i++ ){
            if(numeros[i] >= 10 && numeros[i] <= 20){
                qtdNumerosNoIntervalo++;
            } else {
                qtdNumerosForaDoIntervalo++;
            }
        }

        System.out.println("A sequência possui " + qtdNumerosNoIntervalo + " números no intervalo de 10 e 20");
        System.out.println("A sequência possui " + qtdNumerosForaDoIntervalo + " números fora do intervalo de 10 e 20");

    }
}
