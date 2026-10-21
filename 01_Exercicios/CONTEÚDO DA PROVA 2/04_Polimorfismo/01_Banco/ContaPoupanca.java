/*
 * ContaPoupanca.java
 */


public class ContaPoupanca extends ContaBancaria {
    
    //Atributos
    private int diaDeRendimento;
    
    // Construtor 
    public ContaPoupanca(Pessoa cliente, int numeroDaConta, Double saldo, int diaDeRendimento){
        super(cliente, numeroDaConta, saldo);
        this.diaDeRendimento = diaDeRendimento;
    }
    
    // Métodos
    public Double calcularNovoSaldo(Double taxa){
        return super.getSaldo() + (super.getSaldo() * (taxa/100));
    }
    
    @Override 
    public String toString(){
        return 
        super.toString() + 
        "\nDia de Rendimento: " + diaDeRendimento;
    }
    
    // gets e sets
    public int getDiaDeRendimento() {
        return this.diaDeRendimento;
    }
    
    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }
}

