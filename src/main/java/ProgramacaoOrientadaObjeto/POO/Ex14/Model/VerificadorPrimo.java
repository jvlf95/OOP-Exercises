package ProgramacaoOrientadaObjeto.POO.Ex14.Model;

public class VerificadorPrimo extends NumerosPrimos {

    public void ehPrimo(int numero){
        if (verificarPrimalidade(numero)){
            System.out.println(numero + " é primo!");
        }else{
            System.out.println(numero + " não é primo!");
        }

    }
}
