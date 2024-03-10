import javax.swing.JOptionPane;

public class positivo {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("insira um numero inteiro"));
        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "O numero " + numero + " é negativo");
        } else {
            JOptionPane.showMessageDialog(null, "O numero " + numero + " é positivo");
        }
    }
}
