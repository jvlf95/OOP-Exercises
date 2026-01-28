package POO.Ex30;

import POO.Ex30.Model.Title;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[]args){
        Title t1 = new Title("Avatar", 160, 2009);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(t1);
        System.out.println(json);
        try {
            File file = new File("Archive.json");
            FileWriter writer = new FileWriter(file);
            writer.write(json);
            writer.close();
        }catch(IOException e){
            System.out.println("[ERROR]");
        }

    }
}
