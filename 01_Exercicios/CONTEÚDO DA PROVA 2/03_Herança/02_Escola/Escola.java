public class Escola {
	
	public static void main (String[] args) {
		
        Aluno aluno1 = new Aluno("Maria", "123456789-19", "123456789", "123321","Sistemas de Informaçao", 10.0, 8.0);
        Aluno aluno2 = new Aluno("Guilherme", "123456789-19", "123456789", "123321","Sistemas de Informaçao", 5.0, 6.0);
        Professor professor1 = new Professor("Paulo", "987654321-91", "987654321", "Programação Orientada a Objetos", 175.9, 120);
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(professor1);
        
	}
}

