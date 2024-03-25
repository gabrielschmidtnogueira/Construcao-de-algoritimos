package aula4;

import javax.swing.*;

public class tempoBanho {
    public static void main(String[] args) {
        int minutos = Integer.parseInt(JOptionPane.showInputDialog("Qual foi o tempo gasto no banho (minutos)"));
        int vazao = Integer.parseInt(JOptionPane.showInputDialog("Qual é a vazão do chuveiro (litros por minuto)"));

        if (minutos * vazao > 300) {
            JOptionPane.showMessageDialog(null, "alerta, voce esta demorando no banho");
        }
    }
}
