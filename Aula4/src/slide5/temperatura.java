import javax.swing.JOptionPane;

public class temperatura {
    public static void main(String[] args) throws Exception {

        int temperatura = Integer.parseInt(JOptionPane.showInputDialog("qual é a temperatura hoje?"));
        if (temperatura < 20) {
            JOptionPane.showMessageDialog(null, "Esta frio hoje");
        } else if (temperatura < 25) {
            JOptionPane.showMessageDialog(null, "Esta morno hoje");
        } else {
            JOptionPane.showMessageDialog(null, "Esta calor hoje");
        }

    }
}
