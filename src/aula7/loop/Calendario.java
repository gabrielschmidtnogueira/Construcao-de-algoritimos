package aula7.loop;

public class Calendario {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 20; j++) {
                System.out.print(j + "/");
                System.out.print(i + "\n");

            }
        }
    }
}
