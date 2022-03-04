package dadospessoais;

public class Principal {
	public static void main(String args[]) {
		
		RegistroCliente cliente = new RegistroCliente("Roberto","Rua alegria", "Botafogo", "rio de janeiro", "RJ", "5555-5555", 86543210, 12345678, 5000, "Centro", 123456);
	    
		RegistroFornecedor fornecedor = new RegistroFornecedor("Carla", "rua das dores", "copacabana", "rio de janeiro", "RJ", "7777-7777", 56487995, 45456465, 10000, "Dinheiro", "77777777", "joao");
		
		//dados do cliente
		System.out.println("Mostrando os dados do cliente \n");
		System.out.println("Nome: "+ cliente.getNome());
		System.out.println("Endereco: "+ cliente.getEndereco());
		System.out.println("Bairro:"+ cliente.getBairro());
		System.out.println("Cidade:"+ cliente.getCidade());
		System.out.println("Telefone:"+ cliente.getTelefone());
		System.out.println("CEP:"+ cliente.getCep());
		System.out.println("CPF:"+ cliente.getCpf());
		System.out.println("Limite de Credito:"+ cliente.getLimiteCredito());
		System.out.println("Local de Trabalho: "+ cliente.getLocalTrabalho());
		System.out.println("Telefone de contato"+ cliente.getTelefoneContato());
		System.out.println("\n-------------------------------------------\n");
		
		//dados fornecedor
		System.out.println("Mostrando os dados do fornecedor \n");
		System.out.println("Nome: "+ fornecedor.getNome());
		System.out.println("Endereco: "+ fornecedor.getEndereco());
		System.out.println("Bairro:"+ fornecedor.getBairro());
		System.out.println("Cidade:"+ fornecedor.getCidade());
		System.out.println("Telefone:"+ fornecedor.getTelefone());
		System.out.println("CEP:"+ fornecedor.getCep());
		System.out.println("CNPJ:"+ fornecedor.getCnpj());
		System.out.println("Limite de Credito:"+ fornecedor.getLimiteVenda());
		System.out.println("Local de Trabalho: "+ fornecedor.getFormaPagamento());
		System.out.println("Telefone de contato"+ fornecedor.getInscricaoEstadual());
		System.out.println("Representante Comercial: "+ fornecedor.getRepresentanteComercial());
	}

}
