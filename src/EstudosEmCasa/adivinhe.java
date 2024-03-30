package EstudosEmCasa;

import java.util.Random;
import java.util.Scanner;

public class adivinhe {
    public static void main(String[] args) {
        int numero;
        int escolha;
        do {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            System.out.println("escolha um numero entre 1 e 10");
            escolha = Integer.parseInt(scanner.nextLine());
            numero = random.nextInt(10) + 1;
            System.out.println("numero = " + numero);
            if (escolha != numero) {
                System.out.println("voce errou");
            }
        } while (numero != escolha);
        System.out.println("voce acertou!!");
    }
}
