
//~ Crie os construtores para todas as classes.
//~ Implemente a classe Loja contendo o método main, instancie um cliente e um produto, faça uma
//~ venda e imprima os dados da venda na tela.


public class Loja{
	
	public static void main (String[] args) {
		Cliente cliente = new Cliente("Gomez", "111.111.111-11", 5000.0);
        Produto produto = new Produto(123, "Video Game Top", 2500.0);
        Venda venda1 = new Venda(cliente, produto, 1, 2);
        System.out.println(venda1.imprimir());
        
        produto.setCusto(5000.0);  //Mudar o custo ja altera o preço do produto.
        cliente.setRenda(10000.0); // Mudar a renda ja altera o limite do cartao.
        venda1.setQuantidade(5);
        System.out.println(venda1.imprimir());
    }
}

