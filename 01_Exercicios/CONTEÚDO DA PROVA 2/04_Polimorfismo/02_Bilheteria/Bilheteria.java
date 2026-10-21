import java.util.Scanner;

public class Bilheteria {
    
    // Lista polimórfica: guarda qualquer tipo de Ingresso
    private static Ingresso[] ingressos = new Ingresso[100];
    private static int total = 0;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            opcao = menu();
            switch (opcao) {
                case 1: cadastrarNormal(); break;
                case 2: cadastrarVip(); break;
                case 3: cadastrarCamaroteInferior(); break;
                case 4: cadastrarCamaroteSuperior(); break;
                case 5: listarIngressos(); break;
                case 6: System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida.");
            }
        } while (opcao != 6);
    }

    public static int menu() {
        System.out.println("\n=== BILHETERIA ===");
        System.out.println("1 - Cadastrar Ingresso Normal");
        System.out.println("2 - Cadastrar Ingresso VIP");
        System.out.println("3 - Cadastrar Camarote Inferior");
        System.out.println("4 - Cadastrar Camarote Superior");
        System.out.println("5 - Listar todos os ingressos");
        System.out.println("6 - Sair");
        System.out.print("Escolha: ");
        return sc.nextInt();
    }

  
    public static void cadastrarNormal() {
        if (!verificaTamanho())
            return;
        System.out.println("Valor do ingresso? ");
        Double valor = sc.nextDouble();
        System.out.println("Tem acesso a pista? [S/n]");
        char op = sc.next().charAt(0);
        if (Character.toUpperCase(op) == 'S') {
            ingressos[total++] = new Normal(valor, true);
        }
        else
            ingressos[total++] = new Normal(valor, false);
        System.out.println("Ingresso normal cadastrado no valor de " + ingressos[total-1].mostrarValor());
    }


    public static void cadastrarVip() {
        if (!verificaTamanho())
            return;
        System.out.println("Valor do ingresso? ");
        Double valor = sc.nextDouble();
        System.out.println("Valor adicional?");
        Double adicional = sc.nextDouble();
        ingressos[total++] = new Vip(valor, adicional);
        System.out.println("Ingresso VIP cadastrado no valor de " + ingressos[total-1].mostrarValor());
    }


    public static void cadastrarCamaroteInferior() {
        if (!verificaTamanho())
            return;
        System.out.println("Valor do ingresso? ");
        Double valor = sc.nextDouble();
        System.out.println("Valor adicional?");
        Double adicional = sc.nextDouble();
        System.out.println("Acesso a lateral ou frontal?");
        sc.nextLine();
        String acesso = sc.next();
        ingressos[total++] = new CamaroteInferior(valor, adicional, acesso);
        System.out.println("Ingresso do Camarote Inferior cadastrado no valor de " + ingressos[total-1].mostrarValor());
    }

    public static void cadastrarCamaroteSuperior() {
        if (!verificaTamanho())
            return;
        System.out.println("Valor do ingresso? ");
        Double valor = sc.nextDouble();
        System.out.println("Valor adicional?");
        Double adicional = sc.nextDouble();
        System.out.println("Lado A ou B?");
        sc.nextLine();
        char lado = sc.next().charAt(0);
        ingressos[total++] = new CamaroteSuperior(valor, adicional, lado);
        System.out.println("Ingresso do Camarote Superior cadastrado no valor de " + ingressos[total-1].mostrarValor());
    }

    public static void listarIngressos() {
        if(total == 0){
            System.out.println("Lista vazia.");
            return;
        }
        for(int i = 0; i < total; i++) {
            System.out.println("===");
            System.out.println(ingressos[i]);
            System.out.println("Valor Total: " + ingressos[i].mostrarValor());
        }
    }
    
    public static boolean verificaTamanho(){
        if(total >= ingressos.length){
            System.out.println("Lista de ingressos cheia.");
            return false;
        }
        else 
            return true;
    }
}
