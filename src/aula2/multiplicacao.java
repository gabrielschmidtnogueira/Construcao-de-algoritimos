package aula2;

import javax.swing.JOptionPane;

public class multiplicacao {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero:"));
        int resultado = num1 * num2;

        JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + resultado);
    }
}
