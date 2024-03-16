package slide6;

import javax.swing.JOptionPane;

public class segundoGrau {

    public static int quadrado(int a) {
        int resultado = a * a;
        return resultado;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor coeficiente de A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor coeficiente de B"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor coeficiente de C"));

        a = quadrado(a);
        double xP;
        double xN;
        int delta;
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "A tem que ser maior que 0");
        }

        delta = quadrado(b) - 4 * a * c;

        xP = (-b + Math.sqrt(delta)) / (2 * a);
        xN = (-b - Math.sqrt(delta)) / (2 * a);

        JOptionPane.showMessageDialog(null, "X¹ = " + xP + " x² = " + xN);
    }
}
