package lista2;

public class Retangulo2 {
	public static void main(String argv[]) {
		int base = 5, altura = 3;
		System.out.println("A base do retângulo é "+base +".");
		System.out.println("A altura do retângulo é "+altura +".");
		exibeArea(base,altura);
	    exibePerimetro(base,altura);
		
		
	}
	public static void exibeArea(int b, int a ) {
		System.out.println("A área do retângulo é "+ (b * a) +".");
		
	}
	public static void exibePerimetro(int b, int a ) {
		System.out.println("O perímetro do retângulo é "+ (2*(b+a)) +".");
		
	
		
	}

}
