/*Crie uma classe Funcionario para representar um funcionário com atributos para armazenar o nome,
as horas trabalhadas e valor da hora. Crie um método salarioFinal() para calcular o salário do
trabalhador considerando um desconto de previdência de 11%.
Crie uma classe Empresa com o método main que instancie três funcionários, leia os valores para
seus atributos e calcule e mostre seus nomes e salários.
*/

import java.util.Scanner;
public class Empresa {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Funcionario[] lista = new Funcionario[3];
        for (int i = 0; i < 3; i++){
            System.out.printf("Insira o  nome do %d funcionário: > ", i+1);
            String nome = scan.nextLine();
            System.out.printf("Insira o valor da hora do %d funcionário: > ", i+1);
            Double valor = scan.nextDouble();
            System.out.printf("Insira a quantidade de horas trabalhadas do %d funcionário: > ", i+1);
            Double hora = scan.nextDouble();
            scan.nextLine();
            lista[i] = new Funcionario(nome, hora, valor);
        }
        lista[0].print();
        lista[1].print();
        lista[2].print();
    }
}
