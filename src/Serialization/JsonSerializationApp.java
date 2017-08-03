package Serialization;

import Animals.Cat;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class JsonSerializationApp {
    public static void main(String[] args) throws Exception {
        //serialization
        Cat cat = new Cat(5, 4, 3.5, "black", "Boris", true);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(cat);
        Writer fileWriter = new FileWriter("cat_BorisJson.txt");
        fileWriter.write(json);
        fileWriter.close();
        //deserialization
        Reader reader = new FileReader("C:\\Users\\Валентина\\IdeaProjects\\Animals\\cat_BorisJson.txt");
        Cat catOut = gson.fromJson(reader, Cat.class);
        System.out.println(catOut.getVoice());
        reader.close();

    }

}
