package exerciciointerface;

public class Retangulo implements AreaCalculavel{
	private double base = 3;
    private double altura = 7;
    
    public Retangulo(){
		
		
	}
    

	public Retangulo(double altura, double base) {
	
		this.base = base;
	
		this.altura = altura;

	}
    
    public double calculaArea() {
    	return (base * altura);
    	
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
