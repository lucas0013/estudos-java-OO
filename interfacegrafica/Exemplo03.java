package interfacegrafica;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exemplo03 {
	
	public static void main(String args[]) {
		JButton botao1,botao2,botao3,botao4;
		JLabel label1,label2;
		
		JFrame janela = new JFrame("Interface Gr�fica com Swing - vers�o 3");
		
		botao1 = new JButton("Bot�o 1");
		botao2 = new JButton("Bot�o 2");
		botao3 = new JButton("Bot�o 3");
		botao4 = new JButton("Bot�o 4");
		
		label1 = new JLabel("Grupo Bot�es 1");
		label2 = new JLabel("Grupo Bot�es 2");
		
		janela.setSize(600,400);
		janela.setLocation(500,300);
		janela.getContentPane().setLayout(new FlowLayout());
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
