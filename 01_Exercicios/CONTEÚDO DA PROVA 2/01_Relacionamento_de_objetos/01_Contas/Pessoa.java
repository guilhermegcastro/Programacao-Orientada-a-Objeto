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


public class Pessoa {
    
    private String nome;
    private String cpf;
    private String endereco; 
    private String telefone;
    private Double renda;
    
    public Pessoa(String nome, String cpf, String endereco, String telefone, Double renda){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.renda = renda;
    }
    
    public String informacoes(){
        return 
            "Nome: " + nome + " | CPF: " + cpf +
            "\nEndereço: " + endereco + " | Telefone: " + telefone +
            "\nRenda: R$" + renda;
    } 
    
}

