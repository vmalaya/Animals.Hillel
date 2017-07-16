package Animals;


import Observers.Director;
import Observers.Doctor;
import Observers.Hairdresser;

public class Main {
    public  static  Dog dog;
    public  static Animal[] init(){
        Animal[] animals = new Animal[8];
        Cat cat = new Cat(1, 2, 3, "black", "Sinus", true);
        animals[0] = cat;
        Fish fish = new Fish(2, 1, 4.6, "gold", "Ribka", false);
        animals[1] = fish;
        dog = new Dog(3, 5, 45, "Red", "Pluto", true);
        animals[2] = dog;
        Leon leon = new Leon(1, 8, 50, "Red", true  );
        animals[3] = leon;
        Wolf wolf = new Wolf(4, 3, 20, "White", true);
        animals[4] = wolf;
        Giraffe giraffe = new Giraffe(5, 5, 43, "Yellow", false);
        animals[5] = giraffe;
        Hamster hamster = new Hamster( 7, 1, 0.2, "Brown", "Tau", false);
        animals[6] = hamster;
        GuideDog guideDog = new GuideDog(8, 11, 32, "Black", "Balzac", true, true);
        animals[7] = guideDog;
        return animals;
    }
    public static void main(String[] arg) {
        Animal[] zoo = init();
        Doctor doctor = new Doctor();
        Hairdresser hairdresser = new Hairdresser();
        Director director = new Director();
        dog.addObserver(doctor);
        dog.addObserver(hairdresser);
        dog.addObserver(director);
        dog.sick();
        dog.setLongHair();
        System.out.println(dog.isSick());

      /*  for (Animal animal: zoo) {
            String phrase = animal.getVoice();
            System.out.println(phrase);
            
        }
        System.out.println("----------------------------");
        Cat cat = new Cat(1, 2, 3, "black", "Sinus", true);
        Leon simba = new Leon(1, 8, 50, "Red", true  );
        Purrable[] purrables = new Purrable[2];
        purrables[0]=cat;
        purrables[1]=simba;
        for (Purrable animal: purrables) {
            animal.purr();
        }*/



    }
}
