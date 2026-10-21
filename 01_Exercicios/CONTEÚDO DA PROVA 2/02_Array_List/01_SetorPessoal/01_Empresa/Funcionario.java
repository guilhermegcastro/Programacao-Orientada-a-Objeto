//~ Exercício de POO

//~ Funcionario
//~ - matricula: int
//~ - nome: String
//~ - departamento: int
//~ - salario: Double
//~ - funcao: String


public class Funcionario {
    
    // Atributos
    private int matricula;
    private String nome;
    private int departamento;
    private Double salario;
    private String funcao;
    
    public Funcionario(int matricula, String nome, int departamento, Double salario, String funcao){
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.funcao = funcao;
    }
    
       public Funcionario(int matricula){
        this.matricula = matricula;
    }
    
    
    boolean verificaRepetido(int matricula, String nome){
        if(this.matricula == matricula || this.nome == nome)
            return false;
        return true;
    }
    
    public int getMatricula() {
        return this.matricula;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getDepartamento() {
        return this.departamento;
    }
    
    public Double getSalario() {
        return this.salario;
    }
    
    public String getFuncao() {
        return this.funcao;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }
    
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
}
