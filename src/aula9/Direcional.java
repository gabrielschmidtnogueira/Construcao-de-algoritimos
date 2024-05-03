package aula9;

import javax.swing.*;

public class Direcional {
    public static void main(String[] args) {
        char tecla = Character.toUpperCase(JOptionPane.showInputDialog("Insira uma tecla").charAt(0));

        switch (tecla) {
            case 'A':
                System.out.println("Esquerda");
                break;
            case 'S':
                System.out.println("Baixo");
                break;
            case 'D':
                System.out.println("Direita");
                break;
            case 'E':
                System.out.println("Cima");
                break;
            default:
                System.out.println("Tecla inválida");
        }

    }
}
