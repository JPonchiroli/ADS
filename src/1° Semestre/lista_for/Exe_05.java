public class Exe_05 {
    public static void main(String[] args) {

        int soma = 0;

        for (int i = 150; i <= 600; i++){
            if(i % 3 == 0 && i %  2 == 1){
                soma += i;
            }
        }
        System.out.println("Soma de todos os números ímpares que são múltiplos de 3 : " + soma);
    }
}
