package aula3;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcoes[] = {"Iniciar o Jogo", "Configurações", "Atualizar", "Créditos", "Sair"};

        int opcao;

        do {
            System.out.println("MENU:");
            for (int i = 0; i < opcoes.length; i++) {
                System.out.println((i + 1) + " - " + opcoes[i]);
            }
            opcao = scanner.nextInt();

            switch (opcao - 1) {
                case 0:
                    System.out.println("Jogo Iniciado");
                    break;
                case 1:
                    System.out.println("Jogo configurado");
                    break;
                case 2:
                    System.out.println("Jogo atualizado");
                    break;
                case 3:
                    System.out.println("Jogo feito por: mim");
                    break;
            }
        } while (opcao != 5);
    }

}
