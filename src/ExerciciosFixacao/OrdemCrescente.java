package ExerciciosFixacao;

import javax.swing.*;
import java.util.Arrays;

public class OrdemCrescente {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int controle;
        int j2;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j1 = 0; j1 < numeros.length; j1++) {
                j2 = j1 + 1;
                if (j2 >= numeros.length) {
                    break;
                }
                if (numeros[j1] > numeros[j2]) {
                    controle = numeros[j1];
                    numeros[j1] = numeros[j2];
                    numeros[j2] = controle;
                }
            }
            System.out.println(Arrays.toString(numeros));
        }


    }
}
