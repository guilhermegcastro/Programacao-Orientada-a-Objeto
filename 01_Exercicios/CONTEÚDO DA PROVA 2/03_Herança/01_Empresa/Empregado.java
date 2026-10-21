// Exercício de Herança – POO

public class Empregado extends Pessoa{
	
    // # Atributos 
    private int codigoSetor;
    private Double salarioBase;
    private Double imposto;
    
    // # Construtor 
    public Empregado(String nome, String endereco, String telefone, int codigoSetor, Double salarioBase, Double imposto){
        
        super(nome, endereco, telefone);
            
        if(codigoSetor<0)
            this.codigoSetor = codigoSetor * -1;
        else 
            this.codigoSetor = codigoSetor;
            
        if(salarioBase < 100.0)
            this.salarioBase = 100.0;
        else
            this.salarioBase = salarioBase;
        
        if(imposto < 0.0)
            this.imposto = 0.0;
        else if (imposto > 100.0)
            this.imposto = 100.0;
        else
            this.imposto = imposto;
            
    }
    // # Métodos
    public Double calculaSalario(){
        return salarioBase - (salarioBase * (imposto/100));
    }
    // # gets e sets
    
    public int getCodigoSetor() {
        return this.codigoSetor;
    }
    
    public void setCodigoSetor(int codigoSetor) {
         if(codigoSetor<0)
            this.codigoSetor = codigoSetor * -1;
        else 
            this.codigoSetor = codigoSetor;
    }
    public Double getSalarioBase() {
        return this.salarioBase;
    }
    
    public void setSalarioBase(Double salarioBase) {
        if(salarioBase < 100.0)
            this.salarioBase = 100.0;
        else
            this.salarioBase = salarioBase;
    }
    
    public Double getImposto() {
        return this.imposto;
    }
    
    public void setImposto(Double imposto) {
        if(imposto < 0.0)
            this.imposto = 0.0;
        else if (imposto > 100.0)
            this.imposto = 100.0;
        else
            this.imposto = imposto;
    }
    
        public String toString(){
        return 
            super.toString() +
            "\n Código do Setor: " + codigoSetor +
            "\n Salário Base: R$" + salarioBase +
            "\n Imposto: " + imposto + "%";
    }
    
}

