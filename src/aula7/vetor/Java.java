package aula7.vetor;

public class Java {
    public static void main(String[] args) {
        String java = "java";
        char[] letras = new char[4];
        for (int i = 0; i < java.length(); i++) {
            letras[i] = java.charAt(i);
            System.out.println(java.charAt(i));
        }

    }
}
