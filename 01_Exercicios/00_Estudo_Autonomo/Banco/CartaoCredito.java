/*
 * CartaoCredito.java
 */


public class CartaoCredito implements MetodoPagamento{
	private double limiteDeCredito;
    
    public CartaoCredito(double limiteDeCredito){
        this.limiteDeCredito = limiteDeCredito;
    }
    
    
    @Override
    public boolean processarPagamento(double valor){
        if (valor <= limiteDeCredito) {
            limiteDeCredito -= valor;
            System.out.println("[ CARTAO ] Pagamento de R$ [" + valor + "] aprovado. Limite restante: R$ [" + limiteDeCredito + "]");
            return true;
        } else {
            System.out.println("[ CARTAO ] Transação negada: Limite de crédito insuficiente.");
            return false;
        }
    }
    
    
}

