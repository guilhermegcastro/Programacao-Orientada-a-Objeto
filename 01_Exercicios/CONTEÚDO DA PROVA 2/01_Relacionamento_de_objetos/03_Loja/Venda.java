//~ Elabore uma classe Venda, com a seguinte estrutura:
//~ Venda
//~ - int numero
//~ - Cliente comprador
//~ - Produto produto
//~ - int quantidade
//~ + imprimir(): String

//~ O método imprimir() retorna uma String contendo as informações da compra (Nome do comprador,
//~ descrição do produto, quantidade, valor total da compra e a informação se a compra está dentro do
//~ limite de crédito do cliente ou se é maior.
//~ Crie os construtores para todas as classes.
//~ Implemente a classe Loja contendo o método main, instancie um cliente e um produto, faça uma
//~ venda e imprima os dados da venda na tela.
 
public class Venda {
    
    private int numero;
    private Cliente comprador;
    private Produto produto;
    private int quantidade;
    
    public Venda(Cliente comprador, Produto produto, int numero, int quantidade){
        this.comprador = comprador;
        this.produto = produto;
        this.numero = numero;
        this.quantidade = quantidade;
    }

    
    public String imprimir(){
        Double total = produto.getPreco() * quantidade;
        return 
            "\nNome do comprador: " + comprador.getNome() +
            "\nDescrição do produto: " + produto.getDescricao() +
            "\nQuantidade: " + quantidade +
            "\nValor total da compra: R$" + total +
            "\nEstá dentro do limite do crédito do cliente: " + ((comprador.getLimiteDeCredito() >= total)? "SIM " : "NÃO") + "(R$" + comprador.getLimiteDeCredito() + ")";
    }
    
    public Cliente getComprador() {
        return this.comprador;
    }
    
    public Produto getProduto() {
        return this.produto;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getQuantidade() {
        return this.quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

