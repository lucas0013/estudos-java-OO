package interfacegrafica;

import javax.swing.JOptionPane;

public class Interface02 {
	
	public static void main(String args[]) {
		
		String n1,n2;
		int num1,num2,soma;
		
		n1 = JOptionPane.showInputDialog(null, "Entre com o primeiro n�mero: ","Entrada de Dados", JOptionPane.WARNING_MESSAGE);
		
	    n2 = JOptionPane.showInputDialog("Entre com o segundo n�mero: ");
	    
	    num1 = Integer.parseInt(n1);
	    num2 = Integer.parseInt(n2);
	    
	    soma = num1+num2;
	    
	    soma = num1+num2;
	    
	    JOptionPane.showMessageDialog(null, "A soma � " + soma, "Resultado", JOptionPane.PLAIN_MESSAGE);
	    System.exit(0);
	}

}
