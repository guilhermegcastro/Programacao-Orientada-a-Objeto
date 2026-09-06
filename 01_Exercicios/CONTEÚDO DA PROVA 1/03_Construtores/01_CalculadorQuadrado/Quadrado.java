/*
 * Quadrado.class 
 */


public class Quadrado{
	
        Double lado;
        
        public Quadrado(Double lado){
            this.lado = lado;
            System.out.println("Quadrado criado! Tamanho do lado: " + lado);
        }
        
        public Double calcularArea(){
            return lado*lado;
        }
        public Double calcularPerimetro(){
            return 4*lado;
        }

}

