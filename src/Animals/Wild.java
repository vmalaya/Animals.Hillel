package Animals;

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


}
