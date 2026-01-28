package POO.Ex18;

public class Main {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao temp1 = new ConversorTemperaturaPadrao();

        temp1.setTemperatura(30);
        System.out.println(temp1.getTemperatura() + "°C representa " + temp1.celsiusParaFahrenheit() + " Fahrenheit");
        System.out.printf(temp1.getTemperatura() + "°F representa %.2f Celsius" , temp1.fahrenheitParaCelsius());

    }
}
