/*
 * Banco.java
 * 
 * Crie uma classe ContaCorrente:
 * 
 * ContaCorrente
 * - cliente: String
 * - numero: int
 * - senha: int
 * - saldo: Double
 * + cadastrarSenha(senha: int): boolean
 * + alterarSenha(senha: int, novaSenha: int): boolean
 * + debitar(senha: int, valor: Double): boolean
 * + creditar(senha: int, valor: Double): boolean
 * + consultaSaldo(senha: int): String
 * + ContaCorrente(String cliente, int numero)
 * 
 *      cadastrarSenha: recebe uma senha (inteiro) e, caso não haja senha anterior, guarda o valor do atributo senha.
 *      alterarSenha: recebe a senha antiga e uma nova e, caso a senha antiga esteja correta, altera o valor do atributo senha.
 *      debitar: recebe a senha e o valor a ser debitado e, caso a senha esteja correta, debita o valor do saldo.
 *      creditar: recebe a senha e o valor a ser debitado e, caso a senha esteja correta, credita o valor do saldo.
 *          Obs. Os métodos anteriores retornam “true” caso sejam executados ou “false” caso haja erro na execução.
 *      
 *      consultaSaldo: retorna uma String contendo o nome do cliente e o saldo da conta caso a senha esteja correta, ou a mensagem “SENHA INVÁLIDA”.
 *      Crie os métodos get e set necessários.
 *      Crie uma classe Banco (main) que instancie uma ContaCorrente e teste todos os métodos. (Não se esqueça de tratar os retornos dos métodos.)
 */


public class Banco {
	
	public static void main (String[] args) {
        ContaCorrente conta = new ContaCorrente("Guilherme", 1234);
        System.out.print(conta.consultaSaldo(4321));
        conta.alterarSenha(123, 1234); //Tenta alterar sem ter senha
        conta.cadastrarSenha(123); //Tenta cadastrar sem ser 4 digitos (Prática de padronização)
        conta.cadastrarSenha(1234); // Cadastra a senha
        conta.cadastrarSenha(1234); // Tenta cadastrar a senha com uma senha já ativa
        conta.alterarSenha(123, 1234); // Tenta alterar a senha inserindo a senha antiga incorreta
        conta.alterarSenha(1234, 1234); // Tenta alterar a senha inserido a mesma senha
        conta.alterarSenha(1234, 4321); // Altera a senha
        conta.debitar(4321, 50.0);
        conta.creditar(4321, -14.0); 
        conta.creditar(4321, 10000000.0);
        conta.creditar(4321, 5000.0);
        conta.debitar(4321, -50.0);
        conta.debitar(4321, 500.0);
        conta.consultaSaldo(1234);
        System.out.print(conta.consultaSaldo(4321));
        System.out.println(conta.consultaSaldo(1234));
        
	}
}

