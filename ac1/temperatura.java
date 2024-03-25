import javax.swing.JOptionPane;

public class temperatura {
    public static void main(String[] args) {
        double min = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura minima"));
        double max = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura maxima"));
        double temp = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura atual"));

        if (temp < min) {
            JOptionPane.showMessageDialog(null, "a temperatura esta muito baixa");
        } else if (temp > max) {
            JOptionPane.showMessageDialog(null, "a temperatura esta muito alta");
        } else if (temp == min || temp == max) {
            JOptionPane.showMessageDialog(null, "a temperatura esta no limite");
        }
    }
}
