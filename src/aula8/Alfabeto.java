package aula8;

public class Alfabeto {
    public static void main(String[] args) {
        int valor = 65;
        String[][] tabela = new String[4][8];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                tabela[i][j] = String.valueOf((char) valor);
                valor++;
            }
        }

        Mostrar.mostrar_string(tabela,4,8);

    }
}
