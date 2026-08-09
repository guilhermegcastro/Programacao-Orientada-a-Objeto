/*
 * Exercicio01.java
 * Autor: @guilhermegcastro
 * 
 * 1. Faça um programa que leia dois valores numéricos inteiros e 
 * apresenteo resultado da diferença do maior valor pelo menor valor. 
 * Se os valoresforem iguais, o programa deve mostrar zero.
 */


import java.util.Scanner;
public class Exercicio01 {
	
	public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.print("Insira um valor númerico: > ");
        int value1 = scan.nextInt();
        System.out.print("Insira outro valor númerico: > ");
        int value2 = scan.nextInt();
        if (value1 != value2)
            System.out.printf(" A diferença do maior (%d) pro menor (%d) é de %d", (value1 > value2) ? value1 : value2, (value2 < value1) ? value2 : value1,(value1 > value2) ? value1 - value2 : value2 - value1);
        else 
            System.out.println("Os valores são iguais e a diferença é de 0.");
    }
}

