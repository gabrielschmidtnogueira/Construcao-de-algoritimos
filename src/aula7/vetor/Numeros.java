package aula7.vetor;

public class Numeros {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        for (int numero : numeros) {
            numeros[numero] = numero;
        }
    }
}
