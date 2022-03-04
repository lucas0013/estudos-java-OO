package exerciciointerface;

public class Triangulo implements AreaCalculavel{
	private double base = 5;
    private double altura = 5;

	public Triangulo(){
		
		
	}
    public Triangulo(double altura, double base) {
	
		this.base = base;
	
		this.altura = altura;

	}
    
    public double calculaArea() {
    	return (base * altura)/2;
    	
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
