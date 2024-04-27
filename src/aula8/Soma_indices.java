package aula8;

public class Soma_indices {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = i + j;
            }
        }
        Mostrar.mostrar(matrix, 10, 10);

    }
}
