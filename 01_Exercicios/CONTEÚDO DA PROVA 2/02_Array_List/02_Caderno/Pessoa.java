//~ Exercícios de POO

//~ Crie as seguintes classes:

//~ Pessoa

//~ – nome: String
//~ – diaDeNascimento: int
//~ – mesDeNascimento: int
//~ – telefone: String
//~ + Pessoa(nome: String, diaDeNascimento: int, mesDeNascimento: int, telefone: String)
//~ + Pessoa(nome: String)
//~ O atributos não passados por parâmetros devem ser inicializados com 0 (inteiros) ou “Indefinido”
//~ (Strings). Não esqueça do encapsulamento.


public class Pessoa {
	
    private String nome;
    private int diaDeNascimento;
    private int mesDeNascimento;
    private String telefone;
    
    public Pessoa(String nome, int diaDeNascimento, int mesDeNascimento, String telefone){
        this.nome = nome;
        this.diaDeNascimento = diaDeNascimento;
        this.mesDeNascimento = mesDeNascimento;
        this.telefone = telefone;
    }
    public Pessoa(String nome){
        this.nome = nome;
        this.diaDeNascimento = 0;
        this.mesDeNascimento = 0;
        this.telefone = "indefinido";
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getDiaDeNascimento() {
        return this.diaDeNascimento;
    }
    
    public void setDiaDeNascimento(int diaDeNascimento) {
        this.diaDeNascimento = diaDeNascimento;
    }

        public int getMesDeNascimento() {
        return this.mesDeNascimento;
    }
    
    public void setMesDeNascimento(int mesDeNascimento) {
        this.mesDeNascimento = mesDeNascimento;
    }
    
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String toString(){
        return  "\n\n Nome do contato: "  + nome + 
        "\n Data de Nascimento: " + diaDeNascimento + "/" + mesDeNascimento +
        "\n Telefone: " + telefone;
    }

}

