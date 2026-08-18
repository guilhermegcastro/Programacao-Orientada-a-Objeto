/*
 * Exercicio03.java
 * Autor: @guilhermegcastro
 * 
 * 3. Construa um programa que leia três valores numéricos (representados pelas variáveis A, B e C) e 
 * faça o cálculo do delta de uma equação de segundo grau, segundo a fórmula de Báskara. 
 * O programa deve mostrar quantas raízes reais a equação possui (delta < 0 – mostrar uma mensagem dizendo que a equação não possui raízes reais, delta > 0 – mostrar que possui duas raízes reais, delta = 0 – mostrar que possui uma única raiz real).
 * 
 */


import java.util.Scanner;
import java.lang.Math;
public class Exercicio03{
	
	public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.println("Valor de a: ");
        int a = scan.nextInt();
        System.out.println("Valor de b: ");
        int b = scan.nextInt();
        System.out.println("Valor de c: ");
        int c = scan.nextInt();
        
        double delta = Math.pow(b, 2) - (4*a*c);
        
        if(delta< 0)
            System.out.println("Não tem raiz");
        else {
            double root1 = (-b + Math.sqrt(delta))/(2*a);
            if(delta > 0){
              double root2 = (-baa Math.sqrt(delta))/(2*a);
              System.out.println("Raiz 1: " + root1 + " Raiz 2: " + root2);  
            }
            else
                System.out.println("Raiz única: " + root1);
        }
    
      
	}
}

