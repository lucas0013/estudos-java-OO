package colecao;
import java.util.ArrayList;
import java.util.Vector;

public class TestaArrayList3 {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(1); lista.add(30); lista.add(40); lista.add(1,22);
		System.out.println("ArrayList" + lista);
		Object[] objeto = lista.toArray(); // retorna um "array" (vetor) contendo todos os objetos da lista
		System.out.println("\nObjetos: \n");
		for(int i = 0; i<lista.size();i++)
			System.out.println(objeto[i]+"");
		System.out.println();
		Vector<Character> vetor = new Vector<Character>();
		vetor.add('A'); vetor.add('C'); vetor.add('D'); vetor.add(1,'B');
		System.out.println("Vector: " + vetor);
		Object[] object = vetor.toArray();
		System.out.print("Objetos: ");
		for(int i = 0; i<vetor.size(); i++) {
			System.out.print(object[i]+"");
		}
		
		System.out.println();
	}

}
