package aula7.vetor;

public class NumerosPares {
    public static void main(String[] args) {
        int[] numeros = new int[50];
        int par = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = par;
            par += 2;
        }
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
