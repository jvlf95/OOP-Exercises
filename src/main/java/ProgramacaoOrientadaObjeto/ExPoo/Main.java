package ProgramacaoOrientadaObjeto.ExPoo;

public class Main {
    public static void main(String[]args){
        Funcionario func1 = new Funcionario("João", "Técnico de Suporte TI", 2300);
        Funcionario func2 = new Funcionario("Lavínia", "Estagiária", 1800);

        func1.exibirInfo();
        System.out.println("");
        func2.exibirInfo();


    }
}
