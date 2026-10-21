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

public class Pessoa {		
        private String nome;
        private String sexo;
        private Data nascimento;
        
        public  Pessoa(String nome){
            this.nome = nome; 
            this.sexo = "Indefinido";
            this.nascimento = new Data();
        }
        public  Pessoa(String nome, String sexo, Data nascimento){
             this.nome = nome; 
            this.sexo = sexo;
            this.nascimento = nascimento;
        }
        
        public String mostraIdade(Data hoje){
            if(nascimento.getMes()>= hoje.getMes() && nascimento.getDia() >= hoje.getDia()){
                return nascimento.getAno() - hoje.getAno() + " anos";
            }
            else return nascimento.getAno() - hoje.getAno() - 1 + " anos";
        }

        public String getNome() {
            return this.nome;
        }
        
        public String getSexo() {
            return this.sexo;
        }
        
        public Data getNascimento() {
            return this.nascimento;
        }
        
}

