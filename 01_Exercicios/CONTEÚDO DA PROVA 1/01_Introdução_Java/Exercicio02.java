/*
 * Exercicio02.java
 * Autor: @guilhermegcastro
 * 
 * 2. Faça um programa que leia um valor numérico inteiro. 
 * O programa deve Apresentar a mensagem “O valor está na faixa permitida”, 
 * caso o valor informado esteja entre 1 e 9. 
 * Se o valor estiver fora da faixa, o programa deve apresentar a mensagem “
 * O valor está fora da faixa permitida”.
 */


import java.util.Scanner;
public class Exercicio02 {
	
	public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número inteiro: > ");
        int number = scan.nextInt();
        if(number > 0 && number < 10)
            System.out.println("* O valor está na faixa permitida.");
        else 
            System.out.println("* O valor está fora da faixa permitida.");
	}
}

