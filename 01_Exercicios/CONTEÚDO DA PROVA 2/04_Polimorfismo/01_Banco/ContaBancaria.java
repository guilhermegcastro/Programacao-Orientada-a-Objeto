/*
 * ContaBancaria.java
 */

public class ContaBancaria {
    
    //Atributos
    private Pessoa cliente;
    private int numeroDaConta;
    private Double saldo;
    
    // Construtor 
    public ContaBancaria(Pessoa cliente, int numeroDaConta, Double saldo){
        this.cliente = cliente;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }
    
    // Métodos
    public boolean sacar(Double valor){
        if(valor < 0.0 || valor > saldo)
            return false;  // Tratamento de valores negativos ou valor maior que o saldo disponível;
        saldo -= valor;
        return true;
    }
    
    public boolean depositar(Double valor){
        if(valor < 0.0)
            return false;  // Tratamento de valores negativos;
        saldo += valor;
        return true;
    }
    
    public Pessoa getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }
    public int getNumeroDaConta() {
        return this.numeroDaConta;
    }
    
    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    public Double getSaldo() {
       return this.saldo;
    }
   
    public void setSaldo(Double saldo) {
       this.saldo = saldo;
    }
    

    public String toString(){
        return 
            cliente +
            "\nNº da conta: " + numeroDaConta + 
            "\nSaldo: " + ((saldo >= 0.0) ? "R$" + saldo : "-R$" + saldo * -1); 
        
    } 
}

