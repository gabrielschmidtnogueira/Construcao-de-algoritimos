package aula7.vetor;

import javax.swing.*;
import java.util.Arrays;

public class Java {
    public static void main(String[] args) {

        char[] letras = JOptionPane.showInputDialog("Insira uma palavra").toCharArray();

        System.out.println(Arrays.toString(letras));

    }
}
