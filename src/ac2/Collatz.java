package ac2;

import javax.swing.*;

public class Collatz {
    public static void main(String[] args) {
        /*
        Um pesquisador está estudando a conjectura de Collatz. Faça um programa que
        lê um número inteiro e mostre se essa conjectura se aplica a ele. Exiba todos os passos.
         */

        int n = 0;
        while (n <= 0) {
            n = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero maior que 0"));
        }
        int passos = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                System.out.println(n + "/2=" + n / 2);
                n = n / 2;
            } else {
                System.out.println(n + "*3+1=" + ((n * 3) + 1))
                ;
                n = (n * 3) + 1;
            }
            passos++;
            System.out.println(n);
        }
        System.out.println("passos: " + passos);
    }
}
