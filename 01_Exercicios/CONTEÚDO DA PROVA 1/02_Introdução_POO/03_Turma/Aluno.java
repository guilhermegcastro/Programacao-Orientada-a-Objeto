/*
 * Aluno.java
 * 
 * Crie uma classe chamada Aluno contendo os seguintes atributos: nome, nota1 e nota2. 
 * Essa classe tem um método chamado média() que calcula e retorna a média aritmética das notas 
 * desse aluno e um método chamado resultado() que retorna uma String com o nome do aluno e a palavra 
 * “APROVADO” ou “REPROVADO” considerando a média de aprovação 6.
 * 
 * Aluno
 * 
 * ~ nome: String
 * ~ nota1: Double
 * ~ nota2: Double
 * + media(): Double
 * + resultado(): String
 * 
 * Escreva uma classe de Turma (Principal) onde deverão ser instanciados dois objetos da classe Aluno, leia os valores e teste os métodos.
 * 
 * Os sinais ~ e + representam os modificadores:
 * ~ default (sem modificador)
 * + public
 * - private
 * # protected
 */

public class Aluno {
    String nome;
    Double nota1;
    Double nota2;
    
    public Double media(){
        return (this.nota1 + this.nota2)/2;
    }
    
    public String resultado(){
       return ((media() >= 6)? "APROVADO" : "REPROVADO");
    }
    
}


