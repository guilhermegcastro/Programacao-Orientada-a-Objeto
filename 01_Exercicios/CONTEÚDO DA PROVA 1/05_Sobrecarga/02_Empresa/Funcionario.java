//~ * Funcionario.java
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


public class Funcionario {
    private String  nome;
    private Double salarioBase;
    private int tempoDeServico;

    public Funcionario(String nome, Double salarioBase, int tempoDeServico){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.tempoDeServico = tempoDeServico;
    }

    public Double mostraSalario(){
        if(tempoDeServico <=10)
            return salarioBase + (salarioBase * 0.12);
        else 
             return salarioBase + (salarioBase * 0.17);
 
    }

    public Double mostraSalario(Double  totalDeVendas){
        if(tempoDeServico <=10)
            return salarioBase + (salarioBase * 0.05) + (totalDeVendas * 0.015);
        else 
             return salarioBase + (salarioBase * 0.1) + (totalDeVendas * 0.02);
    }
    

    public void setTempoDeServico(int tempoDeServico) {
        this.tempoDeServico = tempoDeServico;
    }
    
    public String getNome() {
        return this.nome;
    }
    


}

