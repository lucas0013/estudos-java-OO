package colecao;
import java.util.ArrayList;

public class TestaArrayList2 {
	public static void main(String[] args) {
	
	ArrayList <String> lista = new ArrayList<String>();
	
	lista.add("Ana");
	lista.add("Joao");
	lista.add("Maria");
	lista.add("Pedro");
	
	for (Object i: lista)
		System.out.println(i);
 }
}
