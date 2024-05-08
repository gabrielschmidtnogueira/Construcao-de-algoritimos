package ExerciciosFixacao;

import javax.swing.*;

public class Arroz {
    public static void main(String[] args) {
        int arroz = Integer.parseInt(JOptionPane.showInputDialog("Quantas xícaras de arroz?"));
        int agua = arroz * 2;
        float sal = (float) arroz / 2;
        int porcao = arroz * 4;

        JOptionPane.showMessageDialog(null, agua + " xícaras de agua, " + sal + " colheres de sal. Vai render " + porcao + " porções");
    }
}
