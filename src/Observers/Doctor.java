package Observers;
import Animals.Animal;
import Observable.Observer;

public class Doctor implements Observer {
    @Override
    public void handle(Object o ) {
        Animal animal = (Animal) o;
        if(animal.isSick()){
            animal.healed();
            System.out.println("Doctor: You are healed");
        }
        if(animal.isHungry()){
            animal.feed();
            System.out.println("Doctor: You are fed.");
        }
    }
}
