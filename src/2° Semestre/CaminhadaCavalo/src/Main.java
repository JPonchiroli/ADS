import java.util.Random;

public class Main {
    static String[][] tabuleiro = new String[10][10];
    static String cavalo = "C";
    static Random spawnerGerador = new Random();
    static int spawnerCavaloLinha = spawnerGerador.nextInt(9);
    static int spawnerCavaloColuna = spawnerGerador.nextInt(9);
    public static void main(String[] args) {
        inicializarTabuleiro();
        mostrarTabuleiro();
        spawnarCavalo(spawnerCavaloLinha, spawnerCavaloColuna);
        mostrarTabuleiro();

    }
    public static void inicializarTabuleiro(){
        for (int i = 0; i < tabuleiro.length; i++){
            for (int j = 0; j < tabuleiro[i].length; j++){
                tabuleiro[i][j] = "[ ]";
            }
        }
    }
    public static void mostrarTabuleiro() {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static String[][] spawnarCavalo(int spawnerCavaloLinha, int spawnerCavaloColuna){
        System.out.println(spawnerCavaloColuna + " ! " + spawnerCavaloLinha);
        tabuleiro[spawnerCavaloLinha][spawnerCavaloColuna] = "[C]";
        return tabuleiro;
    }

    public static String[][] movimentarCavalo() {
        return tabuleiro;
    }


}
