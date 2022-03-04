import java.util.Scanner; //biblioteca pra entrada de dados.
public class EntraDado{
	public static void main (String args[ ]) {
		float nota1=0, nota2=0, trabalho=0, media=0;
	Scanner sc = new Scanner(System.in); /*Declara um objeto chamado sc do tipo
Scanner que possibilita a entrada via teclado*/
	    System.out.println("Entre com a nota 1: ");
	    nota1=sc.nextFloat(); //A variável nota1 recebe o conteúdo do teclado
	    
	    System.out.println("Entre com a nota 2: ");
	    nota2=sc.nextFloat();
	    
	    System.out.println("Entre com a nota do Trabalho: ");
	    trabalho=sc.nextFloat();
	    
	    media=(nota1+nota2+trabalho)/3;
	    System.out.println("Media : "+ media);
	    
	    sc.close();

    }// fim main( )
} // fim classe