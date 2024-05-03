package aula9;

import javax.swing.*;

public class Mes {
    public static void main(String[] args) {
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Insira um mês"));

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Tem 31 dias");
                break;
            case 4, 6, 9, 11:
                System.out.println("Tem 30 dias");
                break;
            case 2:
                System.out.println("Tem 28 dias");
                break;
            default:
                System.out.println("Numero não é valido");
                break;
        }

    }
}
