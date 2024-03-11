import javax.swing.JOptionPane;

public class descobrirDigitos {
    public static void main(String[] args) {
        String cpf = JOptionPane.showInputDialog("Insira o cpf (apenas numeros)");
        int[] numerosCpf = new int[11];

        int digito1;
        int digito2;

        int soma = 0;
        int resto = 0;

        if (cpf.length() != 9) {
            JOptionPane.showMessageDialog(null, "Digite 9 digitos");
            return;
        }
        for (int i = 0; i < 9; i++) {
            char digitoChar = cpf.charAt(i);
            if (Character.isDigit(digitoChar)) {
                numerosCpf[i] = Character.getNumericValue(digitoChar);
            } else {
                JOptionPane.showMessageDialog(null, "por favor insira apenas numeros");
                return;
            }
        }

        for (int i = 0; i < 9; i++) {
            soma += numerosCpf[i] * (10 - i);
        }

        resto = soma % 11;
        digito1 = 11 - resto;

        if (resto == 1 || resto == 0) {
            digito1 = 0;
        }
        numerosCpf[9] = digito1;

        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += numerosCpf[i] * (11 - i);
        }
        resto = soma % 11;
        digito2 = 11 - resto;
        if (resto == 1 || resto == 0) {
            digito2 = 0;
        }
        numerosCpf[10] = digito2;

        cpf += numerosCpf[9];
        cpf += numerosCpf[10];
        JOptionPane.showMessageDialog(null, cpf);
    }
}
