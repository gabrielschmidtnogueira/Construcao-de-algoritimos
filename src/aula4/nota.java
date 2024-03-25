package aula4;

import javax.swing.*;

public class nota {
    public static void main(String[] args) {
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota"));
        String resultado;
        if (nota < 30) {
            resultado = "Insatisfatório";
        } else if (nota < 50) {
            resultado = "Regular";
        } else if (nota < 80) {
            resultado = "Bom";
        } else {
            resultado = "Muito Bom";
        }
        JOptionPane.showMessageDialog(null, "a menção foi " + resultado);

    }

}
