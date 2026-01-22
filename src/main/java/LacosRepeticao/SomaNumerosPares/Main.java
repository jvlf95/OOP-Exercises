package LacosRepeticao.SomaNumerosPares;

public class Main {
    public static void main(String[]args){

        int somaPares = 0;

        for(int i = 1; i <= 100; i++){
            if(i % 2 ==0){
                somaPares += i;
            }
        }

        System.out.println("Soma total dos número pares de 1 à 100: " + somaPares);
    }
}
