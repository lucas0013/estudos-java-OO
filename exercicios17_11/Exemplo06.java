package exercicios17_11;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exemplo06 {

	public static void main(String[] args) {
		JButton botao1, botao2, botao3, botao4;
		JLabel label1, label2;
		
		JFrame janela = new JFrame("Interface Gr�fica com Swing - Vers�o 06");
		
		botao1 = new JButton("Bot�o 1");
		botao2 = new JButton("Bot�o 2");
		botao3 = new JButton("Bot�o 3");
		botao4 = new JButton("Bot�o 4");
		
		label1 = new JLabel("Grupo Bot�es 1");
		label2 = new JLabel("Grupo Bot�es 2");
		
		janela.setSize(600, 400);
		janela.setLocation(500, 300);
		janela.getContentPane().setLayout(new GridLayout(2,3));
		janela.getContentPane().add(label1);
		janela.getContentPane().add(botao1);
		janela.getContentPane().add(botao2);
		janela.getContentPane().add(label2);
		janela.getContentPane().add(botao3);
		janela.getContentPane().add(botao4);
		
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
