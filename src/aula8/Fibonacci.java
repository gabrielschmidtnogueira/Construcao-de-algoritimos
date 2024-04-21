package aula8;

import javax.swing.*;
import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        int quatidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeros da sequencia vc quer exibir"));
        ArrayList<Integer> sequencia = new ArrayList<>();
        int numero = 1;
        int antigoNumero = 1;
        int soma = 0;
        for (int i = 0; i < quatidade; i++) {
            sequencia.add(numero);

            soma = antigoNumero + numero;
            antigoNumero = numero;
            numero = soma;
        }
        System.out.println(sequencia);
    }
}
