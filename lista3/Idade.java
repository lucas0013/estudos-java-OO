package lista3;
import java.util.Scanner;
public class Idade {
	public static void main(String args []) {

		Scanner sc1 = new Scanner(System.in);
		int idade = sc1.nextInt();
		analisaIdade(idade);
		sc1.close();
	
	}
	
	public static void analisaIdade(int a) {
	
			System.out.println(a < 21 ?"Você ainda é menor de idade":"Você já é maior de idade");
		
	}

}
