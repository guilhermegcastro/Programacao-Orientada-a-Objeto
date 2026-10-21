// Exercício de Herança – POO
// Implemente a classe abaixo:




public class Pessoa {
	
    // # Atributos 
    private String nome;
    private String cpf;
    private String telefone;
    
    
    // # Construtor 
    public Pessoa(String nome, String cpf, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    
    // # gets e sets
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

        public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String toString(){
        return 
            "\n Nome: " + nome +
            "\n Endereço: " + cpf +
            "\n Telefone: " + telefone;
    }
}

