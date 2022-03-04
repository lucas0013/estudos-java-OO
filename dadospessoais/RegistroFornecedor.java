package dadospessoais;

public class RegistroFornecedor extends DadosPessoais {
	
	//atributos
	private int cnpj;
	private int limiteVenda;
	private String formaPagamento;
	private String inscricaoEstadual;
	private String representanteComercial;
	
	//construtor
	public RegistroFornecedor(String nome, String endereco, String bairro, String cidade, String estado, String cep, int telefone, int cnpj, int limiteVenda, String formaPagamento, String inscricaoEstadual, String representanteComercial) {
		
		super(nome,endereco,bairro,cidade,estado,cep,telefone);
		
		setCnpj(cnpj);
		setLimiteVenda(limiteVenda);
		setFormaPagamento(formaPagamento);
		setInscricaoEstadual(inscricaoEstadual);
		setRepresentanteComercial(representanteComercial);		
	}
	
	//Getters e Setters
	
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public int getLimiteVenda() {
		return limiteVenda;
	}
	public void setLimiteVenda(int limiteVenda) {
		this.limiteVenda = limiteVenda;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	public String getRepresentanteComercial() {
		return representanteComercial;
	}
	public void setRepresentanteComercial(String representanteComercial) {
		this.representanteComercial = representanteComercial;
	}

}
