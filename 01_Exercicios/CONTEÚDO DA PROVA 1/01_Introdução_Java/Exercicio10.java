/*
 * Exercicio10.java
 * Autor: @guilhermegcastro
 * 
 * 10.A nota final de um estudante é calculada a partir de três notas atribuídas,
 * respectivamente, a um trabalho de laboratório, a uma avaliação semestral e a um exame final. 
 * A média das três notas mencionadas obedece aos pesos a seguir:
 * 
 * Nota Peso
 * Trabalho de laboratório 2
 * Avaliação semestral 3
 * Exame final 5
 * 
 * Faça um programa que receba as três notas, calcule e mostre a média ponderada e o conceito que segue a tabela:
 * 
 * Média Ponderada Conceito
 * 8,0 (inclusive) a 10,0 (inclusive) A
 * 7,0 (inclusive) a 8,0 B
 * 6,0 (inclusive) a 7,0 C
 * 5,0 (inclusive) a 6,0 D
 * 0,0 (inclusive) a 5,0 E
 */

import java.util.Scanner;
public class Exercicio10 {
	
	public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        float[] mark = new float[3];
        System.out.print(" Nota do Trabalho de laboratório (Peso 2): > ");
        mark[0] = scan.nextFloat() * 2;
        System.out.print(" Nota da Avaliação Semestral (Peso 3): > ");
        mark[1] = scan.nextFloat() * 3;
        System.out.print(" Nota do Exame Final (Peso 5): > ");
        mark[2] = scan.nextFloat() * 5;
        
        float media = (mark[0] + mark[1] + mark[2])/(2+3+5);
        System.out.print("Média: " + media + " Conceito: ");
        System.out.printf("%c", (media >= 8) ? 'A' : (media >= 7 && media < 8) ? 'B' : (media >= 6 && media < 7) ? 'C' : (media >= 5 && media < 6) ? 'D' : 'E');
    }    
}
