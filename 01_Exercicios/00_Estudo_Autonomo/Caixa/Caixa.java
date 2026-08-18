/*
Exercício: Sistema de Conta Bancária
Crie uma classe chamada ContaBancaria que represente a conta de um cliente.

Atributos (todos devem ser privados):
- numeroConta (String)
- titular (String)
- saldo (double)
- limiteChequeEspecial (double)

Regras de Encapsulamento e Regras de Negócio:

1. Imutabilidade básica: O numeroConta e o titular só podem ser definidos no momento em que a conta é criada (ou seja, devem ser passados como parâmetros no Construtor). Após a criação, eles não podem ser alterados de forma alguma. Portanto, não crie métodos set para eles, apenas get.

2. Proteção do Saldo: Ninguém de fora da classe pode definir o saldo diretamente (não deve existir um método setSaldo()). O saldo começa em 0.0 na criação da conta.

3. Operações controladas: Para alterar o saldo, você deve criar dois métodos:
   - depositar(double valor): O depósito só pode ser realizado se o valor for maior que zero. Se for inválido, o método deve ignorar ou imprimir uma mensagem de erro.
   - sacar(double valor): O saque só é permitido se o valor for maior que zero E se o cliente tiver fundos suficientes (considerando o saldo somado ao limiteChequeEspecial). Se o saque for maior que o disponível, a operação deve ser negada.

4. Leitura livre: Crie métodos get para todos os atributos, permitindo que qualquer outra classe consulte o estado da conta.

Teste sua classe:
Crie uma classe Caixa com o método public static void main(String[] args), instancie uma ContaBancaria, tente fazer depósitos inválidos, saques além do limite e tente (para ver o erro de compilação) alterar o titular usando a referência do objeto.
*/

public class Caixa {
    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria("12345", "Fulanin");
        conta.dadosConta();
        conta.depositar(100.0);
        conta.depositar(-1.0);
        conta.sacar(200.0);
        conta.sacar(-100.0);
        conta.sacar(1.0);
        
    }
}
