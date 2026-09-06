//~ * Empresa.java
//~ Funcionario
//~ - nome: String
//~ - salarioBase: Double
//~ - tempoDeServido: int
//~ + Funcionario(nome: String, salarioBase: Double, tempoDeServico: int)
//~ + mostraSalario(): Double
//~ + mostraSalario(totalDeVendas: Double): Double

//~ O funcionário recebe o salario base e uma comissão, que varia de acordo com o tempo de serviço e
//~ a função exercida, conforme a tabela abaixo:
//~ Função Tempo de Serviço Comissão
//~ Vendedor Até 10 anos 5% do salário base + 1,5% sobre as vendas
//~ Vendedor Acima de 10 anos 10% do salário base + 2% sobre as vendas
//~ Gerente Até 10 anos 12% do salário base
//~ Gerente Acima de 10 anos 17% do salário base
//~ Implemente um método chamado mostraSalario(), que calcula e mostra o salario bruto do

//~ funcionário. Se ao chamar o método for passado o total de vendas (Double) como parâmetro, trata-
//~ se de um vendedor. Se não for passado nenhum parâmetro trata-se de um Gerente.

//~ Implemente uma classe Empresa (main) que instancia 2 funcionários, e mostra, através de um
//~ menu, o salário (salário base + comissão) quando solicitado.



public class Empresa {
	
	public static void main (String[] args) {
        Funcionario gerente = new Funcionario("Geraldo", 4000.0, 15);
        Funcionario vendedor = new Funcionario("Silva", 2000.0, 7);
        System.out.println(gerente.getNome() + " possui salário de: R$" + gerente.mostraSalario());
        System.out.println(vendedor.getNome() + " possui salário de: R$" + vendedor.mostraSalario(12.0));
        gerente.setTempoDeServico(9);
        vendedor.setTempoDeServico(11);
        System.out.println(gerente.getNome() + " possui salário de: R$" + gerente.mostraSalario());
        System.out.println(vendedor.getNome() + " possui salário de: R$" + vendedor.mostraSalario(12.0));
        
	}
}

