/*
 * CalculadorQuadrado.java
 *
 * Exercícios de POO
 * Codifique a classe Quadrado. A classe possui um construtor que recebe como parâmetro o valor do lado do quadrado e inicializa o atributo.
 *  Os métodos calculaArea() e calculaPerimetro() retornam respectivamente a área e o perímetro do quadrado, cujas fórmulas são as seguintes:
 * 
 *      área = lado2
 *      perímetro = 4 x lado
 * 
 *      Quadrado
 *      ~ lado: Double
 *      + calculaArea( ): Double
 *      + calculaPerimetro( ): Double
 *      + Quadrado( lado: Double )
 * 
 * Crie uma classe com o método main, instancie 2 quadrados e teste os métodos.
 */


public class CalculadorQuadrado {
	
	public static void main (String[] args) {
		
        Quadrado q1 = new Quadrado(10.0);
        Quadrado q2 = new Quadrado(15.0);
        
        System.out.print("\n Área do quadrado 1: " + q1.calcularArea());
        System.out.print("\n Área do quadrado 2: " + q2.calcularArea());
        System.out.print("\n Perímetro do quadrado 1: " + q1.calcularPerimetro());
        System.out.print("\n Perímetro do quadrado 2: " + q2.calcularPerimetro());
	}
}

