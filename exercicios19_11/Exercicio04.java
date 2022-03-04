package exercicios19_11;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exercicio04 extends JFrame{
	private JButton botao;
	private JLabel label1;
	private JLabel label2;
	private JTextField texto1;
	private JTextField texto2;
	private FlowLayout layout;
	private Container container;



public Exercicio04()
{
	super("Criação de um FlowLayout");
	
	layout = new FlowLayout();
	container = getContentPane();
	
	setLayout(layout);
	
	label1 = new JLabel("Temperatura em Celsius: ");
	add(label1);
	texto1 = new JTextField("", 10);
	add(texto1);
	botao = new JButton("Converter >>> ");
	add(botao);
	label2 = new JLabel("Temperatura em Fahrenheit: ");
	add(label2);
	texto2 = new JTextField("", 10);
	add(texto2);
}
public static void main(String[] args) {
	Exercicio04 fl = new Exercicio04();
	fl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fl.setSize(600, 75);
	fl.setVisible(true);
	
}

}
