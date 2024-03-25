package aula2;

import javax.swing.JOptionPane;

public class sobrenome {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        String sobrenome = JOptionPane.showInputDialog("Qual é o seu sobrenome?");
        String nomeCompleto = nome + " " + sobrenome;

        JOptionPane.showMessageDialog(null, "Olá " + nomeCompleto);
    }
}
