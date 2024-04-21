package aula8;

import javax.swing.*;

public class Alunos {
    public static void main(String[] args) {
        int[] notas = new int[10];
        int media = 0;
        int maior = 0;
        int menor = 10;
        int aprovados = 0;

        for (int nota : notas) {
            notas[nota] = Integer.parseInt(JOptionPane.showInputDialog("insira uma nota"));
            if (notas[nota] > maior) {
                maior = notas[nota];
            } else if (notas[nota] < menor) {
                menor = notas[nota];
            }
            if (notas[nota] > 6) {
                aprovados++;
            }
            media += notas[nota];
        }


        media = media / notas.length;
        JOptionPane.showMessageDialog(null, "A media da turma foi " + media);
        JOptionPane.showMessageDialog(null, "foram " + aprovados + " alunos aprovados e " + (10 - aprovados) + " reprovados");
        JOptionPane.showMessageDialog(null, "A maior nota foi " + maior);
        JOptionPane.showMessageDialog(null, "A menor nota foi " + menor);


    }
}
