package lista2;

public class Retangulo1 {
	public static void main(String argv[]) {
		int base = 5, altura = 3;
		System.out.println("A base do retângulo é "+base +".");
		System.out.println("A altura do retângulo é "+altura +".");
		System.out.println("A área do retângulo é "+ calculaArea(base,altura) +".");
		System.out.println("O perímetro do retângulo é "+ calculaPerimetro(base,altura) +".");
		
		
	}
	public static int calculaArea(int b, int a ) {
		return b * a;
		
	}
	public static int calculaPerimetro(int b, int a ) {
		return 2*(b+a);
		
	
		
	}

}
