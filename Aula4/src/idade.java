import javax.swing.JOptionPane;

public class idade {
    public static void main(String[] args) {

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual é a sua idade?"));
        if (idade >= 16) {
            if (idade < 18) {
                JOptionPane.showMessageDialog(null, "o seu voto é vacultativo");
            } else if (idade < 60) {
                JOptionPane.showMessageDialog(null, "o seu voto é obrigatorio");
            } else {
                JOptionPane.showMessageDialog(null, "o seu voto é vacultativo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "voce ainda não pode votar");
        }

    }
}
