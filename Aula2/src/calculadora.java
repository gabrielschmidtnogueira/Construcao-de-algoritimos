import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class calculadora {
    public static void main(String[] args) {
        boolean continuar = true;
        do {
            try {
                float num1 = Float.parseFloat(JOptionPane.showInputDialog("Insira o primeiro numero"));
                float num2 = Float.parseFloat(JOptionPane.showInputDialog("Insira o segundo numero"));

                String[] opcoes = { "Soma",
                        "Subtração",
                        "Multiplicação",
                        "Divisão",
                        "Resto da divisão",
                        "Valor positivo do primeiro numero",
                        "Valor Negativo do segundo numero"
                };

                JComboBox<String> caixaDeOpcoes = new JComboBox<>(opcoes);

                JOptionPane.showMessageDialog(null, caixaDeOpcoes, "Escolha a operação", JOptionPane.QUESTION_MESSAGE);

                String opcao = (String) caixaDeOpcoes.getSelectedItem();

                double resultado;

                switch (opcao.toLowerCase()) {
                    case "soma":
                        resultado = num1 + num2;

                        JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + resultado);
                        break;
                    case "subtração":
                        resultado = num1 - num2;

                        JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + resultado);
                        break;
                    case "multiplicação":
                        resultado = num1 * num2;

                        JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + resultado);
                        break;
                    case "divisão":
                        resultado = num1 / num2;

                        JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + resultado);
                        break;
                    case "resto da divisão":
                        resultado = num1 % num2;

                        JOptionPane.showMessageDialog(null, num1 + " % " + num2 + " = " + resultado);
                        break;
                    case "valor positivo do primeiro numero":
                        resultado = Math.abs(num1);

                        JOptionPane.showMessageDialog(null, "o valor positivo do primeiro numero é " + resultado);
                        break;
                    case "valor negativo do segundo numero":
                        resultado = -Math.abs(num2);

                        JOptionPane.showMessageDialog(null, "o valor negativo do segundo numero é " + resultado);
                        break;
                    default:
                        break;
                }
                continuar = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por Favor informar numeros validos");
            }

        } while (continuar);

    }
}
