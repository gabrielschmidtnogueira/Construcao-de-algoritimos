package aula8;

import javax.swing.*;
import java.util.ArrayList;

public class Nomes {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        int quantidade = 0;

        while (true) {
            String nome = JOptionPane.showInputDialog("Insira um nome");
            if (nome.equals("fim")) {
                break;
            } else {
                nomes.add(nome);
            }
            quantidade++;
        }
        JOptionPane.showMessageDialog(null, "Foram inseridos " + quantidade + " nomes");
        JOptionPane.showMessageDialog(null, nomes);
    }
}
