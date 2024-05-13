package ac2;

import javax.swing.*;

public class Repete {
    public static void main(String[] args) {
        /*
        Crie um programa que, dado um array com 10 elementos, encontra um elemento
        que não se repete, ou informe que não há elementos únicos.
         */

        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + (i + 1) + "° numero"));
        }
        boolean serepete;
        int repetidos = 0;


        for (int i = 0; i < numeros.length; i++) {
            serepete = false;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] == numeros[i] && i != j) {
                    serepete = true;
                    repetidos++;
                }
            }
            if (!serepete) {
                JOptionPane.showMessageDialog(null, "o numero " + numeros[i] + " nao se repete");
            }
        }
        if (repetidos == 0) {
            JOptionPane.showMessageDialog(null, "não existe elementos unicos");
        }

    }
}
