public class Empresa {
	
	public static void main (String[] args) {
		
        Fornecedor for1 = new Fornecedor("Fabio", "Rua Vinte", "123456789", 10000.0, 4000.0);
        Empregado emp1 = new Empregado("Marta", "Rua Estrela", "987654321", 123, 50000.0, 25.0);
        System.out.println(for1);
        System.out.println(" Saldo de " + for1.getNome() + ": R$" + for1.obterSaldo());
        System.out.println(emp1);
        System.out.println(" Salário de " + emp1.getNome() + ": R$" + emp1.calculaSalario());
	}
}

