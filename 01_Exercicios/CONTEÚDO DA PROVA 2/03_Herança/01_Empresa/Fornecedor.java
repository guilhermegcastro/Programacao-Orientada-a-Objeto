// Exercício de Herança – POO

public class Fornecedor extends Pessoa{
	
    // # Atributos 
    private Double credito;
    private Double divida;
    
    
    public Fornecedor(String nome, String endereco, String telefone, Double credito, Double divida){
        
        super(nome, endereco, telefone);
        
        if(credito < 0.0)
            this.credito = 0.0;
        else
            this.credito = credito;
        
        if(divida < 0.0)
            this.divida = 0.0;
        else
            this.divida = divida;
            
    }
    // # Métodos
    
    public Double obterSaldo(){
        return credito - divida;
    }
    // # gets e sets
    
    public Double getCredito() {
        return this.credito;
    }
    
    public void setCredito(Double credito) {
        if(credito < 0.0)
            this.credito = 0.0;
        else
            this.credito = credito;
    }
    
    public Double getDivida() {
        return this.divida;
    }
    
    public void setDivida(Double divida) {
        if(divida < 0.0)
            this.divida = 0.0;
        else
            this.divida = divida;
    }
    
    public String toString(){
        return 
            super.toString() + 
            "\n Crédito: R$" + credito +
            "\n Dívida: R$" + divida;
    }
}


