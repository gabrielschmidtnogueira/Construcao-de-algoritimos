package ac2;

import javax.swing.*;

public class CPF {
    public static void main(String[] args) {
        /*
        Escreva um programa que recebe um CPF e verifica se é válido.
         */
        String cpf = JOptionPane.showInputDialog("Insira o cpf: (apenas numeros)");
        int[] numerosCpf = new int[11];
        int soma = 0;
        int resto;


        for (int i = 0; i < cpf.length(); i++) {
            numerosCpf[i] = Character.getNumericValue(cpf.charAt(i));
        }
        for (int i = 0; i < numerosCpf.length - 1; i++) {
            soma += (11 - i) * numerosCpf[i];
        }

        resto = soma % 11;

        if (resto < 2 && numerosCpf[10] == 0) {
            System.out.println("o cpf é valido");
        } else if (numerosCpf[10] == 11 - resto) {
            System.out.println("o cpf é valido");
        } else {
            System.out.println("o cpf é invalido");
        }

    }
}
