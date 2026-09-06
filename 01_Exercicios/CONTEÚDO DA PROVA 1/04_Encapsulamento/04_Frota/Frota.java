// Frota.java
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


public class Frota {
	
	public static void main (String[] args) {
        
        Carro carro = new Carro(1.0);
        
        System.out.printf("O carro possui %.2fL de combustível, podendo percorrer %.2fkm de distância.\n", carro.getCombustivel(),carro.autonomia());
        carro.percorrerDistancia(100);
        carro.percorrerDistancia(-12);
        carro.percorrerDistancia(12);
        carro.abastecer(-12.0);
        carro.abastecer(30.0);
        System.out.printf("Combustível do carro disponível: %.2f", carro.getCombustivel());
        System.out.printf("\nQuilometragem percorrida: %.2f", carro.getQuilometragem());
	}
}

