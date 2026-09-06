//~ Aluno.java

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

public class Aluno {
	
    private String nome;
    private Integer matricula;
    private Double media;
    private String situacao;
    
    public Aluno(String nome, int matricula, Double media){
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
        verificaSituacao();
    }
    
    private void verificaSituacao(){
        if(media >= 6.0)
            situacao = "APROVADO";
        else 
            situacao = "REPROVADO";
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        String antigoNome = this.nome;
        this.nome = nome;
        System.out.printf("Nome do(a) aluno(a) alterado de %s para %s\n", antigoNome, this.nome);
    }
    
    public Integer getMatricula() {
        return this.matricula;
    }
    
    public void setMatricula(Integer matricula) {
        Integer antigaMatricula = this.matricula;
        this.matricula = matricula;
        System.out.printf("Matricula de %s alterada de %d para %d\n", nome, antigaMatricula, this.matricula);
    }
    
     public Double getMedia() {
        return this.media;
    }
    
    public void setMedia(Double media) {
        this.media = media;
        verificaSituacao();
        System.out.printf("Média de %s alterada (Nova média: %.2f)\n\n", nome, media);
    }
    
  
    public String resultadoFinal(){
        return String.format(
            "================\n Dados do aluno \n________________\n\n Nome: %s  | Matrícula: %d \n Média: %.2f  - Situação: %s\n\n", nome, matricula, media, situacao);
    }
    
    
}

