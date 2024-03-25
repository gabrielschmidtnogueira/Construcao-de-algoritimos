package aula2;

import javax.swing.JOptionPane;

public class idade1 {
    public static void main(String[] args) {
        int anos = Integer.parseInt(JOptionPane.showInputDialog(null, "quantos anos você tem?"));
        JOptionPane.showMessageDialog(null, "Você tem " + anos + " anos");
    }
}
