package POO.Ex14.Model;

public class NumerosPrimos {
    
    public boolean verificarPrimalidade(int numero){
        if (numero % 2 == 0 && numero != 2){
            return false;
        }else if (numero % 5 == 0 && numero != 5){
            return false;
        }else if (numero % 3 == 0 && numero != 3){
            return false;
        }else if (numero <= 1){
            return false;
        }else{
            return true;
        }
    }
    

    public void listarPrimos(){
        for (int i = 0; i <= 20; i++){
            if (i % 2 == 0 && i != 2){
                System.out.println(i + " não é primo!");
            }else if (i % 3 == 0 && i != 3){
                System.out.println(i + " não é primo!");
            }else{
                System.out.println(i + " é primo!");
            }
        }
    }


}
