package Serialization;


import Animals.Cat;
import Animals.Pet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

   public class MyCSV_SerializationApp {
    private static final String CSV_SEPARATOR = ",";
    public static void main(String[] args) throws IOException {
        Cat cat = new Cat(5, 4, 3.5, "black", "Boris", true );
        parseToCSV(cat, new String("cat_BorisCSV"));

    }
    private static void parseToCSV(Pet pet, String fileName) throws IOException{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(pet.getId() < 0 ? "" : pet.getId());
        stringBuffer.append(CSV_SEPARATOR);
        stringBuffer.append(pet.getAge() <= 0 ? "" : pet.getAge());
        stringBuffer.append(CSV_SEPARATOR);
        stringBuffer.append(pet.getWeight() <= 0 ? "" : pet.getWeight());
        stringBuffer.append(CSV_SEPARATOR);
        stringBuffer.append(pet.getColor() == null ? "" : pet.getColor());
        stringBuffer.append(CSV_SEPARATOR);
        stringBuffer.append(pet.getName() == null ? "" : pet.getName());
        stringBuffer.append(CSV_SEPARATOR);
        stringBuffer.append(pet.getVaccinated() ? "Yes" : "No");
        bufferedWriter.write(stringBuffer.toString());
        bufferedWriter.newLine();
        bufferedWriter.close();



    }
}
