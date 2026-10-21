// Cliente.java
// Controle de Vendas
//~ Elabore uma classe Cliente, com a seguinte estrutura:
//~ Cliente
//~ - String nome
//~ - String cpf
//~ - Double renda
//~ - Double limiteDeCredito
//~ + calculaLimite(): void

//~ O método calculaLimite calcula o limite de compras do cliente com base em sua renda com a
//~ fórmula: limite = renda * 2,5. O resultado do cálculo deve ser armazenado no atributo
//~ limiteDeCredito. Sempre que a renda for alterada (Construtor ou set) o novo limite deve ser
//~ calculado. Não crie o método setLimiteDeCredito()


public class Cliente {
	
    // Atributos
    private String nome;
    private String cpf;
    private Double renda;
    private Double limiteDeCredito;
    
    // Construtor
    public Cliente(String nome, String cpf, Double renda){
        this.nome = nome;
        this.cpf = cpf;
        this.renda = renda;
        calculaLimite();
    }
    
    // Métodos
    public void calculaLimite(){
        this.limiteDeCredito = renda * 2.5;
    }
    
    //gets e sets 
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
    
    public Double getRenda() {
        return this.renda;
    }
    
    public void setRenda(Double renda) {
        this.renda = renda;
        calculaLimite();
    }
    
    public Double getLimiteDeCredito() {
        return this.limiteDeCredito;
    }

}

