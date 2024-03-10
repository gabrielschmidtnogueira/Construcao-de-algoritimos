import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class cpf {
    public static void main(String[] args) throws Exception {
        String cpf = JOptionPane.showInputDialog("Insira o cpf (apenas numeros)");
        String[] numerosCpf = cpf.split("");
        int produtosDosDigitos;
        int teste2;
        int resultado2;
        int somaDosProdutos = 0;
        int restoDaDivisao;

        List<Integer> numeros = new ArrayList<>();

        for (String numeroCpf : numerosCpf) {
            numeros.add(Integer.parseInt(numeroCpf));
        }

        for (int i = 0; i < numerosCpf.length; i++) {
            produtosDosDigitos = Integer.parseInt(numerosCpf[8 - i]) * (i + 2);
            somaDosProdutos += produtosDosDigitos;

        }

        restoDaDivisao = somaDosProdutos % 11;

        JOptionPane.showMessageDialog(null, "resultado da soma: " + somaDosProdutos);
        JOptionPane.showMessageDialog(null, "resto da divisao por 11: " + restoDaDivisao);
        JOptionPane.showMessageDialog(null, "subitrair 11 do resto da divisao: " + (restoDaDivisao - 11));

    }
}
