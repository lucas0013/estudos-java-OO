package exerciciointerface;

public class Principal {

public static void main (String args[]){

Quadrado quadrado = new Quadrado(4, 4);
Retangulo retangulo = new Retangulo(5,4);
Triangulo triangulo = new Triangulo(3,5);
System.out.println("O lado do quadrado é "+quadrado.getBase());
System.out.println("A area do quadrado é "+quadrado.calculaArea());
System.out.println("-----------------------------");
System.out.println("Retangulo");
System.out.println("-----------------------------");
System.out.println("A largura do retangulo é "+retangulo.getBase());
System.out.println("A altura do retangulo é "+retangulo.getAltura());
System.out.println("A area do retangulo é "+retangulo.calculaArea());
System.out.println("-----------------------------");
System.out.println("Triangulo");
System.out.println("-----------------------------");
System.out.println("A base do triangulo é "+triangulo.getBase());
System.out.println("A altura do triangulo é "+triangulo.getAltura());
System.out.println("A area do triangulo é "+triangulo.calculaArea());
}
}