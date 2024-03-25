package aula4;

import javax.swing.*;

public class segundoGrau {

    public static int quadrado(int a) {
        int resultado = a * a;
        return resultado;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor coeficiente de A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor coeficiente de B"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor coeficiente de C"));

        double xP;
        double xN;
        double delta;
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "A não pode ser 0");
        } else {
            delta = quadrado(b) - 4 * a * c;

            xP = (-b + Math.sqrt(delta)) / (2 * a);
            xN = (-b - Math.sqrt(delta)) / (2 * a);

            if (delta > 0) {
                JOptionPane.showMessageDialog(null, "X¹ = " + xP + " x² = " + xN);
            } else if (delta == 0) {
                JOptionPane.showMessageDialog(null, "X = " + xP);
            } else {
                JOptionPane.showMessageDialog(null, "a equação não admite solução real");
            }

        }

    }
}
