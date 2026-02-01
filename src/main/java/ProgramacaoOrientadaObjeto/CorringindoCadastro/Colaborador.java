package ProgramacaoOrientadaObjeto.CorringindoCadastro;

public class Colaborador {
    private String nome;
    private String cargo;
    private String nivelAcesso;

    public Colaborador(String nome, String cargo, String nivelAcesso){
        setNome(nome);
        setCargo(cargo);
        setNivelAcesso(nivelAcesso);
    }

    public String getNome(){
        return nome;
    }
    public String getCargo(){
        return cargo;
    }
    public String getNivelAcesso(){
        return nivelAcesso;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public void setNivelAcesso(String nivelAcesso){
        this.nivelAcesso = nivelAcesso;
    }


    public void corrigirCadastro(String cargo, String nivelAcesso){
        setCargo(cargo);
        setNivelAcesso(nivelAcesso);
        System.out.printf("\nColaborador %s, cargo ajustado para %s e nível de acesso para %s", getNome(), cargo, nivelAcesso);
    }

}
