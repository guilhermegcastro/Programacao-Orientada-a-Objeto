/*
 * Paciente.java
 * 
 * Crie uma classe Paciente para representar um paciente de uma clínica com atributos para armazenar o nome, o sexo, o peso e a altura. 
 * Crie um método Double calcularIMC() para calcular o índice de massa corpórea do paciente (IMC = peso / altura2).
 * Paciente
 * 
 * ~ nome: String
 * ~ sexo: String
 * ~ peso: Double
 * ~ altura: Double
 * + calcularIMC(): Double
 * 
 * Crie uma classe Clinica com o método main que instancie dois pacientes, leia os valores para seus atributos e calcule e mostre seus nomes, sexos e IMCs.
 * Os sinais ~ e + representam os modificadores:
 * 
 * ~ Default (sem modificador)
 * + public
 * - private
 * # protected
 * 
 */

public class Paciente {
    String nome;
    String sexo;
    Double peso = 0.0;
    Double altura = 0.0;
    
    public Double calcularIMC(){
        return this.peso / (this.altura*this.altura);
    }; 
}

