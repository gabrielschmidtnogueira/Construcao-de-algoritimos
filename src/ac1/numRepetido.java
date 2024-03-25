package ac1;

import javax.swing.JOptionPane;

public class numRepetido {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro numero"));

        if (num1 == num2 || num1 == num3) {
            JOptionPane.showMessageDialog(null, "o numero " + num1 + " é repetido");
        } else if (num2 == num3) {
            JOptionPane.showMessageDialog(null, "o numero " + num2 + " é repetido");
        } else {
            JOptionPane.showMessageDialog(null, "nenhum numero é repetido");
        }

    }

}
