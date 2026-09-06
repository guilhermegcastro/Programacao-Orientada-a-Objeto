/*
 * Pix.java
 * 
 */


public class Pix implements MetodoPagamento{
    
    @Override
    public boolean processarPagamento(double valor){
        System.out.println("[ PIX ] Pagamento de R$ [" + valor + "] realizado com sucesso. Chave gerada.");
        return true;
    }
    
}

