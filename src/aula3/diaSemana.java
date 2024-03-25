package aula3;

import javax.swing.*;

public class diaSemana {
    public static void main(String[] args) {
        boolean tudoCerto = false;
        do {
            try {
                int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero entre 1 e 7"));
                String[] semana = {
                        "Domingo",
                        "Segunda-feira",
                        "Terça-feira",
                        "Quarta-feira",
                        "Quinta-feira",
                        "Sexta-feira",
                        "Sabado"
                };
                JOptionPane.showMessageDialog(null, "Hoje é " + semana[dia - 1]);
                tudoCerto = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor insira um numero valido");
            }

        } while (tudoCerto == false);

    }
}
