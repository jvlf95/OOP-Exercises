package POO.ControleTemperatura;

public class Temperatura {
    private String local;
    private double temperaturaAtual;

    public Temperatura(String local, double temperaturaAtual){
        setLocal(local);
        setTemperaturaAtual(temperaturaAtual);
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public void exibirInfo(){
        System.out.printf("\nLocal: %s" +
                "\nTemperatura Atual: %.1f", local, temperaturaAtual);

        if(getTemperaturaAtual() > 37.5){
            System.out.printf("\n[ALERTA] %s com temperatura está acima do padrão!", local);
        }
    }
}
