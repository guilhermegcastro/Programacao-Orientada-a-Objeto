/*
 * Exercicio04.java
 * Autor: @guilhermegcastro
 * 
 * 4. Construa um programa que leia três valores para os lados de um triângulo (A, B e C). 
 * O programa deve verificar se os lados fornecidos formam realmente um triângulo.
 * Em caso positivo, deve mostrar a mensagem “Os lados formam um triângulo” e caso contrário “Os valores informados não podem formar um triângulo”. 
 * Para que três valores de lados formem um triângulo, cada par de lados somados não pode ser menor ou igual ao terceiro lado.
 */

import java.util.Scanner;
import java.lang.Math;
public class Exercicio04 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lado A do triângulo: > ");
        int A = scan.nextInt();
        System.out.println("Lado B do triângulo: > ");
        int B = scan.nextInt();
        System.out.println("Lado C do triângulo: > ");
        int C = scan.nextInt();
        int max = Math.max(A, Math.max(B,C));
        int min = Math.min(A, Math.min(B,C));
        int med = A + B + C - max - min;
        if (med+min<=max)
            System.out.println("Não forma um triângulo.");
        else 
            System.out.println("Forma um triângulo.");
    }
}
