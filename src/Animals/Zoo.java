package Animals;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    List<Animal> animals;
    public Zoo(){
        animals = new ArrayList<Animal>();
    }
    public  void add( Animal animal){
        animals.add(animal);
    }
    public  void  remove(Animal animal){
        animals.remove(animal);
    }
    public void get(int index){
        animals.get(index);
    }
}
