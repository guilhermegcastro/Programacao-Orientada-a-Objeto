// Exercício de Herança – POO
// Implemente a classe abaixo:

public class Aluno extends Pessoa{
	
    // # Atributos 
    private String matricula;
    private String curso;
    private Double nota1;
    private Double nota2;
    
    // # Construtor 
    public Aluno(String nome, String cpf, String telefone, String matricula, String curso, Double nota1, Double nota2){
        super(nome, cpf, telefone);
        this.matricula = matricula;
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    
    // # Metodos 
    public Double calcularMedia(){
        return (nota1+nota2)/2.0;
    } // # Retorna a média aritmética das duas notas.
    
    public String situacao(){
        return ((calcularMedia()>=6.0)? "Aprovado(a)" : "Em Recuperação");
    }//# Retorna “Aprovado” quando a média for maior ou igual a 6,0 ou “Em recuperação” caso contrário.
    
    
    // # gets e sets
    
    public String getMatricula() {
        return this.matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

        public String getCurso() {
        return this.curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public Double getNota1() {
        return this.nota1;
    }
    
    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }
    
    public Double getNota2() {
        return this.nota2;
    }
    
    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }
    
    public String toString(){
        return 
            super.toString() +
            "\n Matricula: " + matricula +
            "\n Curso: " + curso +
            "\n Nota 1: " + nota1 + "  |  Nota 2: " + nota2 + 
            "\n Media: " + calcularMedia() +
            "\n Situaçao: " + situacao();
    }
}

