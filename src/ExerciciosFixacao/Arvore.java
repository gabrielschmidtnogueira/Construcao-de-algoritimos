package ExerciciosFixacao;

public class Arvore {
    public static void main(String[] args) {
        int lin = 7;
        int col = (lin * 2) + 1;
        int disCol = lin;


        String[][] arvore = new String[lin][col];
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                if (j > disCol && j < col - (disCol - 1)) {
                    arvore[i][j] = "*";
                } else {
                    arvore[i][j] = " ";
                }
            }
            disCol--;
        }


        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arvore[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                if (j < (lin - 1) || j > (lin + 3)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
