package Observers;
import Animals.Animal;
import Observable.Observer;

public class Keeper implements Observer{
    @Override
    public void handle(Object o) {
        Animal animal = (Animal)o;
        animal.feed();
        System.out.println("Keeper: You are not fed.");
    }
}
