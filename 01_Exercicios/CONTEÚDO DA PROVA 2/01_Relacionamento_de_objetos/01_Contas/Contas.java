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
//~ e)Mostrar os dados da(s) conta(s) de um cliente;


public class Contas{
    public static void main(String[] args){
        Pessoa p = new Pessoa("Guilherme", "123456789-19", "Rua Santana", "553899223344", 7000.0);
        Cliente c = new Cliente(p, 12, 12000.0);
        c.sacar(12);
        System.out.print(c.getSaldo());
        c.depositar(100);
        System.out.print("\n" + c.getSaldo());
        System.out.print("\n\n");
        System.out.print(c.getCliente().informacoes());
    }
}

