package Animals;


public class GuideDog extends Pet {
    private  boolean isTrained;

    public GuideDog(int id,  int age, double weight, String color,
                    String name, boolean isVaccinated, boolean isTrained){
        super(id, age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }

    @Override
    public String getVoice(){
        String intro;
        if(isTrained){
        intro = "I can take you home.";
        } else {
            intro = "";
        }
        return  super.getVoice()+ intro;
    }
    public void TakeHome(){
        System.out.println("I took you home.");
    }

}
