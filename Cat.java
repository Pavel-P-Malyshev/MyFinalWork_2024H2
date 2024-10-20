//import java.util.ArrayList;
//import java.util.HashMap;



public class Cat extends PetAnimal{

    public Cat(String name, int age){
        super(name, age);
        this.InitCommandsList();
       }
    
      @Override
      public String ShowSpecie(){
          return "Cat";
      }

      @Override
      public String makeCommand(String commandName)
      {
               
        
        if ( super.commands.containsKey(commandName))
        {
          return super.commands.get(commandName);
        }

        return this.getName()+"unknown command, learn cat to do this";

      }


      @Override
      public void InitCommandsList()
      {
                   
          super.commands.put("stool", this.getName()+" goes to stool");
          super.commands.put("eat", this.getName()+" goes to eat");
          super.commands.put("sleep", this.getName()+" goes to sleep");
          super.commands.put("sound", this.getName()+" says Myau-myau!");


      }  

      @Override
      public void TeachCommand(String commandName, String expectedAction)
      {
        super.commands.put(commandName, this.getName()+expectedAction);

      }
    
}
