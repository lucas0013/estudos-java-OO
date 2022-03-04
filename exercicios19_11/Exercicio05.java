package exercicios19_11;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import exercicios17_11.Exemplo07;

public class Exercicio05 extends JFrame {
	private JButton botao1, botao2, botao3, botao4, botao5, botao6, botao7, botao8, botao9, botao10, botao11, botao12;
	private JLabel label1, label2;
	private JTextField texto;
	
	public Exercicio05() {
		super("Layout de Calculadora em Java");
	}
	public void Executa(){
		botao1 = new JButton("0");
		botao2 = new JButton("1");
		botao3 = new JButton("2");
		botao4 = new JButton("3");
		botao5 = new JButton("4");
		botao6 = new JButton("5");
		botao7 = new JButton("6");
		botao8 = new JButton("7");
		botao9 = new JButton("8");
		botao10 = new JButton("9");
		botao11 = new JButton("+");
		botao12 = new JButton("=");
		
		label1 = new JLabel("Calculadora", JLabel.CENTER);
		label2 = new JLabel("Java", JLabel.RIGHT);
		
		texto = new JTextField(10);
		
		setSize(400, 200);
		setLocation(300, 500);
		getContentPane().setLayout(new GridLayout(5,3));
		getContentPane().add(label1);
		getContentPane().add(label2);
		getContentPane().add(texto);
		getContentPane().add(botao11);
		getContentPane().add(botao12);
		getContentPane().add(botao1);
		getContentPane().add(botao2);
		getContentPane().add(botao3);
		getContentPane().add(botao4);
		getContentPane().add(botao5);
		getContentPane().add(botao6);
		getContentPane().add(botao7);
		getContentPane().add(botao8);
		getContentPane().add(botao9);
		getContentPane().add(botao10);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		new Exercicio05().Executa();
	}


}
