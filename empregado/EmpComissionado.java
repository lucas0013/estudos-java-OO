package empregado;

public class EmpComissionado {
	private String nome;
	private String sobreNome;
	private String cpf;
	private double totalVendas;
	private double taxaComissao;
	
	
	
	
	public EmpComissionado (String nome, String sobreNome, 
          String cpf, double totalVendas, double taxaComissao) {
		     setNome(nome);
		     setSobrenome(sobreNome);
		     setCpf(cpf);
		     setTotalVendas(totalVendas);
		     setTaxaComissao(taxaComissao);
	       }
	public void setNome(String nome) {
	    this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setSobrenome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public String getSobrenome() {
		return sobreNome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}
	public void setTotalVendas(double totalVendas) {
		this.totalVendas = (totalVendas < 0.0) ? 0.0 : totalVendas;
	}
	public double getTotalVendas () {
		return totalVendas;		
	}
	public void setTaxaComissao(double taxaComissao) {
		this.taxaComissao = (taxaComissao < 0.0) ? 0.0 : taxaComissao;		
	}
	public double getTaxaComissao(){
		return taxaComissao;		
	}
	
	public double salario() {
		return getTaxaComissao() * getTotalVendas();
	}
}
