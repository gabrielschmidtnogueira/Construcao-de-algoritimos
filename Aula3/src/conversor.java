import javax.swing.JOptionPane;

public class conversor {
    public static void main(String[] args) {
        double celcius = Double.parseDouble(JOptionPane.showInputDialog("Insira os graus Celcius"));
        double far = celcius * 9 / 5 + 32;

        JOptionPane.showMessageDialog(null, celcius + " graus celcius são " + far + " Fahrenheit");
    }
}
