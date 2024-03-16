import javax.swing.JOptionPane;

public class imposto {
    public static void main(String[] args) {
        while (true) {
            int salario = Integer.parseInt(JOptionPane.showInputDialog("Informe seu salario"));
            double resultado;
            if (salario < 400) {
                JOptionPane.showMessageDialog(null, "voce esta isento");
            } else if (salario < 600) {
                resultado = salario * 0.1;
                JOptionPane.showMessageDialog(null, "voce vai pagar " + resultado + " mesetas de imposto");
            } else {
                resultado = salario * 0.15;
                JOptionPane.showMessageDialog(null, "voce vai pagar " + resultado + " mesetas de imposto");
            }
        }

    }
}
