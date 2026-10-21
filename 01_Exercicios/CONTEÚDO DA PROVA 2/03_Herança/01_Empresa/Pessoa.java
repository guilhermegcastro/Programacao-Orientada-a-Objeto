// Exercício de Herança – POO
// Implemente a classe abaixo:




public class Pessoa {
	
    // # Atributos 
    private String nome;
    private String endereco;
    private String telefone;
    
    
    // # Construtor 
    public Pessoa(String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    // # gets e sets
    
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
    
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String toString(){
        return 
            "\n Nome: " + nome +
            "\n Endereço: " + endereco +
            "\n Telefone: " + telefone;
    }
}

