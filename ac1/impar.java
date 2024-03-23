import javax.swing.JOptionPane;

public class impar {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("informe um numero"));

        if (numero == 0) {
            JOptionPane.showMessageDialog(null, "o numero é zero");
        } else if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "o " + numero + " numero é par");
        } else {
            JOptionPane.showMessageDialog(null, "o " + numero + " numero é impar");
        }
    }
}
