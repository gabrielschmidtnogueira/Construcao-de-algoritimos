package ac1;

import javax.swing.JOptionPane;

public class tresNums {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro numero"));

        if (num1 == num2 && num1 == num3) {
            JOptionPane.showMessageDialog(null, "todos os números são iguais");
        } else if (num1 != num2 && num1 != num3 && num2 != num3) {
            JOptionPane.showMessageDialog(null, "todos os números são diferentes");
        } else {
            JOptionPane.showMessageDialog(null, "apenas um número é diferente");
        }
        if (num1 <= num2 && num2 <= num3) {
            JOptionPane.showMessageDialog(null, "Os números estão em ordem crescente");
        } else {
            JOptionPane.showMessageDialog(null, "Os números não estão em ordem crescente");
        }

    }

}