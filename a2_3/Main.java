/* Alunos: 
�gatha Martiniano Fernandes - Matr�cula: 20197707303
Lucas dos Santos de Sousa - Matr�cula: 20191108940
Renan Cesar Ribeiro da Costa - Matr�cula: 20182101187
Ygor Pereira de S� � Matr�cula: 20181102385
*/           
package a2_3;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		 Livro[] arr = new Livro[5];
		int i=0;
		
		for(i=0; i<5; i++) {
			
			System.out.println("Entre com o c�digo do livro: ");
			int codigo = sc.nextInt();
			sc.nextLine();
			System.out.println("Entre com o t�tulo do livro: ");
			String titulo = sc.nextLine();
			System.out.println("Entre com o tipo de leitura do livro: ");
			String tipo_leitura = sc.next();
			System.out.println("Entre com o pre�o do livro: ");
		    float preco = sc.nextFloat(); 
		    
		    arr[i] = new Livro(codigo, titulo, tipo_leitura, preco);
		}
		    System.out.println("\n");
		    for(i=0; i<5; i++) {
		    	System.out.println("Titulo: " + arr[i].titulo.toUpperCase() + " Pre�o: " + arr[i].preco);
		    }
		    for(i=0; i<5; i++) {
		    	if(arr[i].tipo_leitura.toLowerCase().equals("romance")) {
		    		System.out.println("\nC�digo do livro de romance: " + arr[i].codigo );
		    		flag = true;
		    	}	
		    }
		    if(flag == false) {
				System.out.println("\nN�o h� livros de romance!");
			}
	}
}
