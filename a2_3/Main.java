/* Alunos: 
Ágatha Martiniano Fernandes - Matrícula: 20197707303
Lucas dos Santos de Sousa - Matrícula: 20191108940
Renan Cesar Ribeiro da Costa - Matrícula: 20182101187
Ygor Pereira de Sá – Matrícula: 20181102385
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
			
			System.out.println("Entre com o código do livro: ");
			int codigo = sc.nextInt();
			sc.nextLine();
			System.out.println("Entre com o título do livro: ");
			String titulo = sc.nextLine();
			System.out.println("Entre com o tipo de leitura do livro: ");
			String tipo_leitura = sc.next();
			System.out.println("Entre com o preço do livro: ");
		    float preco = sc.nextFloat(); 
		    
		    arr[i] = new Livro(codigo, titulo, tipo_leitura, preco);
		}
		    System.out.println("\n");
		    for(i=0; i<5; i++) {
		    	System.out.println("Titulo: " + arr[i].titulo.toUpperCase() + " Preço: " + arr[i].preco);
		    }
		    for(i=0; i<5; i++) {
		    	if(arr[i].tipo_leitura.toLowerCase().equals("romance")) {
		    		System.out.println("\nCódigo do livro de romance: " + arr[i].codigo );
		    		flag = true;
		    	}	
		    }
		    if(flag == false) {
				System.out.println("\nNão há livros de romance!");
			}
	}
}
