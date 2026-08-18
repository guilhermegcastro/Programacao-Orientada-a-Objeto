/*
 * Turma.java
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


import java.util.Scanner;
public class Turma {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        System.out.println("Insira o nome do 1º aluno: > ");
        a1.nome = scan.nextLine();
        System.out.println("Insira a nota da primeira prova: > ");
        a1.nota1 = scan.nextDouble();
        System.out.println("Insira a nota da segunda prova: > ");
        a1.nota2 = scan.nextDouble();
        
        scan.nextLine();
        System.out.println("Insira o nome do 2º aluno: > ");
        a2.nome = scan.nextLine();
        System.out.println("Insira a nota da primeira prova: > ");
        a2.nota1 = scan.nextDouble();
        System.out.println("Insira a nota da segunda prova: > ");
        a2.nota2 = scan.nextDouble();
        
        
        System.out.println("Nome: " + a1.nome + " | Média: " + a1.media() + " | Resultado: " + a1.resultado());
        System.out.println("Nome: " + a2.nome + " | Média: " + a2.media() + " | Resultado: " + a2.resultado());
	}
}

