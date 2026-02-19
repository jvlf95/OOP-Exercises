package PooHerancaPolimorfismoInterface.ImplementandoInterface;

public class Main {
    public static void main(String []args){
        Relatorio relatorio = new Relatorio("Balanço Contábil", "O balanço contábil do " +
                "mês de Janeiro foi positivo e conseguimos guardar mais do que gastar");

        relatorio.imprimir();
    }
}
