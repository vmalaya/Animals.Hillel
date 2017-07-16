package Animals;

import Observable.Observer;
import java.util.Date;


public class Wild extends  Animal {
    boolean isPredator;
    public Wild(int id, int age, double weight, String color, boolean isPredator){
        super(id, age, weight, color);
        this.isPredator = isPredator;

    }
    @Override
    public String getVoice(){
        String intro;
        if(isPredator){
            intro = "I am angry.";
        } else {
            intro = "";
        }
        return  "Hello, I am wild animal. "+ intro;
    }

    Date date = new Date();
    public  void sick(){
        super.sick();
        System.out.println(this.getVoice() + " My id - "+ getId() + " and I am sick."+"( "+ date.toString()+ " )");
        notifyObservers();
    }
    public void hungry() {
        super.hungry();
        System.out.println(this.getVoice() + " My id - "+ getId() + " and I am hungry."+"( "+ date.toString()+ " )");
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

}
