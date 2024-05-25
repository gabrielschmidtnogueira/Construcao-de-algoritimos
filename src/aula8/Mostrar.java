package aula8;

public class Mostrar {
    public static void mostrar_int(int[][] matriz, int tamanhoX, int tamanhoY) {
        for (int i = 0; i < tamanhoX; i++) {
            for (int j = 0; j < tamanhoY; j++) {
                System.out.print(matriz[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void mostrar_string(String[][] matriz, int tamanhoX, int tamanhoY) {
        for (int i = 0; i < tamanhoX; i++) {
            for (int j = 0; j < tamanhoY; j++) {
                System.out.print(matriz[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
