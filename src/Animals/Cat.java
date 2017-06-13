package Animals;


public class Cat extends  Pet implements Purrable {
    public Cat(int id,  int age, double weight, String color, String name, boolean isVaccinated){
        super(id, age, weight, color, name, isVaccinated);
    }
    @Override
    public String getVoice(){
        return  super.getVoice()+ "Meow!";
    }

    @Override
    public void purr() {
        System.out.println("Mrrmrrmrr");
    }
}
