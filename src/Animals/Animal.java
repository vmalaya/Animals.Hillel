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

    public Animal() {
    }

    public abstract String getVoice();

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

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

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
