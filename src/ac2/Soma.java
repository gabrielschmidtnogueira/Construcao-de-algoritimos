package ac2;

import javax.swing.*;

public class Soma {
    public static void main(String[] args) {
        /*
        Crie um programa que, dado um array A com 10 elementos e um número q,
        encontra 2 elementos cuja soma é igual a q, ou informe que esse par não existe.
         */

        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + (i + 1) + "° numero"));
        }

        boolean achei = false;
        int n = Integer.parseInt(JOptionPane.showInputDialog("Qual numero procurar?"));

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] + numeros[j] == n) {
                    JOptionPane.showMessageDialog(null, "Achei! " + numeros[i] + "+" + numeros[j] + "=" + n);
                    achei = true;
                    break;
                }

            }
        }
        if (!achei) {
            JOptionPane.showMessageDialog(null, "não foi encontrado uma soma que resulte em " + n);
        }
    }
}
