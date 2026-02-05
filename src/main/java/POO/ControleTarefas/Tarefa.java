package POO.ControleTarefas;

public class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao, boolean concluida){
        setDescricao(descricao);
        setConcluida(concluida);
    }


    public String getDescricao(){
        return descricao;
    }
    public boolean getConcluida(){
        return concluida;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setConcluida(boolean concluida){
        this.concluida = concluida;
    }

}
