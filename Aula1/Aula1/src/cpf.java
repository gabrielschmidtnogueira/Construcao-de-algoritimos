import javax.swing.JOptionPane;

public class cpf {

    public static void main(String[] args) {
        String cpf = JOptionPane.showInputDialog("Insira o cpf (apenas numeros)");
        int[] numerosCpf = new int[11];
        int[] numerosBase = new int[9];
        int[] numerosVeri = new int[2];

        int soma = 0;
        int resto = 0;

        if (cpf.length() != 11) {
            JOptionPane.showMessageDialog(null, "Digite 11 digitos");
            return;
        }
        for (int i = 0; i < 11; i++) {
            char digitoChar = cpf.charAt(i);
            if (Character.isDigit(digitoChar)) {
                numerosCpf[i] = Character.getNumericValue(digitoChar);
            } else {
                JOptionPane.showMessageDialog(null, "por favor insira apenas numeros");
                return;
            }
            // if para separar os digitos bases e os verificadores
            if (i < 9) {
                numerosBase[i] = numerosCpf[i];
            } else {
                numerosVeri[i - 9] = numerosCpf[i];
            }
        }

        for (int i = 0; i < 9; i++) {
            soma += numerosBase[i] * (10 - i);
        }

        resto = soma % 11;

        if (resto == 0 || resto == 1) {
            if (numerosVeri[0] != 0) {
                JOptionPane.showMessageDialog(null, "o 10 digito do cpf é falso");
            }
        } else {
            if (numerosVeri[0] == 11 - resto) {
                JOptionPane.showMessageDialog(null, "o 10 digito do cpf é verdadeiro");
            }
        }
        JOptionPane.showMessageDialog(null, soma);
    }
}
