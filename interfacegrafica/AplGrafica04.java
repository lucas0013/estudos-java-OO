package interfacegrafica;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class AplGrafica04 extends JFrame{
	
	private JButton botao1,botao2,botao3,botao4;
	private JLabel label1,label2;



	public AplGrafica04() {
		super("Interface Gr�fica com Swing - vers�o 04");
	}
	
	public void Executa() {
	
		botao1 = new JButton("Bot�o 1");
		botao2 = new JButton("Bot�o 2");
		botao3 = new JButton("Bot�o 3");
		botao4 = new JButton("Bot�o 4");
		
		label1 = new JLabel("Grupo Bot�es 1");
		label2 = new JLabel("Grupo Bot�es 2");
		
		setSize(600,400);
		setLocation(500,300);
		getContentPane().setLayout(new FlowLayout());
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
		new AplGrafica04().Executa();
	}
}