package ExerciciosFixacao;

import javax.swing.*;

public class Ascento {
    public static void main(String[] args) {
        char[] texto = JOptionPane.showInputDialog("Insira um texto").toCharArray();

        String resultado = "";
        for (int i = 0; i < texto.length; i++) {
            switch (texto[i]) {
                case (int) 'á', 'à', 'â', 'ã':
                    texto[i] = 'a';
                    break;
                case (int) 'é', 'è', 'ê':
                    texto[i] = 'e';
                    break;
                case (int) 'ó', 'ò', 'ô':
                    texto[i] = 'o';
                    break;
                case (int) 'ú', 'ù', 'ü', 'û':
                    texto[i] = 'u';
                    break;
                case (int) 'ç':
                    texto[i] = 'c';
                    break;
            }
            resultado = resultado + texto[i];
        }
        System.out.println(resultado);
    }
}
