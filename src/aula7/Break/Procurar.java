package aula7.Break;

import javax.swing.*;

public class Procurar {
    public static void main(String[] args) {
        int[] numeros = new int[4];
        boolean achado = false;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("insira um numero"));
        }
        int num = Integer.parseInt(JOptionPane.showInputDialog("qual numero procurar"));
        for (int i = 0; i < numeros.length; i++) {
            if (num == numeros[i]) {
                JOptionPane.showMessageDialog(null, "o numero se envontra na posição " + (i + 1));
                achado = true;
            }
        }
        if (achado == false) {
            JOptionPane.showMessageDialog(null, "o numero não foi encontrado");
        }
    }

}
