/*
 * Pista.java
 * Crie uma classe Carro:

Carro

- combustivel: Double
+ Carro(combustivel: Double)
+ Carro()
+ autonomia(): Double
+ autonomia(tipoCombustivel: String): Double
+ autonomia(tipoCombustivel: String, abastecimento: Double): Double
+ autonomia(tipoCombustivel: String, carga: boolean): Double

O método autonomia retorna a distância que o carro pode percorrer com a quantidade de
combustível disponível, o tipo de combustível e a carga transportada. Caso o carro esteja abastecido
com gasolina percorrerá 12 Km/L, caso esteja abastecido com etanol percorrerá 8 Km/L. Caso o
veículo esteja transportando carga a autonomia é reduzida em 30%.
Se o método autonomia não receber parâmetros ele considera que o carro está abastecido com
gasolina.
Se receber a quantidade de abastecimento adiciona este ao tanque antes de efetuar o cálculo.
O construtor inicializa a quantidade de combustível do carro com o parâmetro passado ou com 0.0
caso não seja passado parâmetro.
Crie uma classe principal que instancie um carro e teste seus métodos.
Não esqueça o encapsulamento.
 */

public class Pista {
	
	public static void main (String[] args) {
		
        Carro c1 = new Carro();
        Carro c2 = new Carro(40.0);
        System.out.println("Carro 1 pode percorrer: " + c1.autonomia() + "km com gasolina");
        System.out.println("Carro 2 pode percorrer: " + c2.autonomia() + "km com gasolina");
        System.out.println("Carro 1 pode percorrer: " + c1.autonomia("gasolina", 40.0) + "km com gasolina (abasteceu 40 L)");
        System.out.println("Carro 2 pode percorrer: " + c2.autonomia("etanol") + "km com etanol");
        System.out.println("Carro 1 pode percorrer: " + c1.autonomia("gasolina", true) + "km com gasolina e com carga");
        System.out.println("Carro 2 pode percorrer: " + c2.autonomia("etanol", false) + "km com etanol e sem carga");
	}
}

