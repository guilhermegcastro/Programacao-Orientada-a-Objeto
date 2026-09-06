/*
//* Cadastro.java
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

public class Cadastro{
	
	public static void main (String[] args) {
		
        Pessoa p1 = new Pessoa("Caique");
        Pessoa p2 = new Pessoa("Leandra", "Feminino", 5, 2008);
        System.out.print(p1);
        System.out.print(p2);
        System.out.print(p1.mostraIdade());
        System.out.print(p2.mostraIdade(3, 2026));
	}
}

