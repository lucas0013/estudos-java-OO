package lista4;
import java.util.Scanner;

public class Zodiaco1 {
	public static void main(String args[]) {
	    Scanner sc1 = new Scanner(System.in);
		System.out.println("Fale o n�mero do seu signo: ");
	    int signo = sc1.nextInt();
	    sc1.close();
	    if(signo >= 1 && signo <= 12) {
	      System.out.print("Voc� � do seguinte signo do zod�aco: ");
	      imprimeSigno(signo);
	    }
	    else 
	        System.out.print("Voc� digitou um n�mero errado");
	    
		
	    
	}
	public static void imprimeSigno(int s) {
		if(s == 1)
			System.out.print("Aqu�rio");
		if(s == 2)	
			System.out.print("Peixes");
	    if(s == 3)
	    	System.out.print("�ries");
	    if(s == 4)
	    	System.out.print("Touro");
	    if(s == 5)
	    	System.out.print("G�meos");
	    if(s == 6)	
	    	System.out.print("C�ncer");
	    if(s == 7)	    	
	    	System.out.print("Le�o");
	    if(s == 8)	
	    	System.out.print("Virgem");
	    if(s == 9)	
	    	System.out.print("Libra");
	    if(s == 10)	
	    	System.out.print("Escorpi�o");
	    if(s == 11)	
	    	System.out.print("Sagit�rio");
	    if(s == 12)
	        System.out.print("Capric�rnio");
	    
	}


}
