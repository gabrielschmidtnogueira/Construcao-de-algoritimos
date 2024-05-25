package aula8;

public class Letra_X {
    public static void main(String[] args) {
        String[][] matrix = new String[11][11];

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == j || j == 10 - i) {
                    matrix[i][j] = "*";
                } else {
                    matrix[i][j] = " ";
                }
            }
        }

       Mostrar.mostrar_string(matrix,11,11);
    }
}
