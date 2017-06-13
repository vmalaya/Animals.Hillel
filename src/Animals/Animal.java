package Animals;

public abstract class Animal {
    private int id;
    private int age;
    private  double weight;
    private String color;
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




}
