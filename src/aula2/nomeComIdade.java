package aula2;

import javax.swing.JOptionPane;

public class nomeComIdade {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual é o seu nome?");

        int anos = Integer.parseInt(JOptionPane.showInputDialog(null, "quantos anos você tem?"));
        JOptionPane.showMessageDialog(null, "Olá, " + nome + "! você tem " + anos + " anos");
    }
}
