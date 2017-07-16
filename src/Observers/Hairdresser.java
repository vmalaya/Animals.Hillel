package Observers;
import Animals.Pet;
import Observable.Observer;

public class Hairdresser implements Observer{
    @Override
    public void handle(Object o) {
        Pet pet = (Pet) o;
        if(pet.isLongHair()) {
            pet.cutHair();
            System.out.println("Hairdresser: Your hair is OK");
        }
    }
}
