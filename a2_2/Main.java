/* Alunos: 
�gatha Martiniano Fernandes - Matr�cula: 20197707303
Lucas dos Santos de Sousa - Matr�cula: 20191108940
Renan Cesar Ribeiro da Costa - Matr�cula: 20182101187
Ygor Pereira de S� � Matr�cula: 20181102385
*/
package a2_2;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		Alunos[] arr = new Alunos[5];
		
		for (int i=0; i<5; i++) {
			System.out.println("Entre com a matricula do aluno: ");
			   int matricula = sc.nextInt();
		       sc.nextLine();
		       System.out.println("Entre com o nome do aluno: ");
		       String nome = sc.nextLine();
		       System.out.println("Entre com a idade do aluno: ");
		       int idade = sc.nextInt();
		       System.out.println("Entre com a nota av1: ");
		       float av1 = sc.nextFloat();
		       System.out.println("Entre com a nota av2: ");
		       float av2 = sc.nextFloat();
		       
		       arr[i] = new Alunos(matricula, nome, idade, av1, av2);
			
		}
		System.out.println("\n");
		for (int i=0; i<5; i++) {
			System.out.println("Nome: " + arr[i].nome + "   M�dia: " + (arr[i].av1 + arr[i].av2) / 2);
			System.out.println("Primeira letra do nome: " + arr[i].nome.charAt(0) + " Matr�cula do aluno: " + arr[i].matricula);
			System.out.println("--------------------------------------------------------------------------------------------------- ");
		}
		
		for (int i=0; i<5; i++) {
			if(arr[i].idade > 50) {
				System.out.println("\nMatr�cula do aluno com mais de 50 anos: " + arr[i].matricula);
				flag = true;
			}
		}
		if(flag == false) {
			System.out.println("\nN�o h� alunos com mais de 50 anos");
		}
	}	
}

