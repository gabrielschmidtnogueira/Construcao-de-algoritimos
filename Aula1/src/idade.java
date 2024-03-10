import javax.swing.JOptionPane;

public class idade {
    public static void main(String[] args) {
        int anos = Integer.parseInt(JOptionPane.showInputDialog(null, "quantos anos você tem?"));
        JOptionPane.showMessageDialog(null, "Você tem " + anos + " anos");
    }
}
