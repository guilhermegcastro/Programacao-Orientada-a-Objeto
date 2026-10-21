/*
 Hotel.java
//~ Crie uma classe chamada Reserva com a seguinte estrutura:
//~ Reserva

//~ - codigo: int
//~ - nomeHospede: String
//~ - diarias: int
//~ - incluiRefeicoes: boolean
//~ + Reserva(codigo: int, nomeHospede: String, diarias: int)
//~ + Reserva(codigo: int, nomeHospede: String, diarias: int, incluiRefeicoes: boolean)
//~ + calcularDiaria(): Double
//~ + calcularDiaria(taxaLimpeza: Double): Double
//~ + adicionarPasseio(tipo: String): Double
//~ + adicionarPasseio(tipo: String, quantidade: int): Double
//~ + exibirReserva(): String
//~ + exibirReserva(comDetalhes: boolean): String
//~ Implemente um sistema de controle de reservas de um Hotel Fazenda:
//~ O construtor inicializa os atributos recebidos por parâmetro. Caso refeições não seja
//~ informado, inicialize como false.
//~ O método calcularDiaria() retorna o valor da hospedagem, sendo R$ 200,00 por dia. Se as
//~ refeições forem inclusas (true) adiciona R$ 50,00 por dia. Se o método receber o valor da taxa de
//~ limpeza adicione ao valor final (apenas uma vez).
//~ O método adicionaPasseio() recebe o tipo de passeio (“CAVALGADA”, “TRILHA” ou
//~ “PESCA”) e retorna o custo,do passeio com base nos valores:

//~ • CAVALGADA: R$ 80,00
//~ • TRILHA: R$ 60,00
//~ • PESCA: R$ 70,00
//~ Caso receba a quantidade multiplica pelo valor.
//~ Caso receba uma informação diferente retorne R$ 0,00.
//~ O método exibirReserva() retorna uma String com a formatação abaixo:
//~ "Reserva [codigo] – Hospede: [nomeHospede] – Diárias: [diarias]"
//~ Caso receba um boolean true adiciona a informação " – Refeições inclusas: [Sim/Não]"
//~ Crie uma classe Hotel que implemente duas reservas e permita a manipulação (teste dos
//~ métodos) através de um menu com repetição.
//~ Não se esqueça do encapsulamento.
 */


import java.util.Scanner;
public class Hotel {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
        
        Reserva r1 = new Reserva(123, "Golias", 14);
        Reserva r2 = new Reserva(126, "Fernanda", 30, true);
        Reserva []lista = {r1, r2};
        while(true){
            switch (menu(scan)) {
                case 1: diaria(scan, lista);
                    break;
                case 2: passeio(scan, lista);
                    break;
                case 3: exibir(scan, lista);
                    break;
        
                default:
                
            }
        }
	}
    
    
    public static int menu(Scanner scan){
        System.out.println(" = MENU =");
        System.out.println(
            " 1. Calcular Diária\n" +
            " 2. Adicionar Passeio\n" +
            " 3. Exibir Reserva\n"
            );
        return scan.nextInt();
    }
    
    public static void diaria(Scanner scan, Reserva []lista){
        scan.nextLine();
        System.out.print(" A diária inclui serviço de limpeza? [S/n]");
        String opcao = scan.nextLine();
        Double valor1, valor2;
        if (opcao.equalsIgnoreCase("S") || opcao.equalsIgnoreCase("SIM")) {
            System.out.print(" Informe o valor do serviço: R$");
            valor1 = lista[0].calcularDiaria(scan.nextDouble());
            valor2 = lista[1].calcularDiaria(scan.nextDouble());
        } else {
            valor1 = lista[0].calcularDiaria();
            valor2 = lista[1].calcularDiaria();
        }
        System.out.println("Valor total da diária de " + lista[0].getNomeHospede() + ": R$" + valor1);
        System.out.println("Valor total da diária de " + lista[1].getNomeHospede() + ": R$" + valor2);
    }
    
     public static void passeio(Scanner scan, Reserva []lista){
         scan.nextLine();
        System.out.print(" Digite o tipo de passeio: \n CALVAGADA \n TRILHA \n PESCA \n");
        String tipo = scan.nextLine();
        System.out.print(" Deseja incluir mais de um dia de passeio?");
        String opcao = scan.nextLine();
        Double valor1, valor2;
        if (opcao.equalsIgnoreCase("S") || opcao.equalsIgnoreCase("SIM")) {
            System.out.print(" Informe a quantidade de dias: ");
            int quantidade = scan.nextInt();
            valor1 = lista[0].adicionarPasseio(tipo, quantidade);
            valor2 = lista[1].adicionarPasseio(tipo, quantidade);
        }  else{ 
            valor1 = lista[0].adicionarPasseio(tipo);
            valor2 = lista[1].adicionarPasseio(tipo);
        }
        if (valor1 != 0.0 && valor2 != 0.0) {
            System.out.println("Valor total do passeio de " + tipo + ": R$" + valor1);
            System.out.println("Valor total do passeio de " + tipo + ": R$" + valor1); 
        }
       
    }
    
    public static void exibir(Scanner scan, Reserva lista[]){
        scan.nextLine();
        System.out.print("Deseja incluir as refeições na exibição? [S/n]");
         String opcao = scan.nextLine();
        Double valor1, valor2;
        if (opcao.equalsIgnoreCase("S") || opcao.equalsIgnoreCase("SIM")) {
            System.out.print(lista[0].exibirReserva(true));
            System.out.print(lista[1].exibirReserva(true));
        }  else{ 
            System.out.print(lista[0].exibirReserva());
            System.out.print(lista[1].exibirReserva());
        }
    }
}


