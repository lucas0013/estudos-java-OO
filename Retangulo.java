
public class Retangulo {
	public static void main (String args[]) {
		exibeArea();
		exibePerimetro();
	}
	
	public static int base=5;
	public static int altura=7;
	
	public static void exibeArea()
	{
		System.out.println("A �rea do ret�ngulo � :"+(base*altura));
	}
	public static void exibePerimetro()
	{
		System.out.println("O Per�metro do ret�ngulo � :"+(2*base+2*altura));
	}

}