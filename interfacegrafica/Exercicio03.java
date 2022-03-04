package interfacegrafica;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Exercicio03 {
	public static void main(String args[]) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton botao1 = new JButton("Meu nome");
		JButton botao2 = new JButton("Meu sobrenome");
		JLabel label = new JLabel("Interface Gráfica");
		JTextField textfield = new JTextField("Digite aqui");
		frame.setSize(400,200);
        frame.setLocation(700,300);
        frame.setResizable(false);
        frame.add(panel);
        panel.add(label);
        panel.add(botao1);
        panel.add(botao2);
        panel.add(textfield);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        botao2.setText("Computacao");
	}
}
