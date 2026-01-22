
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String []args) throws IOException {
        Scanner tec = new Scanner(System.in);

        FileWriter writer = new FileWriter("C:\\Users\\joaov\\Desktop\\File.txt");
        System.out.println("Escreva algo no arquivo: ");
        String texto = tec.nextLine();
        writer.write(texto);
        writer.close();
    }
}
