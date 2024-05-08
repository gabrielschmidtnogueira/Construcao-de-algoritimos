package ExerciciosFixacao;

import javax.swing.*;
import java.util.Objects;

public class Signo {
    public static void main(String[] args) {
        String signos[][] = {
                {"aquario", "1", "2", "21", "18"},
                {"peixes", "2", "3", "19", "20"},
                {"aries", "3", "4", "21", "20"},
                {"touro", "4", "5", "21", "20"},
                {"gemeos", "5", "6", "21", "20"},
                {"cancer", "6", "7", "21", "22"},
                {"leão", "7", "8", "23", "22"},
                {"virgem", "8", "9", "23", "22"},
                {"libra", "9", "10", "23", "22"},
                {"escorpião", "10", "11", "23", "21"},
                {"sagitario", "11", "12", "22", "21"},
                {"capricornio", "12", "1", "22", "20"}
        };

        String mes = JOptionPane.showInputDialog("Qual é o numero do mes do seu aniversario?");
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Qual é o dia do seu aniversario?"));
        String signo = "";
        for (int i = 0; i < signos.length; i++) {
            if (Objects.equals(signos[i][1], mes)) {
                if (dia > Integer.parseInt(signos[i][3])) {
                    signo = signos[i][0];
                    break;
                }

            }
            if (Objects.equals(signos[i][2], mes)) {
                if (dia < Integer.parseInt(signos[i][3])) {
                    signo = signos[i][0];
                    break;
                }

            }
        }
        System.out.println(signo);
    }
}

