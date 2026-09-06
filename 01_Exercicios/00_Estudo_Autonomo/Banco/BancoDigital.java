/*
Exercício: Sistema de Pagamentos (Interfaces)

1. A Interface (MetodoPagamento.java)
Crie uma interface pública chamada MetodoPagamento.
Ela deve ter apenas a assinatura de um método: 
boolean processarPagamento(double valor);

2. As Implementações (As classes concretas)
Crie duas classes que assinem esse contrato (usando a palavra implements):

* Classe Pix (Pix.java): 
  Ao implementar o método processarPagamento, ela não precisa de validação complexa. 
  Apenas imprima na tela: "[ PIX ] Pagamento de R$ [valor] realizado com sucesso. Chave gerada."
  E retorne true.

* Classe CartaoCredito (CartaoCredito.java):
  Esta classe vai testar se você consolidou o encapsulamento. 
  Ela deve ter um atributo: private double limiteDeCredito;
  Crie um construtor para definir esse limite logo na criação do cartão.
  Ao implementar o método processarPagamento, aplique a regra de negócio:
  - Se o valor cobrado for menor ou igual ao limiteDeCredito: 
    subtraia o valor do limite, imprima "[ CARTAO ] Pagamento de R$ [valor] aprovado. Limite restante: R$ [novo limite]" e retorne true.
  - Se for maior: 
    imprima "[ CARTAO ] Transação negada: Limite de crédito insuficiente." e retorne false.

3. O Teste (Main.java)
Crie a classe Main com o método public static void main(String[] args).
- Instancie um objeto da classe Pix.
- Instancie um objeto da classe CartaoCredito (passando um limite inicial no construtor).
- Chame o método processarPagamento em ambos passando valores diferentes para testar as aprovações e recusas (teste o cartão estourando o limite de propósito).
*/

public class BancoDigital{
    public static void main (String[] args){
        MetodoPagamento pix = new Pix();
        MetodoPagamento cartao = new CartaoCredito(100.0);
        pix.processarPagamento(100.0);
        cartao.processarPagamento(50.0);
        cartao.processarPagamento(100.0);
    }
}


