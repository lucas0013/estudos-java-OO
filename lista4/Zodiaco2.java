package lista4;
import java.util.Scanner;

public class Zodiaco2 {
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
		switch(s) {
		
		case 1:
			System.out.print("Aqu�rio");
			break;
		case 2:	
			System.out.print("Peixes");
			break;
		case 3:	
	    	System.out.print("�ries");
	    	break;
		case 4:	
	    	System.out.print("Touro");
	    	break;
		case 5:		
	    	System.out.print("G�meos");
	    	break;
		case 6:	
	    	System.out.print("C�ncer");
	    	break;
		case 7:		    	
	    	System.out.print("Le�o");
	    	break;  	
		case 8:		
	    	System.out.print("Virgem");
	    	break;
		case 9:	
	    	System.out.print("Libra");
	    	break;
		case 10:		
	    	System.out.print("Escorpi�o");
	    	break;
		case 11:	
	    	System.out.print("Sagit�rio");
	    	break;
		case 12:	
	        System.out.print("Capric�rnio");
	        break;
	    
		}
		}


}
