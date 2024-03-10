import javax.swing.JOptionPane;

public class numeroMaior {
    public static void main(String[] args) {
        int numA = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero"));
        int numB = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero"));
        int numC = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro numero"));
        int[] numeros = { numA, numB, numC };

        java.util.Arrays.sort(numeros);
        JOptionPane.showMessageDialog(null, numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
    }
}
