package LacosRepeticao.EncontrarMaiorNumero;

public class Main {
    public static void main(String []args){
        int[] numeros = {2, 5, 9, 1, 55, 10, 36, 47};

        int maiorNumero = numeros[0];

        for(int i = 0; i < numeros.length; i++){
            if(maiorNumero < numeros[i]){
                maiorNumero = numeros[i];
            }
        }

        System.out.println("O maior número é " + maiorNumero);
    }
}
