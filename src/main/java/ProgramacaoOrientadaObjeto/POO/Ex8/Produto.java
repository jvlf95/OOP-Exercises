package ProgramacaoOrientadaObjeto.POO.Ex8;

public class Produto {
    private String nome;
    private double preco;

    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public void aplicarDesconto(double valor){
        preco *= (valor / 100);
        System.out.println("Novo valor com desconto: R$" + getPreco());
    }
}
