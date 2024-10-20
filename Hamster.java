//import java.util.ArrayList;

public class Hamster extends PetAnimal 
{
   public Hamster(String name, int age){
    super(name, age);
    this.InitCommandsList();
   }

   @Override
      public String ShowSpecie(){
          return "Hamster";
      }

 
  @Override
      public String makeCommand(String commandName){
        
      
        if ( super.commands.containsKey(commandName))
        {
          return super.commands.get(commandName);
        }

        return this.getName()+"unknown command, learn hamster to do this";
      }
    

      @Override
      public void InitCommandsList(){
         
          super.commands.put("stool", this.getName()+" goes to stool");
          super.commands.put("eat", this.getName()+" goes to eat");
          super.commands.put("dance", this.getName()+" goes dancing on hind legs");
          super.commands.put("sound", this.getName()+" says squick-squick!");
          super.commands.put("roll", this.getName()+" goes rolling in the wheel");
        

          

      }  

      @Override
      public void TeachCommand(String commandName, String expectedAction)
      {
        super.commands.put(commandName, this.getName()+expectedAction);

      }
     


}
