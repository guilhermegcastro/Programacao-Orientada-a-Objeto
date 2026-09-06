/*
 * Loja.java
 * 
 * Crie uma classe chamada Fatura que possa ser utilizado por uma loja de suprimentos de informática para representar 
 * uma fatura de um item vendido na loja. Uma fatura deve incluir as seguintes informações como atributos:
 * 
 * 
 * • o número do item faturado,
 * • a descrição do item,
 * • a quantidade comprada do item e
 * • o preço unitário do item.
 * 
 * 
 * A classe possui um construtor que inicializa os quatro atributos. Se a quantidade não for positiva, ela deve ser configurada como 0.
 * Se o preço por item não for positivo ele deve ser configurado como 0.0.
 * Forneça um método chamado getValorDaFatura() que calcula o valor da fatura (isso é, multiplica a quantidade pelo preço por item).
 * 
 * Fatura
 * 
 * ~ numero: int
 * ~ descricao: String
 * ~ quantidade: int
 * ~ preco: Double
 * + getValorDaFatura(): Double
 * + Fatura (numero: int, descricao: String, quantidade: int, preco: Double)
 * 
 * 
 * Crie uma classe de teste (main) que instancie duas faturas e teste seus métodos.
 * 
 */


public class Loja {
	
	public static void main (String[] args) {
        Fatura f1 = new Fatura(1, "Lapís Invisível ", 20, 5.5);
        Fatura f2 = new Fatura(2, "Flauta muda ", 50, 10.5);
        System.out.print(f1);
        System.out.print("\nFatura 1: " + f1.getValorDaValorFatura());
        System.out.print(f2);
        System.out.print("\n Fatura 2: " + f2.getValorDaValorFatura());
	}
}

