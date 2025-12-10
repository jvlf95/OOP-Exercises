package Ex15;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda moeda = new ConversorMoeda();

        moeda.setValor(150.00);
        System.out.printf(moeda.getValor() + " em dólares $%.2f", moeda.converterRealParaDolar());
        System.out.println("\n" + moeda.getValor() + " em reais R$" + moeda.converterDolarParaReal());
    }
}
