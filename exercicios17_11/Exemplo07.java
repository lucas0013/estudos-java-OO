package exercicios17_11;

import java.awt.GridLayout;
import javax.swing.*;

public class Exemplo07 extends JFrame{
	private JButton botao1, botao2, botao3, botao4;
	private JLabel label1, label2;
	
	public Exemplo07() {
		super("Interface Gr�fica com Swing - vers�o 07");
	}

	public void Executa(){
		botao1 = new JButton("Bot�o 1");
		botao2 = new JButton("Bot�o 2");
		botao3 = new JButton("Bot�o 3");
		botao4 = new JButton("Bot�o 4");
		
		label1 = new JLabel("Grupo Bot�es 1");
		label2 = new JLabel("Grupo Bot�es 2");
		
		setSize(600, 400);
		setLocation(500, 300);
		getContentPane().setLayout(new GridLayout(2,3));
		getContentPane().add(label1);
		getContentPane().add(botao1);
		getContentPane().add(botao2);
		getContentPane().add(label2);
		getContentPane().add(botao3);
		getContentPane().add(botao4);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		new Exemplo07().Executa();
	}
}
