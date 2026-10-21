/*
 * Banco.java
 * 
 */


public class Banco {
	
	public static void main (String[] args) {
		
        Pessoa p1 = new Pessoa("Guilherme C.", 1234567890, "Rua Esmeralda", "12345-98");
        Pessoa p2 = new Pessoa("Ícaro C.", 987654321, "Avenida Estrela", "54556-12");
        System.out.println(p1);
        System.out.println(p2);
        ContaBancaria conta1 = new ContaPoupanca(p1, 123, 100.0, 14);
        System.out.println(conta1);
        ContaBancaria conta2 = new ContaEspecial(p2, 531, 1000.0, 200.0);
        System.out.println(conta2);
        
        conta1.sacar(200.0);
        conta1.depositar(10000.0);
        conta2.sacar(1200.0);
        
        System.out.println(conta1);
        System.out.println( "Novo saldo com taxa 10% : " + ((ContaPoupanca)conta1).calcularNovoSaldo(10.0));
        System.out.println(conta2);
	}
}

