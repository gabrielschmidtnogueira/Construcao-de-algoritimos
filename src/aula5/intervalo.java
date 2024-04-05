package aula5;

import javax.swing.*;
import java.util.Arrays;

public class intervalo {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira outro numero"));

        int numeros[] = {num1, num2};
        Arrays.sort(numeros);
        for (int i = numeros[0]; i <= numeros[1]; i++) {
            System.out.println(i);
        }
    }
}
