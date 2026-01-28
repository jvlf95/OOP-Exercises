package POO.Ex29;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String []args){
        try {
            File file = new File("Arquivo.txt");
            FileWriter write = new FileWriter(file);
            write.write("Nova mensagem");
            write.close();
        }catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
