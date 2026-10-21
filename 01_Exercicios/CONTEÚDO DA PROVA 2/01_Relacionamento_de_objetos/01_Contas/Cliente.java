//~ Conta Bancária

//~ Elabore uma classe Pessoa, com os seguintes atributos:
//~ Pessoa
//~ - String nome
//~ - String cpf
//~ - String endereco
//~ - String telefone
//~ - Double renda
//~ + Informacoes(): String

//~ Elabore uma classe ContaBancaria, com os seguintes membros:
//~ ContaBancaria

//~ - Pessoa cliente
//~ - int numeroDaConta
//~ - Double saldo
//~ + sacar (float saque): boolean
//~ + depositar(float deposito): boolean

//~ Após a implementação das classes acima, você deverá implementar uma classe Contas.Java,
//~ contendo o método main. Nesta classe, você deverá implementar:
//~ a)Incluir dados relativos a(s) conta(s) de um cliente;
//~ b)Sacar um determinado valor da(s) sua(s) conta(s);
//~ c)Depositar um determinado valor na(s) sua(s) conta(s);
//~ e) Mostrar os dados da(s) conta(s) de um cliente;


public class Cliente{
    
    private Pessoa cliente;
    private int numeroDaConta;
    private Double saldo;
    
    public Cliente(Pessoa cliente, int numeroDaConta, Double saldo){
        this.cliente = cliente;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }
    
    public boolean sacar(float saque){
        if(saque<=0.0 || saque > this.saldo)
            return false;
       this.saldo -= saque;
       return true;
    }
    
    public boolean depositar(float  deposito){
        if(deposito <= 0.0)
            return false;
        this.saldo += deposito;
        return true;
    }
    
    public Pessoa getCliente(){
        return cliente;
    }
    public Double getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
     public int getNumeroDaConta() {
        return this.numeroDaConta;
    }
    
    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    
}

