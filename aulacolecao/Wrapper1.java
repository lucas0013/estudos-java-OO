package aulacolecao;

public class Wrapper1 {
	public static void main(String args[]) {
		byte a = 1;
		Byte byteobj = a;
		
		int b = 10;
		Integer intobj = b;
		
		float c = 18.6f;
		Float floatobj = c;
		
		double d = 250.5;
		Double doubleobj = d;
		
		char e = 'a';
		Character charobj = e;
		
		boolean f = true;
		Boolean booleanobj = f;
		
		System.out.println("\n\nValores dos objetos Wrappers (exibindo como objetos)");
		System.out.println("Objeto Byte byteobj: " + byteobj.byteValue());
		System.out.println("Objeto Integer intobj: " + intobj.intValue());
		System.out.println("Objeto Float floatobj: " + floatobj.floatValue());
		System.out.println("Objeto Double doubleobj: " + doubleobj.doubleValue());
		System.out.println("Objeto Character charobj: " + charobj.charValue());
		System.out.println("Objeto Boolean booleanobj: " + booleanobj.booleanValue());
		
		
		//recuperando os tipos de dados dos objetos
		//unwrapping objetos para tipos primitivos de dados
		
		byte bv = byteobj;
		int iv = intobj;
		float fv = floatobj;
		double dv = doubleobj;
		char cv = charobj;
		boolean booleanv = booleanobj;
		
		System.out.println("\n\nValores Unwrapped (exibindo como tipo de dados)");
		System.out.println("byte valor, bv: " + bv);
		System.out.println("int valor, iv: " + iv);
		System.out.println("float valor, fv: " +fv);
		System.out.println("double valor, dv: " + dv);
		System.out.println("char valor, cv: " + cv);
		System.out.println("boolean valor, booleanv: " + booleanv);
	}

}
