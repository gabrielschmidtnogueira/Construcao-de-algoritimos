package aula9;

import javax.swing.*;

public class NotaMusical {
    public static void main(String[] args) {
        char nota = Character.toLowerCase(JOptionPane.showInputDialog("Insira uma tecla").charAt(0));
        switch (nota) {
            case 'c':
                System.out.println("Dó");
                break;
            case 'd':
                System.out.println("Ré");
                break;
            case 'e':
                System.out.println("Mi");
                break;
            case 'F':
                System.out.println("Fá");
                break;
            case 'g':
                System.out.println("Sol");
                break;
            case 'a':
                System.out.println("Lá");
                break;
            case 'b':
                System.out.println("Si");
                break;
            default:
                System.out.println("a nota não é valida");
                break;
        }
    }
}
