package Ex16;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    private double altura;
    private double largura;

    public double getAltura(){
        return altura;
    }

    public double getLargura(){
        return largura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }

    @Override
    public double calcularPerimetro() {
        return altura * 2 + largura * 2;
    }
}
