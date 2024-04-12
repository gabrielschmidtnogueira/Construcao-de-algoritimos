package aula6;

import javax.swing.*;

public class SomaInteiros {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
        int resultado = num;

        for (int i = num; i > 1; i--) {
            resultado += i - 1;
        }
        System.out.println(resultado);
    }
}
