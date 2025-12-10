package Ex5;

public class Aluno {
    private String nome;
    private int idade;
    private double av1;
    private double av2;
    private double media;
    private String situacao;

    public Aluno(String n, int i, double av1, double av2){
        setNome(n);
        setIdade(i);
        setAv1(av1);
        setAv2(av2);
    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public double getAv1(){
        return av1;
    }
    public double getAv2(){
        return av2;
    }
    public double getMedia(){
        return (av1 + av2) / 2;
    }
    public String getSituacao(){
        if (getMedia() <= 5){
            return situacao = "Reprovado";
        }else if(getMedia() < 7){
            return situacao = "Recuperação";
        }else{
            return situacao = "Aprovado";
        }
    }

    public void setNome(String n){
        nome = n;
    }
    public void setIdade(int i){
        idade = i;
    }
    public void setAv1(double a){
        av1 = a;
    }
    public void setAv2(double a){
        av2 = a;
    }
    public void setSituacao(String a){
        situacao = a;
    }

    public void exibirBoletim(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade() + " anos");
        System.out.println("Nota AV1: " + getAv1());
        System.out.println("Nota: AV2: " + getAv2());
        System.out.println("Média: " + getMedia());
        System.out.println("Situação: " + getSituacao());
    }


}
