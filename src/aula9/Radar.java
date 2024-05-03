package aula9;

import javax.swing.*;

public class Radar {
    public static void main(String[] args) {
        int max = Integer.parseInt(JOptionPane.showInputDialog("Insira a velocidade maxima"));
        int vel_carro = Integer.parseInt(JOptionPane.showInputDialog("Insira a velocidade do carro"));

        if (vel_carro > max) {
            System.out.println("carro muito rapido");
        } else if (vel_carro < (max / 2)) {
            System.out.println("carro muito lento");
        } else {
            System.out.println("tudo certo");
        }
    }
}
