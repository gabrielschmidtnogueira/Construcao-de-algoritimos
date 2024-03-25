package ac1;

import javax.swing.JOptionPane;

public class promocao {
    public static void main(String[] args) {
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço original do produto"));
        double desconto = Double.parseDouble(JOptionPane.showInputDialog("Informe o desconto"));
        String precoFinal = String.format("%.2f", preco - (preco * (desconto / 100)));

        JOptionPane.showMessageDialog(null, "R$ " + precoFinal);

    }
}
