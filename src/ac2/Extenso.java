package ac2;

import javax.swing.*;

public class Extenso {
    public static void main(String[] args) {
        String[] unidades = {
                "zero", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove"
        };
        String[] dezenas = {
                "zero", "dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"
        };
        String[] dezAoOnze = {
                "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"
        };

        int numero = Integer.parseInt(JOptionPane.showInputDialog("insira um numero entre 1 e 100"));

        int dezena = numero / 10;
        int unidade = numero % 10;

        if (numero > 100 || numero < 0) {
            System.out.println("insira um numero valido");
        } else if (numero == 100) {
            System.out.println("cem");
        } else if (dezena == 1) {
            System.out.println(dezAoOnze[unidade]);
        } else if (dezena == 0) {
            System.out.println(unidades[unidade]);
        } else if (dezena < 10) {
            System.out.printf("%s e %s", dezenas[dezena], unidades[unidade]);
        } else if (unidade == 0) {
            System.out.println(dezenas[dezena]);
        }
    }
}
