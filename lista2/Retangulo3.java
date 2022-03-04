package lista2;

public class Retangulo3 {
	public static void main(String argv[]) {
		int iBase = 5, iAltura = 3;
		float fBase = (float) 6, fAltura = (float) 4;
		
		System.out.println("A base do retângulo int é "+ iBase +".");
		System.out.println("A altura do retângulo int é "+ iAltura +".");
		exibeArea(iBase,iAltura);
	    exibePerimetro(iBase,iAltura);
	    System.out.println("A base do retângulo float é "+ fBase +".");
		System.out.println("A altura do retângulo float é "+ fAltura +".");
		exibeArea(fBase,fAltura);
	    exibePerimetro(fBase,fAltura);
		
		
	}
	public static void exibeArea(int b, int a ) {
		System.out.println("A área do retângulo é "+ (b * a) +".");
		
	}
	public static void exibePerimetro(int b, int a ) {
		System.out.println("O perímetro do retângulo é "+ (2*(b+a)) +".");
		

	}
	public static void exibeArea(float b, float a ) {
		System.out.println("A área do retângulo é "+ (b * a) +".");
		
	}
	public static void exibePerimetro(float b, float a ) {
		System.out.println("O perímetro do retângulo é "+ (2*(b+a)) +".");
		

	}

}
