package dadospessoais;

public class RegistroCliente extends DadosPessoais {
	
	//atributos
	private int cpf;
	private int limiteCredito;
	private String localTrabalho;
	private int telefoneContato;
	
	//construtor
	public RegistroCliente(String nome, String endereco, String bairro, String cidade, String estado, String cep, int telefone, int cpf, int limiteCredito, String localTrabalho, int telefoneContato) {
		
		super(nome,endereco,bairro,cidade,estado,cep,telefone);
		
		setCpf(cpf);
		setLimiteCredito(limiteCredito);
		setLocalTrabalho(localTrabalho);
		setTelefoneContato(telefoneContato);
		
	}
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(int limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	public String getLocalTrabalho() {
		return localTrabalho;
	}
	public void setLocalTrabalho(String localTrabalho) {
		this.localTrabalho = localTrabalho;
	}
	public int getTelefoneContato() {
		return telefoneContato;
	}
	public void setTelefoneContato(int telefoneContato) {
		this.telefoneContato = telefoneContato;
	}

	
}
