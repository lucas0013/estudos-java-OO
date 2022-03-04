package lista4;
import java.util.Scanner;

public class Zodiaco1 {
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
		if(s == 1)
			System.out.print("Aquário");
		if(s == 2)	
			System.out.print("Peixes");
	    if(s == 3)
	    	System.out.print("Áries");
	    if(s == 4)
	    	System.out.print("Touro");
	    if(s == 5)
	    	System.out.print("Gêmeos");
	    if(s == 6)	
	    	System.out.print("Câncer");
	    if(s == 7)	    	
	    	System.out.print("Leão");
	    if(s == 8)	
	    	System.out.print("Virgem");
	    if(s == 9)	
	    	System.out.print("Libra");
	    if(s == 10)	
	    	System.out.print("Escorpião");
	    if(s == 11)	
	    	System.out.print("Sagitário");
	    if(s == 12)
	        System.out.print("Capricórnio");
	    
	}


}
