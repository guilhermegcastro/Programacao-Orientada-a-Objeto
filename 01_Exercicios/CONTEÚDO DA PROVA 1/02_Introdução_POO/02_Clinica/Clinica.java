/*
 * Clinica.java
 * 
 * Copyright 2026 Guilherme Castro <guigos@guilherme-aspirea51545>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


import java.util.Scanner;
public class Clinica {
	
	public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        Paciente p1 = new Paciente();
        Paciente p2 = new Paciente();
        System.out.printf("Informe o nome da 1º pessoa: > ");
        p1.nome = scan.nextLine();
        System.out.printf("Informe o sexo de %s: > ", p1.nome);
        p1.sexo = scan.nextLine();
        System.out.printf("Informe o peso: > ");
        p1.peso= scan.nextDouble();
        System.out.printf("Informe a altura: > ");
        p1.altura = scan.nextDouble();
        scan.nextLine();
        System.out.printf("Informe o nome da 2º pessoa: > ");
        p2.nome = scan.nextLine();
        System.out.printf("Informe o sexo de %s: > ", p2.nome);
        p2.sexo = scan.nextLine();
        System.out.printf("Informe o peso: > ");
        p2.peso= scan.nextDouble();
        System.out.printf("Informe a altura: > ");
        p2.altura = scan.nextDouble();
        
        System.out.println("Nome: " + p1.nome + " Sexo: " + p1.sexo + " IMC: " + p1.calcularIMC());
        System.out.println("Nome: " + p2.nome + " Sexo: " + p2.sexo + " IMC: " + p2.calcularIMC());
    };
    
}


