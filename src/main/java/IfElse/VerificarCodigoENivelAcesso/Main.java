package IfElse.VerificarCodigoENivelAcesso;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);


        System.out.println("Informe o código de acesso e nível de permissão numérico");
        System.out.print("Código númerico: ");
        int seuAcesso = tec.nextInt();
        System.out.print("Nível de permissão numérico: ");
        int nivelPermissao = tec.nextInt();

        int acessoCorreto = 2023;
        boolean nivelPermissaoCerto = nivelPermissao >= 1 && nivelPermissao <= 3;

        if(seuAcesso == acessoCorreto && nivelPermissaoCerto){
            System.out.println("Acesso liberado!");
        }else{
            System.out.println("Acesso ou nível de permissão incorretos!");
        }

    }
}
