package Ex3;

public class Main {
    public static void main(String[] args) {
        Musica m1 = new Musica("Love", "João", 2025);

        //m1.exibirFichaTec();
        m1.avaliarMusica(6.8);
        m1.avaliarMusica(9.5);
        m1.avaliarMusica(7.6);
        m1.avaliarMusica(10.0);
        m1.avaliarMusica(5.4);
        m1.getMediaAvaliacao();
        m1.exibirFichaTec();
    }
}
