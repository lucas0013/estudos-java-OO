package exerciciointerface;

public class Principal {

public static void main (String args[]){

Quadrado quadrado = new Quadrado(4, 4);
Retangulo retangulo = new Retangulo(5,4);
Triangulo triangulo = new Triangulo(3,5);
System.out.println("O lado do quadrado � "+quadrado.getBase());
System.out.println("A area do quadrado � "+quadrado.calculaArea());
System.out.println("-----------------------------");
System.out.println("Retangulo");
System.out.println("-----------------------------");
System.out.println("A largura do retangulo � "+retangulo.getBase());
System.out.println("A altura do retangulo � "+retangulo.getAltura());
System.out.println("A area do retangulo � "+retangulo.calculaArea());
System.out.println("-----------------------------");
System.out.println("Triangulo");
System.out.println("-----------------------------");
System.out.println("A base do triangulo � "+triangulo.getBase());
System.out.println("A altura do triangulo � "+triangulo.getAltura());
System.out.println("A area do triangulo � "+triangulo.calculaArea());
}
}