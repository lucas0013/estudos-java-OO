package lista1;

public class Exercicio1_4 {
	public static void main(String argv[]) {
		float precoFabrica = (float) 35000;
		System.out.println("O lucro do distribuidor �: "+ (precoFabrica * 25/100));
		System.out.println("O valor dos impostos s�o: "+ (precoFabrica * 15/100));
		System.out.println("O pre�o final do veiculo �: "+ (precoFabrica + precoFabrica * 25/100 + precoFabrica * 15/100));
		
	}

}
