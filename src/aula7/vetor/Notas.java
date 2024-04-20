package aula7.vetor;

import javax.swing.*;
import java.util.ArrayList;

public class Notas {
    public static void main(String[] args) {
        int[] notas = new int[11];
        int media = 0;
        int notaMaior = 0;
        int alunoMaior = 0;
        ArrayList<Integer> acimaMedia = new ArrayList<Integer>();

        for (int i = 1; i < notas.length; i++) {
            notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira a nota do aluno " + i));
            media += notas[i];
            if (notaMaior < notas[i]) {
                notaMaior = notas[i];
                alunoMaior = i;
            }
        }
        media = media / notas.length;
        System.out.println("a media foi " + media);
        System.out.println("a maior nota foi " + notaMaior + " do aluno " + alunoMaior);

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                acimaMedia.add(notas[i]);
            }
        }
        System.out.print(acimaMedia);
    }
}
