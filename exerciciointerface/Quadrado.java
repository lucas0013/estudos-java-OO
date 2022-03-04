package exerciciointerface;

public class Quadrado implements AreaCalculavel{
	private double base = 5;
    private double altura = 5;
    
    
    public Quadrado(){
		
		
	}
   	public Quadrado(double altura, double base) {
		this.base = base;
		this.altura = altura;

	}



public double calculaArea() {
	return base * altura;
	
}

public double getBase() {
    return base;
}

public double getAltura() {
    return altura;
}

public void setBase(double base) {
	this.base = base;
}

public void setAltura(double altura) {
	this.altura = altura;
}



}