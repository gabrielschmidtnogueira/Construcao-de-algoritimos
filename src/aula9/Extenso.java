package aula9;

import javax.swing.*;

public class Extenso {
    public static void main(String[] args) {

        while (true) {

            int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero entre 0 e 10"));

            if (numero > 10 || numero < 0) {
                System.out.println("Insira um numero valido");
                continue;
            }

            String[] numero_extenso = {
                    "zero",
                    "um",
                    "dois",
                    "tres",
                    "quatro",
                    "cinco",
                    "seis",
                    "sete",
                    "oito",
                    "nove",
                    "dez"
            };

            System.out.println(numero_extenso[numero]);
            break;
        }
    }
}

