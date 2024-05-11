package ac2;

import javax.swing.*;

public class Palindromo {
    public static void main(String[] args) {
        char[] texto = JOptionPane.showInputDialog("Insira um texto").toCharArray();
        int quantidadeLetras = texto.length - 1;
        int espacoIr = 0;
        int espacoVol = 0;

        boolean palindromo = true;

        for (int i = 0; i < texto.length / 2; i++) {
            if (texto[i + espacoIr] == ' ') {
                espacoIr++;
            }
            if (texto[quantidadeLetras - i - espacoVol] == ' ') {
                espacoVol++;
            }
            if (texto[i + espacoIr] != texto[quantidadeLetras - i - espacoVol]) {
                palindromo = false;
                break;
            }
        }

        if (palindromo) {
            System.out.println("é um palindromo");
        } else {
            System.out.println("não é um palindromo");
        }
    }
}
