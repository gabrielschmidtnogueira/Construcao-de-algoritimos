package ExerciciosFixacao;

import javax.swing.*;

public class Radioativo {
    public static void main(String[] args) {
        double massa = Double.parseDouble(JOptionPane.showInputDialog("Insira a massa do elemento (em gramas)"));
        int tempo = 0;
        while (massa > 0.5) {
            massa = massa / 2;
            tempo++;
        }
        System.out.println("Segundos: " + tempo * 10);
        System.out.println("massa atual: " + massa);
    }
}
