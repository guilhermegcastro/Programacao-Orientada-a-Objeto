/*
 * Classe  Funcionário do Exercício de "Empresa".
 * 
 * Funcionario Nome da classe
~ nome: String
~ horasTrabalhadas: Double
~ valorDaHora: Double

Atributos
+ salariofinal(): Double Métodos

Os sinais ~ e + representam os modificadores:
~ Default (sem modificador)
+ public
- private
# protected
 */


public class Funcionario {
    String nome; 
    Double horasTrabalhadas = 0.0;
    Double valorDaHora = 0.0;
    
    public Funcionario(String nome, Double horas, Double valor){
        this.nome = nome;
        horasTrabalhadas = horas;
        valorDaHora = valor;
    }
    
    public Double salariofinal(){
        Double salario = (horasTrabalhadas*valorDaHora);
        salario -= (salario * 0.11);
        return salario;
    };
    
    public void print(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salariofinal());
    };
}

