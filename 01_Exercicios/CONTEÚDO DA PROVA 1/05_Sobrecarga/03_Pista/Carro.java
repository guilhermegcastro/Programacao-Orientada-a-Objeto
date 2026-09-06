/*
 * Carro.java
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


public class Carro {
	
    private Double combustivel;
    
    public Carro(Double combustivel){
        this.combustivel = combustivel;
    }
    
     public Carro(){
        this.combustivel = 0.0;
    }
    
    public Double autonomia(){
        return combustivel * 12;
    }
    
    public Double autonomia(String tipoCombustivel){
        if (tipoCombustivel.equalsIgnoreCase("gasolina"))
            return autonomia();
        else if (tipoCombustivel.equalsIgnoreCase("etanol"))
            return combustivel * 8; 
        else return 0.0;
    }
    
    public Double autonomia(String tipoCombustivel, Double abastecimento){
        this.combustivel += abastecimento;
        return autonomia(tipoCombustivel);
    }
    
    public Double autonomia(String tipoCombustivel, boolean carga){
        if (carga){
            return autonomia(tipoCombustivel) * 0.7;
        }
        else 
            return autonomia(tipoCombustivel);
    }
    
    public Double getCombustivel() {
        return this.combustivel;
    }
    
    public void setCombustivel(Double combustivel) {
        this.combustivel = combustivel ;
    }
    
    
}


