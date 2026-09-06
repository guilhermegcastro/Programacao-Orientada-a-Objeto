/*
 * SistemaEscolar.java
 * 
 * Codifique a classe Aluno. 
 * O construtor recebe todos os atributos como parâmetros e o método toString() retorna todas as informações do aluno em uma String.
 * 
 * Aluno
 * 
 * ~ matricula: int
 * ~ nome: String
 * ~ cpf: String
 * ~ endereco: String
 * + toString(): String
 * + Aluno(matricula: int, nome: String, cpf: String, endereco: String)
 * 
 * Crie uma classe principal que instancie dois alunos e teste o método toString().
 */


public class SistemaEscolar {
	
	public static void main (String[] args) {
		
        Aluno a1 =  new Aluno(123, "Fulana", "1234567819", "Rua dos Tolos");
        Aluno a2 =  new Aluno(321, "Guilherme tolo araujo roch triplo", "9123456789", "Rua do amanha");
        System.out.print(a1);
        System.out.print(a2);
	}
}

