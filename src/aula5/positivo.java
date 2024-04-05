package aula5;

import javax.swing.*;

public class positivo {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
        while (numero < 1) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero positivo"));
        }

        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }

    }
}
