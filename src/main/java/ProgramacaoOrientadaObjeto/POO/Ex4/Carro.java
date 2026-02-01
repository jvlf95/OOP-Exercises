package ProgramacaoOrientadaObjeto.POO.Ex4;

public class Carro {
    private String modelo;
    private int ano;
    private String cor;
    private int idade;

    public Carro(String m, int a, String c){
        setModelo(m);
        setAno(a);
        setCor(c);
    }

    public String getModelo(){
        return modelo;
    }
    public int getAno(){
        return ano;
    }
    public String getCor(){
        return cor;
    }

    public void setModelo(String m){
        modelo = m;
    }
    public void setAno(int a){
        ano = a;
    }
    public void setCor(String c){
        cor = c;
    }

    public void exibirFichaTec(){
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de lançamento: " + getAno());
        System.out.println("Cor: " + getCor());
        System.out.println("Idade: " + getIdade() + " anos");
    }

    public int getIdade(){
        return (2025 - getAno());
    }


}
