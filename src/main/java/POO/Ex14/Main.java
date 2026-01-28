package POO.Ex14;

import POO.Ex14.Model.GeradorPrimo;
import POO.Ex14.Model.NumerosPrimos;
import POO.Ex14.Model.VerificadorPrimo;

public class Main {
    public static void main(String[] args) {
        VerificadorPrimo n1 = new VerificadorPrimo();
        NumerosPrimos n2 = new NumerosPrimos();
        GeradorPrimo n3 = new GeradorPrimo();

        n1.ehPrimo(1);
        System.out.println(n3.gerarProximoPrimo(7));

    }
}
