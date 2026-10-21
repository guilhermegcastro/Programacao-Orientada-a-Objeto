/*
 * Reserva.java
//~ Crie uma classe chamada Reserva com a seguinte estrutura:
//~ Reserva

//~ - codigo: int
//~ - nomeHospede: String
//~ - diarias: int
//~ - incluiRefeicoes: boolean
//~ + Reserva(codigo: int, nomeHospede: String, diarias: int)
//~ + Reserva(codigo: int, nomeHospede: String, diarias: int, incluiRefeicoes: boolean)
//~ + calcularDiaria(): Double
//~ + calcularDiaria(taxaLimpeza: Double): Double
//~ + adicionarPasseio(tipo: String): Double
//~ + adicionarPasseio(tipo: String, quantidade: int): Double
//~ + exibirReserva(): String
//~ + exibirReserva(comDetalhes: boolean): String
//~ Implemente um sistema de controle de reservas de um Hotel Fazenda:
//~ O construtor inicializa os atributos recebidos por parâmetro. Caso refeições não seja
//~ informado, inicialize como false.
//~ O método calcularDiaria() retorna o valor da hospedagem, sendo R$ 200,00 por dia. Se as
//~ refeições forem inclusas (true) adiciona R$ 50,00 por dia. Se o método receber o valor da taxa de
//~ limpeza adicione ao valor final (apenas uma vez).
//~ O método adicionaPasseio() recebe o tipo de passeio (“CAVALGADA”, “TRILHA” ou
//~ “PESCA”) e retorna o custo,do passeio com base nos valores:

//~ • CAVALGADA: R$ 80,00
//~ • TRILHA: R$ 60,00
//~ • PESCA: R$ 70,00
//~ Caso receba a quantidade multiplica pelo valor.
//~ Caso receba uma informação diferente retorne R$ 0,00.
//~ O método exibirReserva() retorna uma String com a formatação abaixo:
//~ "Reserva [codigo] – Hospede: [nomeHospede] – Diárias: [diarias]"
//~ Caso receba um boolean true adiciona a informação " – Refeições inclusas: [Sim/Não]"
//~ Crie uma classe Hotel que implemente duas reservas e permita a manipulação (teste dos
//~ métodos) através de um menu com repetição.
//~ Não se esqueça do encapsulamento.
 */


public class Reserva {
	
    // Atributos ##
    private int codigo;
    private String nomeHospede;
    private int diarias;
    private boolean incluiRefeicoes;
    
    // Construtores ##
    public Reserva(int codigo, String nomeHospede, int diarias){
        this.codigo = codigo;
        this.nomeHospede = nomeHospede;
        this.diarias = diarias;
        this.incluiRefeicoes = false; //Valor padrão se não enviar o parâmetro
    }
    public Reserva(int codigo, String nomeHospede, int diarias, boolean incluiRefeicoes){
        this.codigo = codigo;
        this.nomeHospede = nomeHospede;
        this.diarias = diarias;
        this.incluiRefeicoes = incluiRefeicoes;
    }
    
    //Métodos ## 
    public Double calcularDiaria(){
        return ((incluiRefeicoes) ?  diarias*250.0 : diarias*200.0);
    }
    public Double calcularDiaria(Double taxaLimpeza){
        return calcularDiaria() + taxaLimpeza;
    }
    
    public Double adicionarPasseio(String tipo){
        return adicionarPasseio(tipo, 1);
    }
    
    public Double adicionarPasseio(String tipo, int quantidade){
        if (quantidade <1) 
            return 0.0;
        switch (tipo.toUpperCase()) {
            case "CALVAGADA": 
                return 80.0 * quantidade;
            case "TRILHA" : 
                return 60.0 * quantidade;
            case "PESCA" : 
                return 70.0 * quantidade;
            default: 
                return 0.0;
        }
    }
    
    public String exibirReserva(){
        return "Reserva [" + codigo + "] – Hospede: [" + nomeHospede + "] – Diárias: [" + diarias + "]";
    }
    
    public String exibirReserva(boolean comDetalhes){
        return exibirReserva() + " – Refeições inclusas: [" + ((incluiRefeicoes)? "Sim" : "Não") + "]";
    }
   
    public int getCodigo() {
    return this.codigo;
    }

    public String getNomeHospede() {
    return this.nomeHospede;
    }

    public int getDiarias() {
    return this.diarias;
    }

    public boolean getIncluiRefeicoes() {
    return this.incluiRefeicoes;
    }

    public void setNomeHospede(String nomeHospede) {
    this.nomeHospede = nomeHospede;
    }
    public void setCodigo(int codigo){
    this.codigo = codigo;
    }
    public void setDiarias(int diarias) {
    this.diarias = diarias;
    }

    public void setIncluiRefeicoes(boolean incluiRefeicoes) {
    this.incluiRefeicoes = incluiRefeicoes;
    }
}
