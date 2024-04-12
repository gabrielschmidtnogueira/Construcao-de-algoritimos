package aula6;

import javax.swing.*;

public class Fatorial {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
        int resultado = num;
        
        for (int i = num; i > 1; i--) {
            resultado = resultado * (i - 1);
        }
        System.out.println(resultado);
    }
}
