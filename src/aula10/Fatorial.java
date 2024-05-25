package aula10;

public class Fatorial {

    public static int fatorial(int quantidade, int num) {
        int resposta = 0;
        quantidade--;
        if (quantidade > 1) {
            num *= (quantidade);
            resposta = fatorial(quantidade, num);
            return resposta;
        } else {
            return num;
        }

    }

    public static void main(String[] args) {
        int num = 9;
        System.out.println(fatorial(num, num));
    }
}
