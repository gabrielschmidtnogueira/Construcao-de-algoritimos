package aula3;

import javax.swing.*;

public class dobro {
    public static void main(String[] args) throws Exception {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("insira um numero"));
        JOptionPane.showMessageDialog(null, "O dobro de " + numero + " é " + numero * 2);
    }
}
