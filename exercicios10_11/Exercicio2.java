package exercicios10_11;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String args[]) {
		
		String altura, peso;
		Float Faltura, Fpeso;
		
		
		altura = JOptionPane.showInputDialog("Qual � a sua altura?");
		peso = JOptionPane.showInputDialog("Qual � o seu peso?");
		Faltura = Float.valueOf(altura).floatValue();
		Fpeso = Float.valueOf(peso).floatValue();
		JOptionPane.showMessageDialog(null, "Seu IMC � " + Fpeso/(Faltura*Faltura));
		
		System.exit(0);
	}

}
