// Carro.java
// Crie uma classe Carro:
//~ Carro
//~ - combustivel: Double
//~ - quilometragem: Double
//~ + Carro(combustivel: Double)
//~ + percorrerDistancia(int distancia): void
//~ + abastecer(litros: Double): void
//~ + autonomia(): Double
//~ + getCombustivel(): Double
//~ + setCombustivel(Double combustivel): void
//~ + getQuilometragem (): Double
//~ + setQuilometragem (Double quilometros): void

//~ A quilometragem inicial é 0;
//~ O método autonomia() retorna a distância que o carro pode percorrer com a quantidade de combustível disponível. 
//~ O carro percorre 12 Km/L.
//~ O método percorrerDistancia() incrementa a distância recebida na quilometragem do carro e reduz
//~ a quantidade de combustível que o veículo consumirá para percorrer a distância. Este método deve
//~ verificar se a quantidade de combustível é suficiente para realizar a viagem.
//~ O método abastecer() recebe a quantidade de combustível e incrementa no atributo combustivel.
//~ Crie uma classe Frota (main) que instancie um carro e teste seus métodos.

public class Carro {
    private Double combustivel;
    private Double quilometragem;
    
    public Carro(Double combustivel){
        if(combustivel < 0.0)
            combustivel = 0.0;
        this.combustivel = combustivel;
        this.quilometragem = 0.0;
    }
    
    public void percorrerDistancia(int distancia){
        if (distancia<1) {
            System.out.println("Distância inválida para percorrer.");
            return;
        }
        if (distancia/12 > combustivel) {
            System.out.println("O carro não possui combustível o suficente para percorrer " + distancia + "km.");
            return;
        }
        quilometragem+= distancia;
        combustivel-= (distancia/12);
        System.out.printf("O carro percorreu %dkm! Combustível disponível: %.2f\n", distancia, combustivel);
    }
    
    public void abastecer(Double litros){
        if (litros<0.01) {
            System.out.println("Quantidade de litros inválida para abastecer.");
            return;
        }
        combustivel+= litros;
        System.out.printf("O carro foi abastecido com %.2f litros! Combustível disponível: %.2f\n", litros, combustivel);
    }
    
    public Double autonomia(){
         return combustivel*12.0;
    }
    
    public Double getCombustivel() {
        return this.combustivel;
    }
    
    public void setCombustivel(Double combustivel) {
        this.combustivel = combustivel;
    }
    
    public Double getQuilometragem() {
        return this.quilometragem;
    }
    
    public void setQuilometragem(Double quilometragem) {
        this.quilometragem = quilometragem;
    }
}

