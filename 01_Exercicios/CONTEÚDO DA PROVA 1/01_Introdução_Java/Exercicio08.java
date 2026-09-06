/*
 * Exercicio08.java
 * Autor: @guilhermegcastro
 * 
 * 8. Desenvolva um programa que leia três valores numéricos inteiros,
 * identifique e apresente o menor valor informado.
 * 
 */

import java.util.Scanner;
import java.lang.Math;
public class Exercicio08 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] values = new int[3];
        for (int i = 0; i < 3; i++){
            System.out.print(" Insira o " + (i+1) + "º valor: > ");
            values[i] = scan.nextInt();
        }
        System.out.println("O menor valor informado é " + Math.min(values[0], Math.min(values[1], values[2])));
    }
}
