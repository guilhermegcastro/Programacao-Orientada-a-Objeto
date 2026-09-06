
//~ Financeiro.java

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

import java.util.ArrayList;
import java.util.Scanner;
public class Financeiro{
	
    public static int menu(Scanner scan){
        System.out.println(
            "========================\n" +
            " 1 - Criar Boleto\n" +
            " 2 - Pagar Boleto\n" +
            " 3 - Deletar Boleto\n" +
            " 4 - Listar Boletos\n" + 
            " 0 - Finalizar Programa\n" );
        System.out.print("Insira a opção desejada: > ");
        return scan.nextInt();
    }
    
    public static void clear(){
        for (int i = 0; i < 50; i++) System.out.println();
    }
    public static void next()  throws Exception{
        System.out.print("Pressione qualquer tecla para prosseguir.");
        System.in.read();
        clear();
    }
    public static Boleto novoBoleto(Scanner scan){
        clear();
        System.out.println("Insira o código: ");
        int codigo = scan.nextInt();
        scan.nextLine();
        System.out.println("Insira a descrição: ");
        String descricao= scan.nextLine();
        System.out.println("Insira o dia de vencimento: ");
        int vencimento = scan.nextInt();
        System.out.println("Insira o valor: ");
        Double valor = scan.nextDouble();
        
        return new Boleto(codigo, descricao, vencimento, valor);
    }
    
    public static void listaBoletos(ArrayList<Boleto> boletos){
         for(Boleto lista : boletos ) System.out.println(lista.exibir());
    }
    
    public static Boleto acharBoleto(ArrayList<Boleto> boletos, int codigo){
        Boleto boletoAPagar = null;
        for (Boleto boleto : boletos){
            if (boleto.getCodigo() == codigo){
                boletoAPagar = boleto;
                break;
            }
        }
        return boletoAPagar;
    }
    public static void pagarBoleto(ArrayList<Boleto> boletos, Scanner scan){
        if(boletos.size() < 1)
            return;
        System.out.print("Insira o código do boleto que deseja pagar: > ");
        Boleto boletoAPagar = acharBoleto(boletos, scan.nextInt());
        if(boletoAPagar == null){
            System.out.println(" O Boleto não foi encontrado.");
            return;
        }
        System.out.println("Boleto encontrado. Insira os dados para pagar: ");
        System.out.print("Dia do pagamento: ");
        int dia = scan.nextInt();
        System.out.print("Desconto do Boleto: ");
        Double desconto = scan.nextDouble();
        System.out.print("Valor que sera pago: ");
        Double valor = scan.nextDouble();
        boletoAPagar.pagar(dia, desconto, valor);
    }
    
     public static void deletarBoleto(ArrayList<Boleto> boletos, Scanner scan){
        if(boletos.size() < 1)
            return;
        System.out.print("Insira o código do boleto que deseja deletar");
        Boleto boletoAPagar = acharBoleto(boletos, scan.nextInt());
        if(boletoAPagar == null){
            System.out.println(" O Boleto não foi encontrado.");
            return;
        }
        boletos.remove(boletoAPagar);
        System.out.println("Boleto deletado com sucesso!");
    }
    
    
	public static void main (String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
        ArrayList<Boleto> boletos = new ArrayList<>();
        clear();
        while (true) {
            switch(menu(scan)){
                case 1: boletos.add(novoBoleto(scan));
                    break;
                case 2:
                    listaBoletos(boletos);
                    pagarBoleto(boletos, scan);
                    next();
                    break;
                case 3:
                    listaBoletos(boletos);
                    deletarBoleto(boletos, scan);
                    next();
                    break;
                case 4: 
                    listaBoletos(boletos);
                    next();
                    break;
                case 0: return;
                default: System.out.print("Opçao invalida");
                
                    
            }
        }
	}
}

