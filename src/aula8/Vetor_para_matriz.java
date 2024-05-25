package aula8;

public class Vetor_para_matriz {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int[] vetor = new int[25];
        int indice = 0;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i;
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = vetor[indice];
                indice++;
            }
        }
        Mostrar.mostrar_int(matrix, 5, 5);
    }
}
