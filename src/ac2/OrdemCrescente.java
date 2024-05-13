package ac2;

import javax.swing.*;
import java.util.Arrays;

public class OrdemCrescente {
    public static void main(String[] args) {
        /*
        Crie um programa que recebe 10 números e os exibe em ordem crescente.
         */

        int[] numeros = new int[10];
        int controle;
        int j2;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + (i + 1) + "° numero"));
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j1 = 0; j1 < numeros.length - 1; j1++) {
                j2 = j1 + 1;
                if (numeros[j1] > numeros[j2]) {
                    controle = numeros[j1];
                    numeros[j1] = numeros[j2];
                    numeros[j2] = controle;
                }
            }
        }
        System.out.println(Arrays.toString(numeros));

    }
}
