/*
 * ContaBancaria.java
 */

public class ContaBancaria {
    
    // ATRIBUTOS
    private String numeroConta;
    private String titular;
    private Double saldo;
    private Double limiteChequeEspecial;
    
    //CONSTRUTOR 
    public ContaBancaria(String numeroConta, String titular){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
        this.limiteChequeEspecial = 100.0;
    }
    // MÉTODOS ESPECÍFICOS
    
    public void dadosConta(){
        System.out.printf("\n TITULAR: %s  | Nº DA CONTA: %s", titular, numeroConta);
        System.out.printf("\n > Saldo: %.2f\n > Limite do Cheque Especial: %.2f\n\n", saldo, limiteChequeEspecial);
    }
    public void depositar(Double valor){
        if(valor > 0) {
            saldo += valor;
            System.out.println(
                "\n[ + ] Deposito de R$" + valor + " adicionado com sucesso na conta!\n" +
                "      Saldo atual: " + 
                ((saldo < 0)? "-R$" + saldo * (-1): "R$" + saldo )
            );
        } else {
            System.out.println("\n[ ! ] Valor do deposito informado é inválido.");
        }
    }
    
    public void sacar(Double valor){
        if(valor < 0){
             System.out.println("\n[ ! ] Valor do saque não pode ser negativo.");
             return;
        }
        if(valor <= saldo + limiteChequeEspecial){
            saldo-= valor;
            System.out.println(
                "\n[ - ] Saque de R$" + valor + " retirado com sucesso da conta!\n" +
                "      Saldo atual: " + 
                ((saldo < 0)? "-R$" + saldo * (-1): "R$" + saldo )
            );
        } else {
            System.out.print(
                "\n[ x ] Saque negado!" +
                "\n      Saldo da conta (" + ((saldo < 0) ? "-R$" + saldo * (-1) : "R$" + saldo ) + 
                ") menor que o saque requisitado  (R$" + valor + ")" 
            );
        }
    }
    //GETS E SETS
    public String getNumeroConta() {
        return this.numeroConta;
    }
    
    public String getTitular(){
        return this.titular;
    }

    public Double getSaldo(){
        return this.saldo;
    }
    
    public Double getLimiteChequeEspecial(){
        return this.limiteChequeEspecial;
    }
    
    public void setLimiteChequeEspecial(Double limiteChequeEspecial){
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    
}

