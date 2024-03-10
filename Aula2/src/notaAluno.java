import javax.swing.JOptionPane;

public class notaAluno {
    public static void main(String[] args) {
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Qual foi a nota do aluno?"));

        if (nota < 7) {
            JOptionPane.showMessageDialog(null, "aluno reprovado");
        } else {
            JOptionPane.showMessageDialog(null, "aluno aprovado");
        }
    }
}
