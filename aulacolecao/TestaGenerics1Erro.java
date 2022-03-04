package aulacolecao;

public class TestaGenerics1Erro {
	public static void main(String args[]) {
		Generics1 stringObjeto = new Generics1();
		stringObjeto.setValor("incluindo uma String...");
		System.out.println(stringObjeto.getValor());
	}

}
