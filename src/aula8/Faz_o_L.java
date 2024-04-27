package aula8;

public class Faz_o_L {
    public static void main(String[] args) {
        String[][] matrix = new String[5][10];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 4 || j == 0) {
                    matrix[i][j] = "*";
                } else {
                    matrix[i][j] = ".";
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
