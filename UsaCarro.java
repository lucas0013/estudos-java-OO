public class UsaCarro{
		public static void main (String args[]) {
		Carro meuCarro = new Carro(); // instancia o objeto
		meuCarro.marca = "Palio"; // inicia o atributo marca
		meuCarro.cor = "azul"; // inicia o atributo cor
		System.out.println("Mostrando os atributos:");
		meuCarro.mostraAtributos(); //mensagem para o objeto
		System.out.println("---------");
		System.out.println("Ligando o motor...");
		meuCarro.ligaMotor(); //mensagem para ligar o carro
		System.out.println("Mostrando os atributos do objeto meuCarro:");
		meuCarro.mostraAtributos();
		System.out.println("---------");
		System.out.println("Desligando o motor...");
		meuCarro.desligaMotor();
		System.out.println("Mostrando os atributos do objeto meuCarro:");
		meuCarro.mostraAtributos();
		
		Carro outroCarro = new Carro("Tesla", "preto"); // instancia o objeto
		outroCarro.marca = "Gol"; // inicia o atributo marca
		outroCarro.cor = "prata"; // inicia o atributo cor
		System.out.println("Mostrando os atributos:");
		outroCarro.mostraAtributos(); //mensagem para o objeto
		System.out.println("---------");
		System.out.println("Ligando o motor...");
		outroCarro.ligaMotor(); //mensagem para ligar o carro
		outroCarro.acelerar();
		System.out.println("Mostrando os atributos do objeto outroCarro:");
		outroCarro.mostraAtributos();
		System.out.println("---------");
		System.out.println("Desligando o motor...");
		outroCarro.desligaMotor();
		System.out.println("Mostrando os atributos do objeto outroCarro:");
		outroCarro.mostraAtributos();
		outroCarro.acelerar();
		
		Carro Carro2 = new Carro(); // instancia o objeto
		Carro2.marca = "Toro"; // inicia o atributo marca
		Carro2.cor = "vermelha"; // inicia o atributo cor
		System.out.println("Mostrando os atributos:");
		Carro2.mostraAtributos(); //mensagem para o objeto
		System.out.println("---------");
		System.out.println("Ligando o motor...");
		Carro2.ligaMotor(); //mensagem para ligar o carro
		Carro2.acelerar();
		System.out.println("Mostrando os atributos do objeto Carro2:");
		Carro2.mostraAtributos();
		System.out.println("---------");
		System.out.println("Desligando o motor...");
	    Carro2.desligaMotor();
		System.out.println("Mostrando os atributos do objeto Carro2:");
		Carro2.mostraAtributos();
		Carro2.acelerar();
		
		
}// fim do main
} // fim da classe