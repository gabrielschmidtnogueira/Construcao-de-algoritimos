package ac2;

import javax.swing.*;

public class MaisProximo {
    public static void main(String[] args) {
        int diferenca = 0;
        boolean achei = false;
        int[] numeros = {1, 5, 6, 9, 50};
        int n = Integer.parseInt(JOptionPane.showInputDialog("insira um numero"));

        while (!achei) {
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] + diferenca == n || numeros[j] - diferenca == n) {
                    achei = true;
                    System.out.printf("achei! alvo: %d numero mais proximo: %d", n, numeros[j]);
                    break;
                }
            }
            diferenca++;
        }
    }
}
