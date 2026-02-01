package ProgramacaoOrientadaObjeto.CalculandoNotas;

public class Professor {
    private String usuario;
    private String senha;

    public Professor(String usuario, String senha){
        setUsuario(usuario);
        setSenha(senha);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean validarAcesso(String usuario, String senha){
        if(this.usuario.equals(usuario) && this.senha.equals(senha)){
            System.out.println("Acesso liberado!");
            return true;
        }
        System.out.println("Acesso negado");
        return false;

    }
}
