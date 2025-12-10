package Ex1;

public class Pessoa {
    private String nome;

    public Pessoa(String n){
        setNome(n);
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        nome = n;
    }

    public void olaMundo(){
        System.out.println(nome + ", diga Olá Mundo!");
    }
}
