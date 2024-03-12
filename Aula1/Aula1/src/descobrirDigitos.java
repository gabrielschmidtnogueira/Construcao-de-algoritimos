import javax.swing.JOptionPane;

public class descobrirDigitos {
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
        }

        for (int i = 0; i < numerosCpf.length; i++) {
            cpfCompleto += numerosCpf[i];
        }
        JOptionPane.showMessageDialog(null, cpfCompleto);

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
        JOptionPane.showMessageDialog(null, soma);
        resto = soma % 11;
        JOptionPane.showMessageDialog(null, resto);
        if (resto < 2) {
            numeroVeri = 0;
        } else {
            numeroVeri = 11 - resto;
        }

        return numeroVeri;
    }
}