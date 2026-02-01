package ProgramacaoOrientadaObjeto.POO.Ex16;

public class Main {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calc = new CalculadoraSalaRetangular();

        calc.setAltura(15.5);
        calc.setLargura(20);
        System.out.println("Área do retângulo: " + calc.calcularArea());
        System.out.println("Perímetro do retângulo: " + calc.calcularPerimetro());
    }
}
