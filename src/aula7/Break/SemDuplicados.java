package aula7.Break;

import javax.swing.*;
import java.util.ArrayList;

public class SemDuplicados {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
        }

        ArrayList<Integer> semDuplicar = new ArrayList<>();

        for (int numero : numeros) {
            if (semDuplicar.contains(numero)) {
                continue;
            }
            semDuplicar.add(numero);
        }
        System.out.println(semDuplicar);
    }
}
