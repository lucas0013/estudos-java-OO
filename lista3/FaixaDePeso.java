package lista3;
import java.util.Scanner;

public class FaixaDePeso {
	public static void main(String arg[]) {
		Scanner sc1 = new Scanner(System.in);
		double altura, peso, imc;
		System.out.println("Informe a sua altura: ");
		altura = sc1.nextDouble();
		System.out.println("Informe o seu peso: ");
		peso = sc1.nextDouble();
		imc = obtemIMC(altura,peso);
		comparaIMC(imc);
		System.out.println(peso);
		System.out.println(altura);
		System.out.println(imc);
		sc1.close();
		
	}
    public static double obtemIMC(double a, double p) {
    	return p / (a * a);
    	
    	
    }
    public static void comparaIMC(double imc) {
    	if (imc<=18.5)
    		System.out.println("Voc� est� abaixo do peso normal.");
    	if (imc> 18.5 && imc <= 25 )
    		System.out.println("O seu peso est� na faixa de normalidade.");
    	if (imc> 25 && imc <= 30 )
    		System.out.println("Voc� est� acima do seu peso normal.");
    	if (imc> 30 )
    		System.out.println("Voc� precisa perder uns quilinhos.");
    	
    	
    }
}
