package Serialization;

import Animals.Cat;
import Animals.Pet;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
* Serialization was done by using library "OpenCSV"
*/
public class CSV_SerializationApp {
    public static void main(String[] args) throws IOException{
        //serialization
        Cat cat = new Cat(5, 4, 3.5, "black", "Boris", true );
        CSVWriter csvWriter = new CSVWriter(new FileWriter("cat_BorisCSV.csv"), ',');
        String[] list = parseObjectToStringArray(cat);
        csvWriter.writeNext(list);
        csvWriter.close();

        //deserialization

        CSVReader csvReader = new CSVReader(new FileReader("cat_BorisCSV.csv"), ',');
        Pet pet = new Pet();
        String[] strings = csvReader.readNext();
        pet.setId(Integer.parseInt(strings[0]));
        pet.setAge(Integer.parseInt(strings[1]));
        pet.setWeight(Double.parseDouble(strings[2]));
        pet.setColor(strings[3]);
        pet.setName(strings[4]);
        pet.setVaccinated(parseStringToBoolean(strings[5]));
        csvReader.close();
        System.out.println(pet);


    }
    private  static String[] parseObjectToStringArray(Pet pet){
        String idString =  pet.getId()+"";
        String ageString =  pet.getAge() + "";
        String weightString = pet.getWeight() + "";
        String isVaccinated = parseBooleanToString(pet.getVaccinated());
        String[] strings =  new String[] {idString, ageString, weightString,pet.getColor(), pet.getName(), isVaccinated };
        return  strings;
    }
    private static String parseBooleanToString(Boolean flag){
        return flag ? "Yes" : "No";
    }
    private static Boolean parseStringToBoolean(String string){
        Boolean flag = false;
        switch (string){
            case "Yes": flag = true;
            break;
            case "No": flag =  false;
            break;
        }
        return  flag;
    }
}
