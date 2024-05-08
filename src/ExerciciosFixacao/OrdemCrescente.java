package ExerciciosFixacao;

import javax.swing.*;
import java.util.Arrays;

public class OrdemCrescente {
    public static void main(String[] args) {

        int[] numeros = new int[3];
        int controle;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
        }
        if (numeros[0] > numeros[1]) {
            controle = numeros[0];
            numeros[0] = numeros[1];
            numeros[1] = controle;
        }
        if (numeros[1] > numeros[2]) {
            controle = numeros[1];
            numeros[1] = numeros[2];
            numeros[2] = controle;
        }
        if (numeros[0] > numeros[1]) {
            controle = numeros[0];
            numeros[0] = numeros[1];
            numeros[1] = controle;
        }


        System.out.println(Arrays.toString(numeros));


    }
}
