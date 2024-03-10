import javax.swing.JOptionPane;

public class venda {
    public static void main(String[] args) {
        String produto = JOptionPane.showInputDialog("Insira o nome do produto");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço de custo do produto"));
        double venda = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço de venda do produto"));
        double lucro = venda - preco;
        JOptionPane.showMessageDialog(null, "Voce obteve R$" + lucro + " de lucro pela venda de " + produto);
    }
}
