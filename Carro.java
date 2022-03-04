	public class Carro {
		String marca;
		String cor;
		boolean motorEstado = false;
		double rotacaoMotor = 0;
		//construtores
		
		public Carro() {
			marca = "Palio";
			cor = "azul";
			motorEstado = true;
			rotacaoMotor = 1000;
			
			
		}
		
		public Carro(String marca, String cor) {
			this.marca = marca;
			this.cor = cor;
			motorEstado = true;
			rotacaoMotor = 500;
		}
		
		//métodos
		void ligaMotor() {
		motorEstado = true;
		rotacaoMotor = 1000;
		System.out.println("O motor foi ligado.");
		}
		
		
		void desligaMotor() {
		motorEstado = false;
		rotacaoMotor = 0;
		System.out.println("O motor foi desligado.");
		}
		
		public void setCarro(String marca){
			this.marca = marca;
			
		}
		
		public void getCarro() {
			System.out.println(marca);
			System.out.println(cor);
		}
		
	
		
		void mostraAtributos() {
		System.out.println("O carro tem a cor " + cor + " e eh da marca " + marca);
		if (motorEstado)
		System.out.println("O motor ja esta ligado.");
		else {
		System.out.println("O motor esta desligado.");
		}		
		}
		
		void acelerar() {
			if (motorEstado) {
			  rotacaoMotor += 100;
			  System.out.println("Rotação atual do motor: " +rotacaoMotor+" rpm");
			}
		    else {
				  System.out.println("O motor está desligado");
	       	}
		    
		}
		void freiar() {
		    if (motorEstado) {
			  rotacaoMotor -= 100;
			  System.out.println("Rotação atual do motor: " +rotacaoMotor+" rpm");
		    }
		    else {
				  System.out.println("O motor está desligado");
	       	}
		}
	}

