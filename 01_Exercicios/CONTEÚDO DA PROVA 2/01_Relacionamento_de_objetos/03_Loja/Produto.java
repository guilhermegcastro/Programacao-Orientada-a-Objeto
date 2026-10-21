//~ Elabore uma classe Produto, com a seguinte estrutura:
//~ Produto

//~ - int codigo
//~ - String descricao
//~ - Double custo
//~ - Double preco
//~ + calculaPreco(): void

//~ O método calculaPreco() calcula o valor de venda do produto a partir de seu custo pela fórmula:
//~ preco = custo + 25%. O resultado do calculo deve ser armazenado no atributo preco. Sempre que o
//~ custo for alterado o novo preco deve ser calculado. Não crie o método setPreco().

public class Produto {
    
    //Atributos
    private int codigo;
    private String descricao;
    private Double custo;
    private Double preco;
    
    //Construtor
    public Produto(int codigo, String descricao, Double custo){
        this.codigo = codigo;
        this.descricao = descricao;
        this.custo = custo;
        calculaPreco();
    }
    //Métodos
    public void calculaPreco(){
        this.preco = custo + (custo * 0.25);
    }
    
    //gets e sets 
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setNome(int codigo) {
        this.codigo = codigo;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Double getCusto() {
        return this.custo;
    }
    
    public void setCusto(Double custo) {
        this.custo = custo;
        calculaPreco();
    }
    
    public Double getPreco() {
        return this.preco;
    }

}

