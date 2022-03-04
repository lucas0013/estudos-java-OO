package lista1;

public class Exercicio1_4 {
	public static void main(String argv[]) {
		float precoFabrica = (float) 35000;
		System.out.println("O lucro do distribuidor é: "+ (precoFabrica * 25/100));
		System.out.println("O valor dos impostos são: "+ (precoFabrica * 15/100));
		System.out.println("O preço final do veiculo é: "+ (precoFabrica + precoFabrica * 25/100 + precoFabrica * 15/100));
		
	}

}
