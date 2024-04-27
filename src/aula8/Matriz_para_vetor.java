package aula8;

import java.util.Arrays;

public class Matriz_para_vetor {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int[] vetor = new int[100];
        int indice = 0;
        int num = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = num;
                num++;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                vetor[indice] = matrix[i][j];
                indice++;
            }
        }
        System.out.println(Arrays.toString(vetor));
    }
}

