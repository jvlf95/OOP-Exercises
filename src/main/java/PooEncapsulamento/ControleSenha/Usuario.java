package PooEncapsulamento.ControleSenha;

public class Usuario {
    private String nome;
    private String senha;

    public Usuario(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }

    public void alterarSenha(String senha){
        if(senha.equals(this.senha)){
            this.senha = senha;
        }else{
            System.out.println("A senha informada não é igual a senha atual!");
        }
    }
}
