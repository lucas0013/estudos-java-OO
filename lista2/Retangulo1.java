package lista2;

public class Retangulo1 {
	public static void main(String argv[]) {
		int base = 5, altura = 3;
		System.out.println("A base do ret�ngulo � "+base +".");
		System.out.println("A altura do ret�ngulo � "+altura +".");
		System.out.println("A �rea do ret�ngulo � "+ calculaArea(base,altura) +".");
		System.out.println("O per�metro do ret�ngulo � "+ calculaPerimetro(base,altura) +".");
		
		
	}
	public static int calculaArea(int b, int a ) {
		return b * a;
		
	}
	public static int calculaPerimetro(int b, int a ) {
		return 2*(b+a);
		
	
		
	}

}
