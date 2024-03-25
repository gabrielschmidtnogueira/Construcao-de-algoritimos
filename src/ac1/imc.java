import javax.swing.JOptionPane;

public class imc {
	public static void main(String[] args) {
		double peso=Double.parseDouble(JOptionPane.showInputDialog("qual é o seu peso?"));
		double altura= Double.parseDouble(JOptionPane.showInputDialog("qual é a sua altura em centimetros?"));
		
		if (altura>3) {
			altura=altura/100;
		}
		
		double imc = peso/ (altura*altura);
		String texto = String.format("%.2f", imc);
		JOptionPane.showMessageDialog(null, "Seu IMC é: "+texto);
		if(imc<18.5) {
			JOptionPane.showMessageDialog(null, "Magreza");
		}else if(imc<25) {
			JOptionPane.showMessageDialog(null, "Normal");
		}else if(imc<30) {
			JOptionPane.showMessageDialog(null, "Sobrepeso");
		}else if(imc<40) {
			JOptionPane.showMessageDialog(null, "Obesidade");
		}else{
			JOptionPane.showMessageDialog(null, "Obesidade Grave");
		}
	}
}
