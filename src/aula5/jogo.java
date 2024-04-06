package aula5;

import javax.swing.*;
import java.util.Random;

public class jogo {
    public static int jogando(int num) {
        int minimo = 1;
        int maximo = 100;
        int jogada = -1;
        int tentativas = 10;

        while (jogada != num) {
            if (tentativas >= 1) {
                JOptionPane.showMessageDialog(null, "você tem " + tentativas + " tentativas");
                String texto = String.format("Chute um numero entre %d e %d", minimo, maximo);
                jogada = Integer.parseInt(JOptionPane.showInputDialog(texto));

                if (jogada < num && jogada > minimo) {
                    minimo = jogada;
                } else if (jogada > num && jogada < maximo) {
                    maximo = jogada;
                }


                tentativas--;
            } else {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        boolean jogando = true;
        while (jogando) {
            Random aleatorio = new Random();
            int num = aleatorio.nextInt(1, 100);

            int novoJogo = jogando(num);

            if (novoJogo == 1) {
                JOptionPane.showMessageDialog(null, "parabens!voce venceu");
            } else {
                JOptionPane.showMessageDialog(null, "voce perdeu!");
            }

            int escolha = JOptionPane.showConfirmDialog(null, "Quer jogar de novo?");
            if (escolha == JOptionPane.NO_OPTION) {
                jogando = false;
            }
        }


    }

}