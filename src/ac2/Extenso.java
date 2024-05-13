package ac2;

import javax.swing.*;

public class Extenso {
    public static void main(String[] args) {
        String[] unidades = {
                "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove"
        };
        String[] dezenas = {
                "dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "noventa", "cem"
        };

        int numero = Integer.parseInt(JOptionPane.showInputDialog("insira um numero entre 1 e 100"));

        String unidade = "";
        String dezena = "";
        if (numero / 10 >= 1) {
            dezena = dezenas[numero / 10];
            System.out.println(numero / 10);
        }

        System.out.println(dezena);
    }
}
