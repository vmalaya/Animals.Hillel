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
    @Override
    public String getVoice(){
        String introduction = "Hello, my name is " + getName()+". ";
        return introduction;

    }
    public  String getName(){
        return  name;
    }
    public  String getVaccinated(){
        String result;
        if(isVaccinated){
            result = "Is Vaccinated";
        } else {
            result = " Is not vaccinated";
        }
        return result;
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

}



