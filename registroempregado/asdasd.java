package registroempregado;
import java.util.Scanner;

public class asdasd {
	public void main(String args[]) {
		Scanner sc1 = new Scanner(System.in);
		Empregado[] arr;
		arr = new Empregado[4];
		
		for (int i=0; i<5; i++) {
			
		   System.out.println("Entre com a matricula do empregado: ");
		   int matricula = sc1.nextInt();
	       sc1.nextLine();
	       System.out.println("Entre com o nome do empregado: ");
	       String nome = sc1.nextLine();
	       System.out.println("Entre com o salário do empregado: ");
	       float salario = sc1.nextFloat();
	       arr[i] = new Empregado(matricula, nome, salario);
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
                System.out.println("Matricula: " + arr[i].matricula + " e nome: " + arr[i].nome.toUpperCase());
            }
        }
    }
}
	        
		
	