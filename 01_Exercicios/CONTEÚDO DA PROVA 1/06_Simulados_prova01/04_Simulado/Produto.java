//~ Crie uma classe chamada Produto com a seguinte estrutura:
//~ Produto

//~ - nome: String
//~ - preco: Double
//~ - estoque: int
//~ - categoria: String
//~ + Produto(nome: String, preco: Double, estoque: int, categoria: String)
//~ + vender(quantidade: int): Double
//~ + vender(quantidade: int, desconto: Double): Double
//~ + comprar(quantidade: int): Double
//~ + comprar(quantidade: int, frete: Double): Double
//~ + calcularValorTotalEstoque(): Double
//~ + calcularValorTotalEstoque(imposto: Double): Double
//~ + exibirDetalhes(): String
//~ + exibirDetalhes(mostrarEstoque: boolean): String

//~ 1. O construtor inicializa os atributos recebidos por parâmetro.

//~ 2. O método vender(quantidade: int) reduz a quantidade em estoque do produto com base na quantidade
//~ vendida e retorna o valor total da venda (quantidade * preço).

//~ 3. O método vender(quantidade: int, desconto: Double) reduz a quantidade em estoque e aplica um desconto
//~ ao preço do produto durante a venda e retorna o valor total da venda (quantidade * preço - desconto).

//~ 4. O método comprar(quantidade: int) aumenta a quantidade em estoque do produto com base na quantidade
//~ comprada e retorna o valor total da compra (quantidade * preço).

//~ 5. O método comprar(quantidade: int, frete: Double) aumenta a quantidade em estoque do produto com base
//~ na quantidade comprada e retorna o valor total da compra (quantidade * preço + frete).

//~ 6. O método calcularValorTotalEstoque() retorna o valor total do estoque (preço * estoque).

//~ 7. O método calcularValorTotalEstoque(imposto: Double) retorna o valor total do estoque, incluindo um
//~ imposto percentual sobre o valor total.

//~ 8. O método exibirDetalhes() retorna uma String com as informações do produto, incluindo nome, preço e
//~ categoria.

//~ 9. O método exibirDetalhes(mostrarEstoque: boolean) retorna uma String com as informações do produto e,
//~ se mostrarEstoque for true, inclui a quantidade em estoque

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


public class Produto {
	        
    private String nome;
    private Double preco;
    private int estoque;
    private String categoria;
    
    public Produto(String nome, Double preco, int estoque, String categoria){
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.estoque = estoque;
    }
    public Double vender(int quantidade){
        Double venda = quantidade * preco;
        estoque -= quantidade;
        return venda;
    }
    public Double vender(int quantidade, Double desconto){
        Double venda = vender(quantidade);
        return venda - (venda * desconto/100);
    }

    public Double comprar(int quantidade){
        Double compra = quantidade * preco;
        estoque += quantidade;
        return compra;
    }
    
    public Double comprar(int quantidade, Double frete){
        return comprar(quantidade) + frete;
    }
    
    public Double calcularValorTotalEstoque(){
        return preco*estoque;
        
    }
    public Double calcularValorTotalEstoque(Double imposto){
        Double valor = calcularValorTotalEstoque();
        return valor + (valor * (imposto/100));
    }
    public String exibirDetalhes(){
        return "NOME DO PRODUTO: " + nome + "\n" +
        "PREÇO: R$" + preco + "\n" +
        "CATEGORIA: " + categoria + "\n";
    }
    public String exibirDetalhes(boolean mostrarEstoque){
        return exibirDetalhes() + ((mostrarEstoque)? "ESTOQUE: " + estoque + "\n": " ");
    }

    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome ;
    }

    public String getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPreco() {
        return this.preco;
    }
    
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return this.estoque;
    }
    
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}

