package ac2;


import javax.swing.*;

public class Notas {
    public static void main(String[] args) {
        /*
        Crie um programa onde o usuário informa a nota de 10 alunos e armazena em um
        array. As notas devem estar no intervalo de 0 a 10, portanto, caso informe uma
        nota inválida, deve ser informado do erro e uma nova nota deve ser solicitada. Ao
        final, exiba as 10 notas
        */
        double[] notas = new double[10];
        boolean tudoCerto = false;
        do {
            try {
                for (int i = 0; i < notas.length; i++) {
                    notas[i] = Double.parseDouble(JOptionPane.showInputDialog("qual foi a nota do aluno " + (i + 1) + "?"));
                    if (notas[i] < 0 || notas[i] > 10) {
                        JOptionPane.showMessageDialog(null, "por favor insira uma nota entre 0 e 10");
                        i--;
                    }
                }
                tudoCerto = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por Favor informar notas validas");
            }
        }
        while (!tudoCerto);
    }
}
