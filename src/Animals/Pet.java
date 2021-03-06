package Animals;

import Observable.Observer;
import java.util.Date;

public class Pet extends  Animal {
    private String name;
    private boolean isVaccinated;
    private boolean isLongHair;
    Date date = new Date();

    public Pet(int id,  int age, double weight, String color, String name, boolean isVaccinated){
        super(id, age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }
    public Pet(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    @Override
    public String getVoice(){
        String introduction = "Hello, my name is " + getName()+". ";
        return introduction;

    }
    public  String getName(){
        return  name;
    }
    public  boolean getVaccinated(){
        return isVaccinated;
        }
    public  void sick(){
        super.sick();
        System.out.println(" I am "+ name + ". My id - "+ getId() +
                ", I am sick. "+"( "+ date.toString()+ " )");
        notifyObservers();
    }
    public void hungry(){
        super.hungry();
        System.out.println(" I am "+ name + ". My id - "+ getId() +
                ", I am hungry. "+"( "+ date.toString()+ " )");
        notifyObservers();

    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);

    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public boolean isLongHair() {
        return isLongHair;
    }

    public void setLongHair() {
        isLongHair = true;
        System.out.println(" I am "+ name + ". My id - "+ getId() +
                ", I need cutting hair. "+"( "+ date.toString()+ " )");
        notifyObservers();
    }
    public void cutHair() {
        isLongHair = false;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", isVaccinated=" + isVaccinated +
                '}';
    }
}



