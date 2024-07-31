public class Exe_08 {
    public static void main(String[] args) {
        int numeros[] = {1, -2, 3, 4, -5, 6, 7, 8, 9, -10}, qtdNegativos = 0;

        for (int i = 0; i <= 9; i++ ){
            if(numeros[i] < 0){
                qtdNegativos++;
            }
        }

        System.out.println("A sequência possui " + qtdNegativos + " números negativos");
    }
}
