/*
//* Pessoa.java
//* Crie uma classe Pessoa:

//~ Pessoa
//~ - nome: String
//~ - sexo: String
//~ - mesDeNascimento: int
//~ - anoDeNascimento: int
//~ + Pessoa(nome: String)
//~ + Pessoa(nome: String, sexo: String, mesDeNascimento: int, anoDeNascimento: int)
//~ + mostraIdade(): String
//~ + mostraIdade(mes: int, ano: int): String

//~ A classe deve possuir dois construtores, o primeiro recebe o nome como parâmetro e inicializa os
//~ atributos mesDeNascimento com 1 e anoDeNascimento com 2000, e o segundo recebe todos os atributos por parâmetros.
//~ A classe possui ainda o método mostraIdade() que recebe mês e ano como parâmetros e mostra a
//~ idade da pessoa com base na data informada ou não recebe parâmetros e considera a data 09/2026 para o cálculo.
//~ Crie uma classe Principal que instancie duas pessoas, cada uma com um construtor, e teste os métodos.
 */


public class Pessoa {
    private String nome;
    private String sexo; 
    private int mesDeNascimento;
    private int anoDeNascimento; 
  
    
    public Pessoa(String nome){
        this.nome = nome;
        anoDeNascimento = 2000;
        mesDeNascimento = 1;
        sexo = "Não declarado";
    }
    public Pessoa(String nome, String sexo, int mesDeNascimento, int anoDeNascimento){
        this.nome = nome;
        this.sexo = sexo;
        this.mesDeNascimento = mesDeNascimento;
        this.anoDeNascimento = anoDeNascimento;
    }
    
    public String mostraIdade(){
        
        int idade = (mesDeNascimento - 9 > 0) ? 2026 - anoDeNascimento - 1 : 2026 - anoDeNascimento;
        return "Idade de " + nome + " em 9/2026: " + idade + "\n\n";
        }
        
    public String mostraIdade(int mes, int ano){
    
        int idade = (mesDeNascimento - mes > 0) ? ano - anoDeNascimento - 1 : ano - anoDeNascimento;
        return "Idade de " + nome + " em " + mes + "/" + ano +": " + idade + "\n\n";
    }
    
    public String toString(){
        return 
        "Nome: " + nome + "\n" +
        "Sexo: " + sexo + "\n" +
        "Data Nasc. (mês/ano): " + mesDeNascimento + "/" + anoDeNascimento + "\n\n";
    }
}


