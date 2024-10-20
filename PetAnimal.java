import java.util.ArrayList;
import java.util.HashMap;

public abstract class PetAnimal extends Animal{

    public PetAnimal(String name, int age){
        super(name, age);
         InitSpeciesList();
       }
    
    private ArrayList<String> species = new ArrayList<>();
    public HashMap<String,String> commands = new HashMap<>();

    public abstract void InitCommandsList();


    private void InitSpeciesList()
    {
        this.species.add("Cats");
        this.species.add("Dogs");
        this.species.add("Hamsters");
    }
    
    public void ShowAllCommands(){
        System.out.println(commands.keySet());
    }

    public ArrayList<String> getSpecies(){
         return this.species;
    }

    public void addSpecie(String newSpecie){
        this.species.add(newSpecie);
    }

    
}
