package aula6;

import javax.swing.*;

public class Tabuada {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));

        for (int i = 0; i <= 10; i++) {
            int multi = i * num;
            System.out.printf("%d X %d = %d\n", num, i, multi);
        }
    }
}
