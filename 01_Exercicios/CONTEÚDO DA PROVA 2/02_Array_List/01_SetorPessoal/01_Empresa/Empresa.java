//~ Exercício de POO

//~ Crie uma classe Empresa que instancia um objeto do tipo SetorPessoal e permita:
//~ • adicionar funcionários.
//~ • remover funcionários.
//~ • mostrar os dados de um determinado funcionário a partir do nome ou da matrícula.
//~ • listar os funcionários e um determinado departamento ou função.
//~ • listar todos os funcionários da empresa.
//~ • mostrar o total da folha de pagamento de um departamento ou da empresa.
//~ (Opcional) As listagens podem ser ordenadas pelo nome ou pelo número de matrícula.
//~ Não se esqueça do encapsulamento e dos construtores.


import java.util.Scanner;
public class Empresa {
	
	public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        SetorPessoal setor = new SetorPessoal(10);
        
       while (true) {
            switch (menu(scan)) {
                case 1: novoFuncionario(scan, setor);
                    break;
                case 2: deletarFuncionario(scan, setor);
                    break;
                case 3: dadoFuncionario(scan, setor);
                    break;
                case 4: listagemFuncionario(scan, setor, 2);
                    break;
                case 5: listagemFuncionario(scan, setor, 1);
                    break;
                case 6: listagemFuncionario(scan, setor, 3);
                    break;
                case 7: folhaPagamento(scan, setor, 1);
                    break;
                case 8: folhaPagamento(scan, setor, 0);
                    break;
                default: System.out.println("Inválido.");
            }
        }
	}
    
    public static int menu(Scanner s){
        System.out.println(" 1 - Novo funcionario\n 2 - Remover funcionario\n 3 - Dados de um funcionario\n 4 - Listar por departamento\n 5 - Listar por funcao\n 6 - Listar todos os funcionarios\n 7 - Mostrar folha de pagamento de um departamento\n 8 - Mostrar folha de pagaemtento da empresa");
        return s.nextInt();
    };
    
    public static void novoFuncionario(Scanner s, SetorPessoal setor){
        s.nextLine();
        
        System.out.println("Nome do funcionario: > ");
        String n = s.nextLine();
        
        System.out.println("Função: > ");
        String f = s.nextLine();
        
        System.out.println("Nº Matrícula : > ");
        int m = s.nextInt();
        
        System.out.println("Departamento > ");
        int d = s.nextInt();
        
        System.out.println("Salário: > ");
        Double sa = s.nextDouble();
    
        s.nextLine();
        
        if(setor.adicionarFuncionario(new Funcionario(m, n, d, sa, f)))
            System.out.printf("Funcionário/a %s (%d) cadastrado/a com sucesso.\n", n, m);   
        else 
            System.out.println("Erro ao cadastrar. Nome e/ou matrícula já existente ou limite máx atingido.");
        
    };
    
    public static void deletarFuncionario(Scanner s, SetorPessoal setor){
        System.out.println("Informe a matricula do funcionário que deseja remover: > ");
        int m = s.nextInt();
        if(setor.removerFuncionario(new Funcionario(m)))
            System.out.printf("Funcionário/a da matrícula %d removido com sucesso.\n", m);
        else 
            System.out.println("Matrícula não encontrada.");
        s.nextLine();
    }
    
    public static void dadoFuncionario(Scanner s, SetorPessoal setor){
        System.out.println("Insira como deseja buscar: (Padrão por matrícula)\n 1 - Matrícula\n 2 - Nome");
        if(s.nextInt() != 2){
            System.out.println("Insira o nº da matrícula: ");
            System.out.println(setor.dadosFuncionario(s.nextInt()));
            s.nextLine();
        }
        else {
            s.nextLine();
            System.out.println("Insira o nome: ");
            System.out.println(setor.dadosFuncionario(s.nextLine()));
        }
        
    }
    
    public static void listagemFuncionario(Scanner s, SetorPessoal setor, int tipo){
        Funcionario[] lista;
        if (tipo == 1) {
            System.out.println("Informe a função que deseja listar: ");
            lista = setor.listarFuncionarios(s.nextLine());
        }
        else if (tipo == 2) {
            System.out.println("Informe o departamento que deseja listar: ");
            lista = setor.listarFuncionarios(s.nextInt());
        }
        else {
            lista = setor.listarFuncionarios();
        }
        
        if(lista.length == 0)
            System.out.println("Lista vazia.");
        else {
            for(Funcionario f : lista){
                System.out.println(
                    "\n\nMatrícula: " + f.getMatricula() +
                    "\nNome: " + f.getNome() +
                    "\nDepartamento: " + f.getDepartamento() +
                    "\nSalário: " + f.getSalario() + 
                    "\nFunção: " +  f.getFuncao()
                );
            }
        }
    }
    
    public static void folhaPagamento(Scanner s, SetorPessoal setor, int tipo){
         Double valor;
        if (tipo == 1) {
            System.out.println("Insira o departamento: ");
            valor = setor.calculoFolha(s.nextInt());
        } 
        else {
            valor = setor.calculoFolha();
        }
        System.out.printf("Folha de Pagamento: R$%.2f\n\n", valor);
    }
    
}

