package ExerciciosFixacao;

import javax.swing.*;

public class Encontrar {
    public static void main(String[] args) {
        boolean procurando = true;

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
        }

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));

        for (int i = 0; i < numeros.length; i++) {
            if (numero == numeros[i]) {
                JOptionPane.showMessageDialog(null, "Encontrado");
                procurando = false;
                break;
            }
        }
        if (procurando == true) {
            JOptionPane.showMessageDialog(null, "Não encontrado");
        }
    }


}

