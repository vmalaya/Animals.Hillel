package Serialization;

import Animals.Cat;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

/**
 *    Serialization was done by using library "Gson"
 */
public class JsonSerializationApp {
    public static void main(String[] args) throws Exception {
        //serialization
        Cat cat = new Cat(5, 4, 3.5, "black", "Boris", true);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(cat);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("cat_BorisJson.txt"));
        bufferedWriter.write(json);
        bufferedWriter.close();
        //deserialization
        Reader reader = new FileReader("C:\\Users\\Валентина\\IdeaProjects\\Animals\\cat_BorisJson.txt");
        Cat catOut = gson.fromJson(reader, Cat.class);
        System.out.println(catOut.getVoice());
        reader.close();

    }

}
