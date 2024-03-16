import javax.swing.JOptionPane;

public class anoBissexto {
    public static void main(String[] args) {
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano"));

        if (ano % 4 == 0 && ano % 100 != 0) {
            JOptionPane.showInternalMessageDialog(null, "o ano " + ano + " é bissexto");
        } else if (ano % 4 == 0 && ano % 400 == 0) {
            JOptionPane.showInternalMessageDialog(null, "o ano " + ano + " é bissexto");
        } else {
            JOptionPane.showInternalMessageDialog(null, "o ano " + ano + " não é bissexto");
        }

    }
}
