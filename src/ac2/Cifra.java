package ac2;

import javax.swing.*;

public class Cifra {
    public static void main(String[] args) {
        int escolha = Integer.parseInt(JOptionPane.showInputDialog("1-codificar \n2-decifrar"));
        String frase = JOptionPane.showInputDialog("Insira a palavra a ser decrifrada");
        int chave = Integer.parseInt(JOptionPane.showInputDialog("escolha a chave da criptografia"));
        String resposta = "";

        if (escolha == 2) {
            chave *= -1;
        } else if (escolha != 1) {
            System.out.println("Por favor escolha uma opção valida");
        }

        for (int i = 0; i < frase.length(); i++) {
            int j = frase.charAt(i);
            j += chave;

            resposta = resposta + String.valueOf((char) j);
        }
        System.out.println(resposta);
    }
}
