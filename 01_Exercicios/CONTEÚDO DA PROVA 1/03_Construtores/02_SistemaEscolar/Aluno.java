/*
 * Aluno.java
 */

public class Aluno {
    
    int matricula;
    String nome;
    String cpf;
    String endereco;
    
    public Aluno(int matricula, String nome, String cpf, String endereco){
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        System.out.print("Aluno " + nome + " criado(a)!\n");
    }
    
    public String toString(){
        return "\nNome: " + nome
        + "\nCPF: " +  cpf 
        + "\nEndereço: " + endereco 
        + "\nMatrícula: " + matricula;
            
        };
    
    
    
}

