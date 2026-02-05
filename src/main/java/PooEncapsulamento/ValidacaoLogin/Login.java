package PooEncapsulamento.ValidacaoLogin;

public class Login {
    private String usuario;
    private String senha;

    public Login(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario(){
        return usuario;
    }
    public String getSenha(){
        return senha;
    }

    public boolean validarLogin(String usuario, String senha){
        if(!usuario.equals(this.usuario) && !senha.equals(this.senha)){
            System.out.println("Usário e/ou senha inválidos!");
            return false;
        }else{
            System.out.println("Acesso liberado");
            return true;
        }
    }
}
