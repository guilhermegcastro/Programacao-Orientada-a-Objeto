//~ Disciplina.java

//~  Crie a classe aluno:

//~ - nome: String
//~ - matricula: int
//~ - media: Double
//~ - situacao: String
//~ + Aluno(String nome, int matricula, Double media)
//~ - verificaSituacao( ): void
//~ + resultadoFinal( ): String

//~ O atributo “situacao” armazena a situação final do aluno de acordo com a média.

//~ “APROVADO” caso a média >= 6.0 ou “REPROVADO” caso contrário. 
//~ O valor é verificado sempre que a média é modificada e não deve ser acessado externamente (método interno).
//~ O método verificaSituacao( ) modifica o atributo situacao de acordo com a média e deve ser executado sempre que a média for modificada.
//~ O método resultadoFinal( ) retorna uma String com os dados do aluno.
//~ Os atributos são privados e devem possuir os métodos “get” e “set”, com exceção do atributo situacao.
//~ Crie uma classe Disciplina (main) para instanciar e testar os métodos da classe Aluno.



import java.util.ArrayList;
public class Disciplina {
	
	public static void main (String[] args) {
		
        ArrayList<Aluno> Alunos = new ArrayList<>();
        Alunos.add(new Aluno("Fulanin", 1234, 5.0));
        Alunos.add(new Aluno("Fulaninha", 4321, 7.0));
        
        System.out.print(Alunos.get(0).resultadoFinal());
        System.out.print(Alunos.get(1).resultadoFinal());
        Alunos.get(0).setMedia(10.0);
        Alunos.get(1).setMedia(1.0);
        Alunos.get(0).setNome("Fulaninho");
        Alunos.get(1).setMatricula(1235);
        System.out.print(Alunos.get(0).resultadoFinal());
        System.out.print(Alunos.get(1).resultadoFinal());
	}
}

