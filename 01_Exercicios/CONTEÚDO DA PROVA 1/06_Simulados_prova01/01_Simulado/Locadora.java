//~ #~ Crie uma classe chamada Veiculo com a seguinte estrutura:
//~ #~ Veiculo

//~ #~ - placa: String
//~ #~ - modelo: String
//~ #~ - tipo: String
//~ #~ - quilometragem: int
//~ #~ + Veiculo(placa: String, modelo: String, tipo: String)
//~ #~ + Veiculo(placa: String, modelo: String, tipo: String, quilometragem: int)
//~ #~ + calcularLocacao(dias: int): Double
//~ #~ + calcularLocacao(dias: int, kmRodados: int): Double
//~ #~ + calcularLocacao(dias: int, kmRodados: int, seguro: boolean): Double
//~ #~ + exibirDetalhes(): String

//~ #~ Implemente um sistema de controle de locação de veículos:
//~ #~ O construtor inicializa os atributos recebidos por parâmetro. Caso a quilometragem não seja informada, inicialize como 0.

//~ #~ O atributo tipo pode assumir os valores: "ECONOMICO", "SUV", "LUXO". O valor
//~ #~ padrão para locação é definido por tipo:
//~ #~ "ECONOMICO": R$ 100 por dia + R$ 0,10 por quilômetro.
//~ #~ "SUV": R$ 150 por dia + R$ 0,10 por quilômetro.
//~ #~ "LUXO": R$ 250 por dia + R$ 0,10 por quilômetro.
//~ #~ O método calcularLocacao() retorna o valor da locação com base no número de dias:
//~ #~ Se for informado apenas o número de dias considere que o veículo rodará 100 Km por dia.
//~ #~ Se forem informados dias e quilômetros rodados, considere a quilometragem informada.
//~ #~ Se forem informados dias, quilômetros rodados e a opção de seguro, adicione uma taxa
//~ #~ fixa de R$ 50 por dia para o seguro.
//~ #~ O método calcularLocacao() também deve atualizar a quilometragem do veículo.
//~ #~ O método exibirDetalhes retorna uma String com as informações do veículo, incluindo
//~ #~ placa, modelo, tipo, quilometragem atual e valor por dia.
//~ #~ Crie uma classe Locadora que implemente três veículos (um de cada tipo) e permita a
//~ #~ manipulação (teste dos métodos) através de um menu com repetição.
//~ #~ Não se esqueça do encapsulamento.



public class Locadora {
	
	public static void main (String[] args) {
		Veiculo v1 = new Veiculo("JKR6669", "Carro Bacana", "SUV" ); // Nao entendo de carros vão me perdoando aí
        Veiculo v2 = new Veiculo("GXY6767", "Carro Doido", "LUXO", 100); 
        Veiculo v3 = new Veiculo("PAU9999", "Carro Bacana", "ECONOMICO", 200);
        System.out.println(v1.exibirDetalhes());
        System.out.println(v2.exibirDetalhes());
        System.out.println(v3.exibirDetalhes());
        System.out.println(v1.calcularLocacao(15));
        System.out.println(v2.calcularLocacao(30, 300));
        System.out.println(v3.calcularLocacao(35, 100, true));
        
	}
}

