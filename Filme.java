public class Filme {
	
	public static void main(String argv[]) {
		int script = 6 , atuacao = 9, direcao = 8;
		System.out.print("A pontua��o do filme � ");
		System.out.println(pontuarFilme(script,atuacao,direcao));
	}
	
	public static int pontuarFilme(int s, int a, int d) {
		return s + a +d;
	}

}
