package Serialization;

import Animals.Animal;
import Animals.Cat;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BinarySerializationApp {
    public static void main(String[] args) throws Exception {
        //Serialization
        Cat cat = new Cat(5, 4, 3.5, "black", "Boris", true );
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("cat_Boris.txt"));
        out.writeObject(cat);
        out.close();

        //Deserialization
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("cat_Boris.txt"));
        Cat outOb = (Cat) in.readObject();
        System.out.println(outOb.getVoice());

    }
}
