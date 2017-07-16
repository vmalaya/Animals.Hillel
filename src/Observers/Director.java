package Observers;
import Animals.Animal;
import Animals.Pet;
import Observable.Observer;


public class Director implements Observer {
    @Override
    public void handle(Object o) {
        Animal animal = (Animal) o;
        Pet pet = (Pet)o;
        if(animal.isSick()){
            animal.healed();
            System.out.println("Director: You are healed.");
        }
        if(animal.isHungry()){
            animal.feed();
            System.out.println("Director: You are fed.");
        }
        if(pet.isLongHair()){
            pet.cutHair();
            System.out.println("Director: Your hair is OK.");
        }
    }
}
