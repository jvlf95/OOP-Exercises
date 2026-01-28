package POO.Ex28;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        try{
            File file = new File("C:\\Arquivo.txt");
            Scanner scan = new Scanner(file);

            while(scan.hasNextLine()){
                String line = scan.nextLine();
                System.out.println(line);
            }
            scan.close();
        }catch(FileNotFoundException e){
            System.out.println("[ERROR] " + e);
        }

    }
}
