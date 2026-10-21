/*
 * Pessoa.java
 *
 * 
 * 
 */


public class Pessoa {
	
    // Atributos
    private String nome;
    private int cpf;
    private String endereco;
    private String rg;
    
    // Construtor
    public Pessoa(String nome, int cpf, String endereco, String rg){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.rg = rg;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getRg() {
        return this.rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public int getCpf() {
        return this.cpf;
    }
    
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    
    public String toString(){
        return 
            "\nNome: " + nome +
            "\nCPF: " + cpf +
            "\nEndereço: " + endereco +
            "\nRg: " + rg;
    }
    
}

