/* Alunos: 
Ágatha Martiniano Fernandes - Matrícula: 20197707303
Lucas dos Santos de Sousa - Matrícula: 20191108940
Renan Cesar Ribeiro da Costa - Matrícula: 20182101187
Ygor Pereira de Sá – Matrícula: 20181102385
*/           
package a2;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc1 = new Scanner(System.in);
		Empregado[] arr = new Empregado[5];
		
		for (int i=0; i<5; i++) {
		   System.out.println("--------------------------------------------- ");
		   System.out.println("Entre com a matricula do empregado: ");
		   int matricula = sc1.nextInt();
	       sc1.nextLine();
	       System.out.println("Entre com o nome do empregado: ");
	       String nome = sc1.nextLine();
	       System.out.println("Entre com o salário do empregado: ");
	       float salario = sc1.nextFloat();
	       arr[i] = new Empregado(matricula, nome, salario);
	       if (i==4)
	    	   System.out.println("--------------------------------------------- ");
		 }
	     
		 for (int i=0; i<5; i++) {
			 
            if (arr[i].salario <= 1000) {
                arr[i].salario = (float) (arr[i].salario + (arr[i].salario * 0.20));
            }
            else if (arr[i].salario >= 1000.01 && arr[i].salario <= 2000) {
            	arr[i].salario = (float) (arr[i].salario + (arr[i].salario * 0.15));
            }
            else if (arr[i].salario >= 2000.01 && arr[i].salario <= 3000) {
            	arr[i].salario = (float) (arr[i].salario + (arr[i].salario * 0.10));
            }
            else {
            	arr[i].salario = (float) (arr[i].salario + (arr[i].salario * 0.05));
            }
        }

        for (int i=0; i<5; i++) {
            if (arr[i].salario > 3000) {
                System.out.println("Matricula: " + arr[i].matricula + "  nome: " + arr[i].nome.toUpperCase() + "  Salário: " + arr[i].salario);
            }
        }
    }
}
	        
		
	