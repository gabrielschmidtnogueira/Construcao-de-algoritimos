package slide6;

import javax.swing.JOptionPane;

public class triangulo {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Insira o comprimento da reta A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o comprimento da reta B"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Insira o comprimento da reta C"));

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                JOptionPane.showMessageDialog(null, "Esse é um triangulo equilatero");
            } else if (a == b || b == c || a == c) {
                JOptionPane.showMessageDialog(null, "Esse é um triangulo isoceles");
            } else {
                JOptionPane.showMessageDialog(null, "Esse é um triangulo escaleno");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Esse não é um triangulo valido");
        }
    }
}
