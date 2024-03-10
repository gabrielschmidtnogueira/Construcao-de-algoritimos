import javax.swing.JOptionPane;

public class relogio {
    public static void main(String[] args) {
        int minutos = Integer.parseInt(JOptionPane.showInputDialog("Quantos minutos?"));
        int horas = minutos / 60;
        int sobra = minutos % 60;

        String horario = String.format("%02d:%02d", horas, sobra);
        JOptionPane.showMessageDialog(null, horario);
    }
}
