package Animals;
import Observable.Observable;
import Observable.Observer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements Observable, Serializable {
    private int id;
    private int age;
    private  double weight;
    private String color;
    private boolean isSick;
    private boolean isHungry;
    List<Observer> observers = new ArrayList<>();
    public  Animal(int id, int age, double weight, String color){
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;

    }
    public abstract String getVoice();

    public int getId(){ return id; }
    public int getAge(){ return age;}
    public double getWeight(){ return  weight;}
    public String getColor(){ return color;}

    public boolean isSick() {
        return isSick;
    }

    public void sick() {
        isSick = true;
    }
    public void healed(){
        isSick = false;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void hungry() {
        isHungry = true;
    }

    public void feed() {
        isHungry = false;
    }
    public void notifyObservers(){
        for (Observer observer: observers) {
            observer.handle(this);
        }
    }
}
