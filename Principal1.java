
public class Principal1 {
	public static void main(String argv[]) {
		int script = 6, atuacao = 9, direcao = 8;
		
		System.out.print("A pontua��o de um filme � ");
		System.out.println(Filme.pontuarFilme(script, atuacao, direcao));
		
		System.out.print("A pontua��o do filme do James Bond � " );
		System.out.println(JamesBondFilme.pontuarFilme(script, atuacao, direcao));
	}

}
