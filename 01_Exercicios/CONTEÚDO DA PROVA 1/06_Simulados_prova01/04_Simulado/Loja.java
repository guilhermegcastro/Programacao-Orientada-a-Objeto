/*
 * Loja.java
 * 
 //~ Crie uma classe Loja que implemente três produtos e permita a manipulação (teste dos métodos) através de
//~ um menu com repetição. O menu deve permitir:
//~ 1. Vender um produto (com ou sem desconto).
//~ 2. Comprar um produto (com ou sem frete).
//~ 3. Calcular o valor total do estoque (com ou sem imposto).
//~ 4. Exibir os detalhes de um produto (com ou sem estoque).
//~ 5. Sair do programa.
//~ Regras:
//~ - Utilize encapsulamento.
//~ - Não permitir vender mais produtos do que há em estoque.
//~ - O menu deve ser repetido até que o usuário escolha a opção de sair.
 */


import java.util.Scanner;
public class Loja {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
        Produto p1 = new Produto("Lápis", 7.0, 30, "Material Escolar");
        Produto p2 = new Produto("Boné", 29.0, 7, "Acessórios");
        Produto p3 = new Produto("Biscoito Recheado", 2.0, 80, "Alimentício");
        Produto []lista = {p1, p2, p3};
        System.out.println("Aperte qualquer tecla para iniciar o sistema: ");
        limparTela(scan, false);
        while(true){
            switch (menu(scan)){
                case 1: limparTela(scan, true);
                    venderProduto(scan, lista);
                    limparTela(scan, true);
                    break;
                case 2: limparTela(scan, true);
                    comprarProduto(scan, lista);
                    limparTela(scan, true);
                    break;
                case 3: limparTela(scan, true);
                    calcularEstoque(scan, lista);
                    limparTela(scan, true);
                    break;
                case 4: limparTela(scan, true);
                    exibirProduto(scan, lista);
                    limparTela(scan, true);
                    break;
                case 5: System.out.println("Tchau");
                    return;
                default: limparTela(scan, false);
                    System.out.println("Opção inválida.");;
                ;
            }
        }
	}
    
    public static void limparTela(Scanner scan, boolean flag){
        scan.nextLine();
        if (flag) {
            System.out.println("\n[!] - Pressione qualquer tecla para prosseguir");
            scan.nextLine();
        }
        for (int i = 0; i < 50; i++) 
            System.out.print("\n");
        
    }
    
    public static void exibirProduto(Scanner scan, Produto []lista){
        System.out.println("Você deseja mostrar o estoque? [S/n]");
        String opcao = scan.nextLine();
        if (opcao.equalsIgnoreCase("S") || opcao.equalsIgnoreCase("SIM")) {
            for (Produto produto : lista){
                System.out.print(produto.exibirDetalhes(true));
                System.out.print("\n");
            }
        } else {
            for (Produto produto : lista){
                System.out.print(produto.exibirDetalhes());
                System.out.print("\n");
            }
        }
    }
    public static void calcularEstoque(Scanner scan, Produto []lista){
         System.out.println(" Escolha o produto para calcular o valor do estoque:\n 1 - " + lista[0].getNome() + "\n 2 - " + lista[1].getNome() + "\n 3 - " + lista[2].getNome());
        int escolha = scan.nextInt() - 1;
        if (escolha < 0 || escolha > 2) {
            System.out.println("Produto inválido.");
            return;
        }
        System.out.println("O produto possui imposto? [S/n]");
        String opcao = scan.next();
        Double preco;
        if (opcao.equalsIgnoreCase("S") || opcao.equalsIgnoreCase("SIM")) {
            System.out.println("Insira a porcentagem (em inteiro) do imposto: ");
            preco = lista[escolha].calcularValorTotalEstoque(scan.nextDouble());
        } else 
            preco = lista[escolha].calcularValorTotalEstoque();
         System.out.println("Valor do estoque de " + lista[escolha].getNome() + ": R$" + preco);
    
    
       
    }
    public static void venderProduto(Scanner scan, Produto []lista){
        System.out.println(" Escolha o produto para ser vendido:\n 1 - " + lista[0].getNome() + "\n 2 - " + lista[1].getNome() + "\n 3 - " + lista[2].getNome());
        int escolha = scan.nextInt() - 1;
        if (escolha < 0 || escolha > 2) {
            System.out.println("Produto inválido.");
            return;
        }
        
        System.out.println("Insira a quantidade que será vendida: ");
        int quantidade = scan.nextInt();
        if (quantidade > lista[escolha].getEstoque()){
             System.out.println("O produto não possuí estoque suficiente.");
            return;
        }
        System.out.println("A venda possui desconto? [S/n]");
        String opcao = scan.next();
        Double preco;
        if (opcao.equalsIgnoreCase("S") || opcao.equalsIgnoreCase("SIM")) {
            System.out.println("Insira a porcentagem (em inteiro) do desconto: ");
            preco = lista[escolha].vender(quantidade, scan.nextDouble());
        } else 
            preco = lista[escolha].vender(quantidade);
        System.out.println("Produto " + lista[escolha].getNome() + " vendido por R$" + preco + " (Estoque atual: " + lista[escolha].getEstoque() + ")");
    
    }
    
     public static void comprarProduto(Scanner scan, Produto []lista){
        System.out.println(" Escolha o produto para ser comprado:\n 1 - " + lista[0].getNome() + "\n 2 - " + lista[1].getNome() + "\n 3 - " + lista[2].getNome());
        int escolha = scan.nextInt() - 1;
        if (escolha < 0 || escolha > 2) {
            System.out.println("Produto inválido.");
            return;
        }
        
        System.out.println("Insira a quantidade que será comprada: ");
        int quantidade = scan.nextInt();
        if (quantidade <= 0){
             System.out.println("Quantidade inválida;");
            return;
        }
        System.out.println("A compra possui frete? [S/n]");
        String opcao = scan.next();
        Double preco;
        if (opcao.equalsIgnoreCase("S") || opcao.equalsIgnoreCase("SIM")) {
            System.out.println("Insira o preço do frete: ");
            preco = lista[escolha].comprar(quantidade, scan.nextDouble());
        } else 
            preco = lista[escolha].comprar(quantidade);
        System.out.println("Produto " + lista[escolha].getNome() + " comprado por R$" + preco + " (Estoque atual: " + lista[escolha].getEstoque() + ")");
    
    }
    
    public static int menu(Scanner scan){
        System.out.println("= MENU = \n");
        System.out.println(
            "1. Vender um produto\n" + 
            "2. Comprar um produto\n" + 
            "3. Calcular o valor total do estoque\n" +
            "4. Exibir os detalhes de um produto\n" +
            "5. Sair do programa.\n");
        System.out.print("Insira a opção desejada: ");
        return scan.nextInt();
        
    }
    
    
}

