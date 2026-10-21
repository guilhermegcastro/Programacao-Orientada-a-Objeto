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


public class Data {		
        private int dia;
        private int mes;
        private int ano;
        
        public Data(int dia, int mes, int ano){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
        public Data(){
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
        public String retornaData(){
            return 
                ((dia < 10) ? "0" + dia : dia) + "/" +
                ((mes < 10) ? "0" + mes : mes) + "/" + 
                ano;
        }
        public String calculaTempo(Data hoje){
            
            int a = ((hoje.ano > ano) ? hoje.ano - ano : ano - hoje.ano);
            int m = ((hoje.mes > mes) ? hoje.mes - mes : mes - hoje.mes);
            int d = ((hoje.dia > dia) ? hoje.dia - dia : dia - hoje.dia);
            return a + " anos, " + m + " meses e " + d + " dias.";
        }
        
        public int getDia() {
            return this.dia;
        }
        
        public int getMes() {
            return this.mes;
        }
        
        public int getAno() {
            return this.ano;
        }
        
        public void setDia(int dia) {
            this.dia = dia;
        }

        public void setMes(int mes) {
            this.mes = mes;
        }
        
        public void setAno(int ano) {
            this.ano = ano;
        }
        
}

