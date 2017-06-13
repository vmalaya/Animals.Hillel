package Animals;


public class Leon extends Wild implements Purrable {
    public Leon(int id, int age, double weight, String color, boolean isPredator){
        super(id, age, weight, color, isPredator);
    }
    @Override
    public void purr(){
        System.out.println("Roar");
    }
}
