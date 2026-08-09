/*
 * Exercicio05.java
 * Autor: @guilhermegcastro
 * 
 * 5. Desenvolva um programa que leia quatro valores numéricos inteiros e mostre os valores que são divisíveis por 2 e 3.
 * 
 */

import java.util.Scanner;
public class Exercicio05 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] values = new int[4];
        for(int i = 0; i < 4; i++){
            System.out.println("Insira o " + (i+1) + "º valor:");
            values[i] = scan.nextInt();
        }
        boolean flag = false;
        for (int i = 0; i < 4; i++) {
            if(values[i]%2 == 0 && values[i]%3 == 0) {
                if(flag == false){
                    flag = true;
                    System.out.println("Valores divisíveis por 2 e 3: ");
                }
                System.out.print(values[i] + " ");
            }
        }
        if(flag == false){
            System.out.println("Nenhum valor informado é divisível por 2 e por 3.");
        }
        
    }
    
}
