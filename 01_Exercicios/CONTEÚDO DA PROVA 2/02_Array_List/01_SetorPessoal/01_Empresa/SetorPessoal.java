//~ Exercício de POO

//~ SetorPessoal
//~ Funcionarios[] : Funcionario[]
//~ + adicionarFuncionario(funcionario: Funcionario): boolean
//~ + removerFuncionario(funcionario: Funcionario): boolean
//~ + buscarFuncionario(matricula: int): Funcionario
//~ + buscarFuncionario(nome: String): Funcionario
//~ + listarFuncionarios(departamento: int): Funcionario[]
//~ + listarFuncionarios(funcao: String): Funcionario[]
//~ + listarFuncionarios(): Funcionario[]

//~ O tamanho do vetor deve ser informado no construtor da classe. Não permita a inclusão de funcionários com nomes ou matrículas repetidos.
//~ O método adicionarFuncionario() adiciona um funcionário ao vetor e retorna “true” ou “false” informando se o funcionário foi adicionado com sucesso.
//~ O método removerFuncionario() remove um funcionário do vetor e retorna “true” ou “false”
//~ informando se o funcionário foi removido com sucesso.
//~ Os métodos buscarFuncionario() procuram e retornam um funcionário do vetor.
//~ Os métodos listarFuncionarios() retornam um vetor com a lista de todos os funcionários ou
//~ dos funcionários que atendam aos filtros.

public class SetorPessoal {
    
    private Funcionario[] funcionarios;
    private int contador; 
    
    public SetorPessoal(int quantidade){
        funcionarios = new Funcionario[quantidade];
        contador = 0; 
    }

    public boolean adicionarFuncionario(Funcionario f){
        
        if(contador >= funcionarios.length)
            return false;
        
        for(int i = 0; i < this.contador; i++ ){
            if(funcionarios[i].getMatricula() == f.getMatricula() || funcionarios[i].getNome().equals(f.getNome()))
                return false;
        }
        
        funcionarios[contador++] = f;
        return true;
        
        
    }
    
    public boolean removerFuncionario(Funcionario f){
        for (int i = 0; i < contador; i++) {
            if(f.getMatricula() == funcionarios[i].getMatricula()){
                for (int j = i+1; j < contador; j++) {
                    funcionarios[j-1] = funcionarios[j];
                }
                funcionarios[contador--] = null;
                return true;
            }
        }
        return false;
    }
    
    public Funcionario buscarFuncionario(int matricula){
        for (int i = 0; i < contador; i++) {
            if(funcionarios[i].getMatricula() == matricula)
                return funcionarios[i];
        }
        return null;
    }
    
    public Funcionario buscarFuncionario(String nome){
            for (int i = 0; i < contador; i++) {
            if(funcionarios[i].getNome().equals(nome))
                return funcionarios[i];
        }
        return null;
    }
    
    public Funcionario[] listarFuncionarios(int departamento){
        
        int contD=0;
        for (int i = 0; i < contador; i++) {
            if(funcionarios[i].getDepartamento() == departamento)
               contD++; 
        }
        
        Funcionario[] listaD = new Funcionario[contD];
        int j = 0;
        for (int i = 0; i < contador; i++) {
            if (funcionarios[i].getDepartamento() == departamento)
                listaD[j++] = funcionarios[i];
        }
        
        return listaD;
    }
    
    public Funcionario[] listarFuncionarios(String funcao){
    
        int contF=0;
        for (int i = 0; i < contador; i++) {
            if(funcionarios[i].getFuncao().equals(funcao))
               contF++; 
        }
        
        Funcionario[] listaF = new Funcionario[contF];
        int j = 0;
        for (int i = 0; i < contador; i++) {
            if (funcionarios[i].getFuncao().equals(funcao)) 
                listaF[j++] = funcionarios[i];
        }
        
        return listaF;
        
    }
    
    public Funcionario[] listarFuncionarios(){
        Funcionario[] lista = new Funcionario[contador];
        for (int i = 0; i < contador; i++) 
            lista[i] = funcionarios[i];
        return lista;
    }
    
    public String dadosFuncionario(String nome){
        for (int i = 0; i < contador; i++) {
            if(funcionarios[i].getNome().equals(nome)) {
                return 
                    "\nMatrícula: " + funcionarios[i].getMatricula() +
                    "\nNome: " + funcionarios[i].getNome() +
                    "\nDepartamento: " + funcionarios[i].getDepartamento() +
                    "\nSalário: " + funcionarios[i].getSalario() + 
                    "\nFunção: " +  funcionarios[i].getFuncao();
            }
        }
        return "Funcionário \"" + nome + "\" não encontrado.";
    }
    
    public String dadosFuncionario(int matricula){
        for (int i = 0; i < contador; i++) {
            if(funcionarios[i].getMatricula() == matricula) {
                return 
                    "\nMatrícula: " + funcionarios[i].getMatricula() +
                    "\nNome: " + funcionarios[i].getNome() +
                    "\nDepartamento: " + funcionarios[i].getDepartamento() +
                    "\nSalário: " + funcionarios[i].getSalario() + 
                    "\nFunção: " +  funcionarios[i].getFuncao();
            }
        }
        return "Matrícula " + matricula + " não encontrada.";
    }
    
    public Double calculoFolha(){
        Double valor = 0.0;
        for (int i = 0; i < contador; i++) {
            valor+= funcionarios[i].getSalario();
        }
        return valor;
    }
    
    public Double calculoFolha(int departamento){
        Double valor = 0.0;
        for (int i = 0; i < contador; i++) {
            if (funcionarios[i].getDepartamento() == departamento) {
                valor+= funcionarios[i].getSalario();
            }
        }
        return valor;
    }
    

    
    

    
}
