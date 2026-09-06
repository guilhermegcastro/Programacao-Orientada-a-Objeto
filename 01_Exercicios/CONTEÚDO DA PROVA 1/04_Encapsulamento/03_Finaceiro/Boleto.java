
//~ Boleto.java

//~ Crie a classe Boleto:
//~ - codigo: int
//~ - descricao: String
//~ - diaDeVencimento: int
//~ - valor: Double
//~ - status: boolean
//~ + Boleto(codigo: int, descricao: String, diaDeVencimento: int, valor: Double)
//~ + pagar(dia: int, desconto: Double, valorPago: Double): boolean
//~ + exibir(): String

//~ O status do boleto se refere a estar pago ou não (true = pago). Todo boleto é criado com o status false.
//~ O método pagar registra o pagamento do boleto e modifica seu status. (Não permita o  pagamento do boleto em duplicidade). 
//~ Ele recebe um inteiro (dia), um Double (desconto) e um Double (valorPago), e verifica se a boleto está vencido,
//~ se estiver aumenta o valor em 10%, se não estiver vencido aplica o desconto informado e
//~ verifica se o valorPago é suficiente para pagar o boleto.
//~ Ao efetuar um pagamento exiba na tela a informação se o pagamento foi realizado  com sucesso ou não.
//~ O método exibir() retorna uma String com os detalhes do boleto.
//~ Crie uma classe Financeiro que implemente dois boletos e teste seus métodos.
//~ Opcional: Implemete um menu com opções para criação e pagamento de boletos.
//~ Não se esqueça do encapsulamento.

public class Boleto {
		
        private int codigo;
        private String descricao;
        private int diaDeVencimento;
        private Double valor;
        private boolean status;
        
        public Boleto(int codigo, String descricao, int diaDeVencimento, Double valor){
            this.codigo = codigo;
            this.descricao = descricao;
            this.diaDeVencimento = diaDeVencimento;
            this.valor = valor;
            this.status = false;
            
            
        }
        public boolean pagar(int dia, Double desconto, Double valorPago){
            if (status == true) {
                System.out.println("Boleto já esta pago!");
                return false;
            }
            Double valorAPagar = valor;
            if(dia > diaDeVencimento) {
                valorAPagar += (valorAPagar*0.10);
                System.out.println("\n\n Acréscimo no boleto de 10% decorrente ao vencimento do mesmo.");
            }
            else {
                valorAPagar -= (valorAPagar*(desconto/100));
                System.out.println("\n\n Desconto aplicado ao boleto.");
            }
            System.out.println(" Valor do Boleto a ser pago: R$" + valorAPagar);
            if(valorAPagar > valorPago) {
                System.out.println("\n\n Valor pago não é suficiente para pagar o boleto...");
                return false;
            }
              System.out.println("\n\n O Boleto foi pago!");
              if (valorAPagar < valorPago) 
                System.out.printf (" Valor devolvido: R$%.2f", (valorPago - valorAPagar));
            status = true;
            return true;
        }
        public String exibir(){
            return String.format(
                "= BOLETO Nº %d =" + 
                "\n Descrição: %s \n" + 
                "Valor: R$%.2f --- Dia de vencimento: %d\n" + 
                "Status: %s", 
                codigo, descricao, valor, diaDeVencimento, (status)? "PAGO" : "PENDENTE");
        }
        
        public int getCodigo() {
            return this.codigo;
        }
        
        
}

