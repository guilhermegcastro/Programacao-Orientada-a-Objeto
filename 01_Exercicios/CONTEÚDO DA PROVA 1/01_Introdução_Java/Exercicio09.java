/*
 * Exercicio09.java
 * Autor: @guilhermegcastro
 * 
 * 9. Uma empresa decide dar um aumento de 30% aos funcionários cujo salário é inferior a 5000. 
 * Escreva um programa que possa ser utilizado para efetuar o cálculo do salário reajustado de um funcionário, 
 * a partir do valor do salário informado pelo usuário.
 * 
 */

import java.util.Scanner;
public class Exercicio09 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Informe o salário do funcionário: > R$");
        float salario = scan.nextFloat();
        if(salario >= 5000)
            System.out.println(" O salário não está na faixa disponível para aumento.");
        else {
            salario+= salario*0.3;
            System.out.println(" O salário teve aumento de 30% e foi reajustado para R$" + salario);
        }
	}
}

