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


public class Veiculo {
    private String placa;
    private String modelo;
    private String tipo;
    private int quilometragem;
    
    public Veiculo(String placa, String modelo, String tipo){
        this.placa = placa;
        this.modelo = modelo;
        this.tipo = tipo;
        this.quilometragem = 0;
    }
    public Veiculo(String placa, String modelo, String tipo, int quilometragem){
        this.placa = placa;
        this.modelo = modelo;
        this.tipo = tipo;
        this.quilometragem = quilometragem;
    }
    
    public Double calcularLocacao(int dias, int kmRodados){
        quilometragem += kmRodados;
        Double valor = 0.10 * kmRodados;
        switch (tipo.toUpperCase()) {
            case "LUXO": valor += dias * 250;
                break;
            case "SUV": valor += dias * 150;
                break;
            case "ECONOMICO": valor += dias * 100;
                break;
        }
            return valor;
    }
    
    public Double calcularLocacao(int dias){
        return calcularLocacao(dias, 100*dias);
    }
    
    public Double calcularLocacao(int dias, int kmRodados, boolean seguro){
        return calcularLocacao(dias, kmRodados) + 50 * dias;
    }
    public String exibirDetalhes(){
        return 
            "PLACA DO VEÍCULO: " + placa + "\n" +
            "MODELO: " + modelo + "\n" +
            "TIPO: " + tipo + "\n" +
            "QUILOMETRAGEM ATUAL: " + quilometragem + "\n" + 
            "VALOR POR DIA: R$" + ((tipo.equalsIgnoreCase("LUXO")) ? "250" : (tipo.equalsIgnoreCase("SUV"))? "150" : "100") + " + 0,10 por quilômetro.";
        
    }
    
    
    public String getPlaca() {
        return this.placa;
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public int getQuilometragem() {
        return this.quilometragem;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }
}
