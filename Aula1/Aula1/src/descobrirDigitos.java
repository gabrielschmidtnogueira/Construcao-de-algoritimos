import javax.swing.JOptionPane;

public class descobrirDigitos {
    public static void main(String[] args) {
        String cpf = JOptionPane
                .showInputDialog("Insira o cpf: (coloque um x no digito faltando. Exemplo 123456x8909)");
        int[] numerosCpf = new int[11];
        int posLetra;

        posLetra = ProcessaCpf(cpf, numerosCpf);

        if (posLetra > 9) {
            System.out.println(posLetra);
        }

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

    public static int UltimosDigitos(String cpf, int[] digitosCpf) {
        int digito = -1;
        return digito;
    }

}
