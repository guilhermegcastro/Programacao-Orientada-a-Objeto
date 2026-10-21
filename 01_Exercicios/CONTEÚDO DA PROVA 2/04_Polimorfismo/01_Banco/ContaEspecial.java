/*
 * ContaEspecial.java
 */


public class ContaEspecial extends ContaBancaria {
    
    //Atributos
    private Double limite;
    
    // Construtor 
    public ContaEspecial(Pessoa cliente, int numeroDaConta, Double saldo, Double limite){
        super(cliente, numeroDaConta, saldo);
        this.limite = limite;
    }
    
    // Métodos
    @Override 
    public boolean sacar(Double valor){
        if(valor < 0.0 || valor > getSaldo() + limite)
            return false;  // Tratamento de valores negativos ou maior que o saldo + limite;
        setSaldo(getSaldo() - valor);
        return true;
    }
    
    @Override 
    public String toString(){
        return 
        super.toString() + 
        "\nLimite: R$" + limite;
    }
    
    // gets e sets
    public Double getLimite() {
        return this.limite;
    }
    
    public void setLimite(Double limite) {
        this.limite = limite;
    }
    
}

