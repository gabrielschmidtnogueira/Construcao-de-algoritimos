package aula8;

public class Letra_L {
    public static void main(String[] args) {
        String[][] matrix = new String[5][6];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 4 || j == 0) {
                    matrix[i][j] = "*";
                } else {
                    matrix[i][j] = ".";
                }
            }
        }

        Mostrar.mostrar_string(matrix,5,6);
    }
}
