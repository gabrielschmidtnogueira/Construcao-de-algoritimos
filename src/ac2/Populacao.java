package ac2;

public class Populacao {
    public static void main(String[] args) {
        /*
        Supondo que a população de um país A seja 9.000 habitantes com uma taxa anual
        de crescimento vegetativo de 3% e que a população de um país B seja de 20.000
        habitantes com uma taxa anual de crescimento vegetativo de 1,5%. Fazer um
        algoritmo que calcule número de anos necessários para que a população do país A
        ultrapasse a população do país B, mantidas essas taxas de crescimento.
         */

        int paisA = 9000;
        int paisB = 20000;
        int anos = 0;
        while (paisA < paisB) {
            paisA += paisA * 0.03;
            paisB += paisB * 0.015;
            anos++;

            System.out.println(paisA + " " + paisB);
        }
        System.out.println("anos: " + anos);
    }
}
