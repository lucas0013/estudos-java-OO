package lista2;

public class Retangulo2 {
	public static void main(String argv[]) {
		int base = 5, altura = 3;
		System.out.println("A base do ret�ngulo � "+base +".");
		System.out.println("A altura do ret�ngulo � "+altura +".");
		exibeArea(base,altura);
	    exibePerimetro(base,altura);
		
		
	}
	public static void exibeArea(int b, int a ) {
		System.out.println("A �rea do ret�ngulo � "+ (b * a) +".");
		
	}
	public static void exibePerimetro(int b, int a ) {
		System.out.println("O per�metro do ret�ngulo � "+ (2*(b+a)) +".");
		
	
		
	}

}
