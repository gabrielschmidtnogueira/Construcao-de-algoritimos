package aula8;

import javax.swing.*;

public class matriz_vinte_e_cinco {
    public static void main(String[] args) {
        int tamanho_matriz = 2;
        int[][] matrix = new int[tamanho_matriz][tamanho_matriz];

        int soma = 0;

        for (int i = 0; i < tamanho_matriz; i++) {
            for (int j = 0; j < tamanho_matriz; j++) {
                matrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero da linha " + i + " e coluna " + j));
            }
        }

        Mostrar.mostrar_int(matrix, tamanho_matriz, tamanho_matriz);

        for (int i = 0; i < tamanho_matriz; i++) {
            soma += matrix[i][i];
        }

        System.out.println("a soma da diagonal principal é: " + soma);

        System.out.println(matrix[Integer.parseInt(JOptionPane.showInputDialog("em qual linha se encontra o elemento?"))]
                [Integer.parseInt(JOptionPane.showInputDialog("em qual coluna se encontra o elemento?"))]);
    }
}
