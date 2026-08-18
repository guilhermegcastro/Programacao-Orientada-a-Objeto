/*
 * Exercicio07.java
 * Autor: @guilhermegcastro
 * 
 * 7. Desenvolva um programa que leia três valores numéricos inteiros,
 * identifique e apresente o maior valor informado.
 * 
 */

import java.util.Scanner;
import java.lang.Math;
public class Exercicio07 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] values = new int[3];
        for (int i = 0; i < 3; i++){
            System.out.print(" Insira o " + (i+1) + "º valor: > ");
            values[i] = scan.nextInt();
        }
        System.out.println("O maior valor informado é " + Math.max(values[0], Math.max(values[1], values[2])));
    }
}
