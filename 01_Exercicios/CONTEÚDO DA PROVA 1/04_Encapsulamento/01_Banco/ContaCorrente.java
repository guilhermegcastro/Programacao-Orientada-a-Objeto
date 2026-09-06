/*
 * ContaCorrente.java
 */


public class ContaCorrente {
    
    private String cliente;
    private int numero;
    private int senha;
    private Double saldo;
    
    
    public ContaCorrente(String cliente, int numero){
        this.cliente = cliente;
        this.numero = numero;
        this.saldo = 0.0;
        this.senha = -1;
    }
    
    public String getcliente(){
        return this.cliente;
    }
    
    public void setcliente(String cliente){
        this.cliente = cliente;
    }
    
    public boolean cadastrarSenha(int senha){
        if(senha < 1000 || senha > 9999){
            System.out.println("Senha inválida. Precisa de ser de 4 dígitos!");
            return false;
        }  else if (this.senha != -1){
            System.out.println("Senha já cadastrada! Utilize \"alterarSenha()\" para mudar a senha atual!");
            return false;
        }
        this.senha = senha;
        System.out.println("Senha cadastrada com sucesso!");
        return true;
    }

    public boolean alterarSenha(int senha, int novaSenha){
        if (this.senha < 0) {
            System.out.println("A conta não possui uma senha cadastrada! Utilize o \"cadastrarSenha()\".");
            return false;
        } else if (senha != this.senha){
            System.out.println("A senha antiga  informada não coincide com a senha antiga original!");
            return false;
        } else if (senha == novaSenha){
            System.out.println("A sua nova senha não pode ser igual a senha antiga!");
            return false;
        }
        System.out.println("A senha antiga foi alterada com sucesso!");
        this.senha = novaSenha;
        return true;
    }
    
    public  boolean debitar(int senha, Double valor){
        if (this.senha == -1){
            System.out.println("Senha da conta não cadastrada!");
            return false;
        }
        if (this.senha != senha) {
            System.out.println("A senha inserida está incorreta! Débito negado");
            return false;
        } 
        if(valor < 0.01){
            System.out.println("Valor inserido para debitar é inválido.");
            return false;
        }
        if(this.saldo < valor){
            System.out.println("A conta não possui saldo suficiente.");
            return false;
        }
        this.saldo -= valor;
        System.out.println("Valor de R$" + valor + " debitado da conta! Saldo disponível: R$" + this.saldo);
        return true;
    }

        public  boolean creditar(int senha, Double valor){
        if (this.senha == -1){
            System.out.println("Senha da conta não cadastrada!");
            return false;
        }
        if (this.senha != senha) {
            System.out.println("A senha inserida está incorreta! Credito negado");
            return false;
        } 
        if(valor < 0.01){
            System.out.println("Valor inserido para creditar é inválido.");
            return false;
        }
        if(valor > 1000000){
            System.out.println("Valor inserido é muito elevado para creditar.");
            return false;
        }
        this.saldo += valor;
        System.out.println("Valor de R$" + valor + " creditado da conta! Saldo disponível: R$" + this.saldo);
        return true;
    }

    public String consultaSaldo(int senha){
        if (this.senha == -1){
            return "Senha da conta não cadastrada!";
        }
        if (this.senha != senha) {
            return "\nA senha inserida é inválida!";
            
        } 
        return "\nNº da Conta: " + numero + "\n" +
            "Titular: " + cliente + "\n" +
            "Saldo: R$" + saldo;
        
    }
 
}

