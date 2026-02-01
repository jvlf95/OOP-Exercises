package ProgramacaoOrientadaObjeto.POO.Ex17;

public class TabuadaMultiplicacao implements Tabuada{
    private int numero;

    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }

    @Override
    public void mostrarTabuada() {
        for (int i = 0; i <= 10; i++){
            System.out.println(i + " x " + getNumero() + " = " + i * getNumero());
        }

    }
}
