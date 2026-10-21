//~ Agenda
//~ – nomeDaAgenda: String
//~ – contatos: Pessoa[]
//~ – totalContatos: int
//~ + Agenda(nomeDaAgenda: String, tamanho: int)
//~ + adicionaPessoa(pessoa: Pessoa): boolean
//~ + removePessoa(pessoa: Pessoa): boolean
//~ + alteraInformacoes(pessoa: Pessoa): boolean
//~ + buscaPessoas(): Pessoa[]
//~ + buscaContato(nome: String): Pessoa

//~ O construtor da classe recebe o nome da agenda e o tamanho do vetor como parâmetros.

//~ O método adicionaPessoa(Pessoa pessoa) acrescenta um pessoa ao vetor.
//~ O método removePessoa(Pessoa pessoa) que remove uma pessoa do vetor.
//~ O método alteraInformacoes(Pessoa pessoa), altera as informações em um contato.
//~ O método buscaContato(nome) retorna o contato que corresponde a busca ou null caso não
//~ encontre.
//~ O método buscaPessoas() retorna o vetor de pessoas cadastrado na agenda.

public class Agenda {
    private String nomeDaAgenda;
    private Pessoa[] contatos;
    private int totalContatos;
    
    
    public Agenda(String nomeDaAgenda, int tamanho){
        this.nomeDaAgenda = nomeDaAgenda;
        contatos = new Pessoa[tamanho];
        totalContatos = 0;
    }
    
    public boolean adicionaPessoa(Pessoa pessoa){
        if (totalContatos >= contatos.length)
            return false;
        contatos[totalContatos++] = pessoa;
        return true;
    }
    
    public boolean removePessoa(Pessoa pessoa){
        for (int i = 0; i < totalContatos; i++) {
            if(contatos[i].getNome().equals(pessoa.getNome())){
                for (int j = i+1; j < totalContatos; j++) {
                    contatos[j-1] = contatos[j];
                }
                contatos[--totalContatos] = null;
                return true;
            }
        }
        return false;
    }
    
    public boolean alteraInformacoes(Pessoa pessoa){
        for (int i = 0; i < totalContatos; i++) {
            if(contatos[i].getNome().equals(pessoa.getNome())) {
                contatos[i] = pessoa;
                return true;
            }
        }
        return false;
    }
    
    public Pessoa[] buscaPessoas(){
        Pessoa[] lista = new Pessoa[totalContatos];
       for (int i = 0; i < totalContatos; i++) {
           Pessoa original = contatos[i];
            lista[i] = new Pessoa(original.getNome(), original.getDiaDeNascimento(), original.getMesDeNascimento(), original.getTelefone());
        }
        return lista;
       
    }
    
    public Pessoa buscaContato(String nome){
        for (int i = 0; i < totalContatos; i++) {
            if(contatos[i].getNome().equals(nome)) {
                return new Pessoa(contatos[i].getNome(), contatos[i].getDiaDeNascimento(), contatos[i].getMesDeNascimento(), contatos[i].getTelefone());
            }
        }
        return null;
    }
    
    
    public String getNomeDaAgenda(){
        return this.nomeDaAgenda;
    }
    
    public Pessoa[] getContatos(){
        return this.contatos;
    }
    public int getTotalContatos(){
        return this.totalContatos;
    }


}

