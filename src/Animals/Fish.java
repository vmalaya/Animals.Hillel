package Animals;


public class Fish extends Pet {
    public Fish(int id,  int age, double weight, String color, String name, boolean isVaccinated){
        super(id, age, weight, color, name, isVaccinated);

    }
    @Override
    public String getVoice(){
        return "...";
    }

}
