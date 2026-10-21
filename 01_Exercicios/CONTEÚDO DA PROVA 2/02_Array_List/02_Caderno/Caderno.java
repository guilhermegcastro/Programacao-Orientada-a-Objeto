//~ Crie uma classe principal (main) que implemente uma agenda e realize as seguintes tarefas:
//~ cadastrar contatos;
//~ remover contatos;
//~ buscar um contato pelo nome;
//~ alterar contato;
//~ listar aniversariantes de um mês;
//~ listar telefones de contatos que tenham telefone cadastrado;


import java.util.Scanner;
public class Caderno {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira o nome da Agenda: ");
        String nome = sc.nextLine();
        System.out.print("Insira a quantidade máxima de contatos: ");
        Agenda agenda = new Agenda(nome, sc.nextInt());
        while (true) {
            switch (menu(sc, agenda.getNomeDaAgenda())) {
                case 1: cadastro(sc, agenda, false);
                    break;
                case 2: cadastro(sc, agenda, true);
                    break;
                case 3: remocao(sc, agenda);
                    break;
                case 4: busca(sc, agenda);
                    break;
                case 5: altera(sc, agenda);
                    break;
                case 6: listaMes(sc, agenda);
                    break;
                case 7: listaTelefone(agenda);
                    break;
                default:
                ;
            }
        }
        
	}
    
    public static int menu(Scanner sc, String nome){
        System.out.printf("= %s =\n", nome);
        System.out.println("\n 1 - Cadastrar Contato (Somente nome) \n 2 - Cadastrar Contato (Completo) \n 3 - Remover Contato\n 4 - Buscar contato\n 5 - Alterar contato\n 6 - Listar aniversariantes de um mês\n 7 - Listar telefones\n\n >> ");
        return sc.nextInt();
    }
    
    
    public static void cadastro(Scanner sc, Agenda agenda, boolean completo){
        if(agenda.getTotalContatos() >= agenda.getContatos().length){
            System.out.println("Lista cheia!");
            return;
        }
        sc.nextLine();
        System.out.println("Informe o nome da pessoa: > ");
        String n = sc.nextLine();
        if(completo){
            System.out.println("Informe o mẽs de Nascimento: (1 a 12) > ");
            int m;
            while(true){
                m = sc.nextInt();
                if(m >= 0 && m <= 12) {
                    break;
                }
                System.out.println("Informe um mês válido: > ");
            }
            sc.nextLine();
            
            System.out.println("Informe o dia de Nascimento: (1 a 31) > ");
            int d;
            while(true){
                d = sc.nextInt();
                if( d >= 0 && d <= 31) {
                    break;
                }
                System.out.println("Informe um dia válido: > ");
            }
            sc.nextLine();
            
            System.out.println("Informe o telefone: > ");
            String t = sc.nextLine();
            
            agenda.adicionaPessoa(new Pessoa(n, d, m, t));
        }
        else 
              agenda.adicionaPessoa(new Pessoa(n));
    }
    
    public static void remocao(Scanner sc, Agenda agenda){
        sc.nextLine();
        System.out.println("Informe o nome da pessoa que você deseja remover: ");
        String n = sc.nextLine();
        if(agenda.removePessoa(new Pessoa(n)))
            System.out.printf("%s removido/a com sucesso!", n);
        else 
            System.out.printf("%s não foi encontrado/a.", n);
    }
    
    public static void busca(Scanner sc, Agenda agenda){
        sc.nextLine();
        System.out.println("Informe o nome do contato que você deseja buscar: ");
        String n = sc.nextLine();
        Pessoa p = agenda.buscaContato(n);
        if (p!=null) 
            System.out.println(p);
        else 
            System.out.printf("%s não foi encontrado/a.", n);
    }

    public static void altera(Scanner sc, Agenda agenda){
        sc.nextLine();
        System.out.println("Informe o nome da pessoa que você deseja alterar os dados (Data nascimento e Telefone): ");
        String n = sc.nextLine();
        if(agenda.buscaContato(n)!= null){
              System.out.println("Informe o novo mẽs de Nascimento: (1 a 12) > ");
            int m;
            while(true){
                m = sc.nextInt();
                if(m >= 0 && m <= 12) {
                    break;
                }
                System.out.println("Informe um mês válido: > ");
            }
            sc.nextLine();
            
            System.out.println("Informe o  novo dia de Nascimento: (1 a 31) > ");
            int d;
            while(true){
                d = sc.nextInt();
                if( d >= 0 && d <= 31) {
                   break;
                }
                System.out.println("Informe um dia válido: > ");
            }
            sc.nextLine();
            
            System.out.println("Informe o  novo telefone: > ");
            String t = sc.nextLine();
            
            agenda.alteraInformacoes(new Pessoa(n, d, m, t));
            
        }
        else
            System.out.printf("%s não foi encontrado/a.", n);
    }

    public static void listaMes(Scanner sc, Agenda agenda){
        sc.nextLine();
        System.out.println("Informe o mês que você deseja listar: ");
        int m;
        while(true){
            m = sc.nextInt();
            if(m >= 0 && m <= 12) {
                break;
            }
            System.out.println("Informe um mês válido: > ");
        }
        
        boolean existe = false;
        for (Pessoa lista : agenda.buscaPessoas()){
            if(m == lista.getMesDeNascimento()) {
                System.out.println(lista);
                existe = true;
            }
        }
        
        if(!existe){
            System.out.println("Lista vazia\n.");
        }
        
    }
    
    public static void listaTelefone(Agenda agenda){
    
        boolean existe = false;
        for (Pessoa lista : agenda.buscaPessoas()){
            if(lista.getTelefone().equals("indefinido"))
                continue;
            System.out.println(lista);
            existe = true;
        }
        if(!existe){
            System.out.println("Lista vazia\n.");
        }
        
    }

    
    
}

