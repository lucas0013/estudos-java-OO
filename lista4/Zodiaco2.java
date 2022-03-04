package lista4;
import java.util.Scanner;

public class Zodiaco2 {
	public static void main(String args[]) {
	    Scanner sc1 = new Scanner(System.in);
		System.out.println("Fale o número do seu signo: ");
	    int signo = sc1.nextInt();
	    sc1.close();
	    if(signo >= 1 && signo <= 12) {
	      System.out.print("Você é do seguinte signo do zodíaco: ");
	      imprimeSigno(signo);
	    }
	    else 
	        System.out.print("Você digitou um número errado");
	    
		
	    
	}
	public static void imprimeSigno(int s) {
		switch(s) {
		
		case 1:
			System.out.print("Aquário");
			break;
		case 2:	
			System.out.print("Peixes");
			break;
		case 3:	
	    	System.out.print("Áries");
	    	break;
		case 4:	
	    	System.out.print("Touro");
	    	break;
		case 5:		
	    	System.out.print("Gêmeos");
	    	break;
		case 6:	
	    	System.out.print("Câncer");
	    	break;
		case 7:		    	
	    	System.out.print("Leão");
	    	break;  	
		case 8:		
	    	System.out.print("Virgem");
	    	break;
		case 9:	
	    	System.out.print("Libra");
	    	break;
		case 10:		
	    	System.out.print("Escorpião");
	    	break;
		case 11:	
	    	System.out.print("Sagitário");
	    	break;
		case 12:	
	        System.out.print("Capricórnio");
	        break;
	    
		}
		}


}
