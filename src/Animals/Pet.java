package Animals;

public class Pet extends  Animal {
    private String name;
    private boolean isVaccinated;
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
    }



