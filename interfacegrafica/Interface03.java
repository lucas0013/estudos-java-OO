package interfacegrafica;

import javax.swing.JOptionPane;

public class Interface03 {

	public static void main(String args[]) {

		String nome;
		int resposta;

		nome = JOptionPane.showInputDialog("Qual � o seu nome?");

		resposta = JOptionPane.showConfirmDialog(null, "O sue nome �" + nome + "?");

		if (resposta == JOptionPane.YES_OPTION)
			JOptionPane.showMessageDialog(null, "Seu nome � " + nome);
		else
			JOptionPane.showMessageDialog(null, "Seu nome n�o � " + nome);
	}

}
