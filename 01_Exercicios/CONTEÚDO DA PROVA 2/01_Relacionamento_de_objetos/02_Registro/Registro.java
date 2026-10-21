//~ Exercício de POO
//~ Crie uma classe Data:
//~ Data
//~ - dia: int
//~ - mes: int
//~ - ano: int
//~ + Data(dia: int, mês: int, ano: int)
//~ + Data()
//~ + retornaData(): String
//~ + calculaTempo(data: Data): String

//~ A classe Data possui dois construtores. O método retornaData() retorna uma String com a data no
//~ formato “DD/MM/AAAA”. O método calcula tempo recebe uma data e retorna a diferença de
//~ tempo no formato “XX anos, XX meses e XX dias”.
//~ Crie uma classe Pessoa:

//~ Pessoa
//~ - nome: String
//~ - sexo: String
//~ - nascimento: Data
//~ + Pessoa(nome: String)
//~ + Pessoa(nome: String, sexo: String, nascimento: Data)
//~ + mostraIdade(hoje: Data): String

//~ A classe deve possuir dois construtores, o primeiro recebe o nome como parâmetro e inicializa o
//~ atributo nascimento com a data “01/01/2000”, e o segundo recebe todos os atributos por parâmetros.
//~ A classe possui ainda o método mostraIdade() que recebe uma data como parâmetro e mostra a
//~ idade da pessoa com base na data informada.
//~ Crie uma classe Principal que instancie duas pessoas, cada uma com um construtor, e teste os
//~ métodos.

public class Registro {
	
	public static void main (String[] args) {
		Pessoa p1 = new Pessoa("Fulana");
        Pessoa p2 = new Pessoa("Fulano", "Masculino", new Data(31, 12, 2004));
        
        System.out.println(p1.getNascimento().retornaData());
        System.out.println(p2.getNascimento().retornaData());
        System.out.println(p2.getNascimento().calculaTempo(new Data(1, 10, 2026)));
	}
}

