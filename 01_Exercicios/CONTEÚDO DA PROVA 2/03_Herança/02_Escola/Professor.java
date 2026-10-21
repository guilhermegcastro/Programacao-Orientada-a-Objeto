// Exercício de Herança – POO
// Implemente a classe abaixo:

public class Professor extends Pessoa{
	
    // # Atributos 
    private String disciplina;
    private Double valorHoraAula;
    private int quantidadeHoras;
    
    // # Construtor 
    public Professor(String nome, String cpf, String telefone, String disciplina, Double valorHoraAula, int quantidadeHoras){
        super(nome, cpf, telefone);
        this.disciplina = disciplina;
        this.valorHoraAula = valorHoraAula;
        this.quantidadeHoras = quantidadeHoras;
    }
    
    // # Metodos 

    public Double calcularPagamento(){
        return valorHoraAula * quantidadeHoras;
    } // Retorna o valor da hora-aula multiplicado pela quantidade de horas.
    
    // # gets e sets
    
    public String getDisciplina() {
        return this.disciplina;
    }
    
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    public Double getValorHoraAula() {
        return this.valorHoraAula;
    }
    
    public void setValorHoraAula(Double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }
    
    public int getQuantidadeHoras() {
        return this.quantidadeHoras;
    }
    
    public void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }
    
    public String toString(){
        return 
            super.toString() +
            "\n Disciplina: " + disciplina +
            "\n Valor da Aula por Hora: R$" + valorHoraAula + "  |  Quantidade de Horas: " + quantidadeHoras + 
            "\n Media: " + calcularPagamento();
    }
}

