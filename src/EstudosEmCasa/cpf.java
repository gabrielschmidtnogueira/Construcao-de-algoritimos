package EstudosEmCasa;

import javax.swing.*;

public class cpf {
    public static void main(String[] args) {
        String cpf = JOptionPane
                .showInputDialog("Insira o cpf: (coloque um x no digito faltando. Exemplo 123456x8909)");
        int[] numerosCpf = new int[11];
        int posLetra;
        String cpfCompleto = "";

        posLetra = ProcessaCpf(cpf, numerosCpf);

        if (posLetra == 9) {
            numerosCpf[posLetra] = UltimosDigitos(numerosCpf, posLetra, 10);
        } else if (posLetra == 10) {
            numerosCpf[posLetra] = UltimosDigitos(numerosCpf, posLetra, 11);
        } else {
            if (numerosCpf[9] == 0) {
                numerosCpf[posLetra] = primeirosDigitos(numerosCpf, posLetra, 11);
            } else {
                numerosCpf[posLetra] = primeirosDigitos(numerosCpf, posLetra, 10);
            }
        }

        for (int i = 0; i < numerosCpf.length; i++) {
            if (i == 3 || i == 6) {
                cpfCompleto += ".";
                cpfCompleto += numerosCpf[i];
            } else if (i == 9) {
                cpfCompleto += "-";
                cpfCompleto += numerosCpf[i];
            } else {
                cpfCompleto += numerosCpf[i];
            }
        }
        JOptionPane.showMessageDialog(null, "o EstudosEmCasa.cpf completo é: " + cpfCompleto);

    }

    public static int ProcessaCpf(String cpf, int[] digitosCpf) {
        int posLetra = -1;
        for (int i = 0; i < cpf.length(); i++) {
            char c = cpf.charAt(i);
            if (Character.isDigit(c)) {
                digitosCpf[i] = Character.getNumericValue(c);
            } else if (Character.isLetter(c)) {
                digitosCpf[i] = 0;
                posLetra = i;

            }
        }
        return posLetra;
    }

    public static int UltimosDigitos(int[] digitosCpf, int posLetra, int digitoVeri) {
        int resto = 0;
        int soma = 0;
        int numeroVeri;

        for (int i = 0; i < digitoVeri; i++) {
            soma += digitosCpf[i] * (digitoVeri - i);
        }
        resto = soma % 11;
        if (resto < 2) {
            numeroVeri = 0;
        } else {
            numeroVeri = 11 - resto;
        }

        return numeroVeri;
    }

    public static int primeirosDigitos(int[] digitosCpf, int posLetra, int digitoVeri) {
        int soma = 0;
        int resultado = 0;
        int resto;
        int peso = digitoVeri - posLetra;

        for (int i = 0; i < digitoVeri - 1; i++) {
            soma += digitosCpf[i] * (digitoVeri - i);
        }
        resto = 11 - digitosCpf[digitoVeri - 1];

        for (int i = 0; i < digitoVeri - 1; i++) {
            resultado = soma + (peso * i);
            if (resultado % 11 == resto) {
                return i;
            }
        }

        return -1;
    }

}
