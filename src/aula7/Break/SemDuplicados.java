package aula7.Break;

import javax.swing.*;
import java.util.ArrayList;

public class SemDuplicados {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
        }

        ArrayList<Integer> semDuplicar = new ArrayList<Integer>();

        for (int i = 0; i < numeros.length; i++) {
            if (semDuplicar.contains(numeros[i])) {
                continue;
            }
            semDuplicar.add(numeros[i]);
        }
        System.out.println(semDuplicar);
    }
}
