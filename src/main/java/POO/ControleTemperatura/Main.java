package POO.ControleTemperatura;

public class Main {
    public static void main(String []args){
        Temperatura temp1 = new Temperatura("Estufa 1", 25.5);
        Temperatura temp2 = new Temperatura("Estufa 2", 30);
        Temperatura temp3 = new Temperatura("Estufa 3", 40);

        temp1.exibirInfo();
        temp2.exibirInfo();
        temp3.exibirInfo();
    }
}
