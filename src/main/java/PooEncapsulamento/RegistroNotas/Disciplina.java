package PooEncapsulamento.RegistroNotas;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private List<Double> notas = new ArrayList<>();
    private int notasValidas;
    private double somaNotasValidas;
    private int notasInvalidas;

    public Disciplina(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public int getNotasValidas() {
        return notasValidas;
    }

    public void adicionarNota(double nota){
            if(nota < 0 || nota > 10){
                notasInvalidas++;
            }else{
                notasValidas++;
                somaNotasValidas += nota;
            }
        notas.add(nota);
    }

    public double mediaNotas(){
        return (somaNotasValidas / notasValidas);
    }

    public void exibirDisciplina(){
        for(int i = 0; i < notas.size(); i++){
            if(notas.get(i) < 0 || notas.get(i) > 10){
                System.out.println("Nota ignorada: " + notas.get(i));
            }
        }
        System.out.println("Notas válidas: " + getNotasValidas());
        System.out.printf("Média das notas válidas: %.2f", mediaNotas());
    }
}
