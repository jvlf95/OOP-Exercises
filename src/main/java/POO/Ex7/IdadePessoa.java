package POO.Ex7;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public void verificarIdade(){
        if (this.getIdade() < 18){
            System.out.println("Menor de idade");
        }else{
            System.out.println("Maior de idade");
        }
    }
}
