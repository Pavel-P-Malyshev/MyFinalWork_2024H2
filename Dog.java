//import java.util.ArrayList;

public class Dog extends PetAnimal 
{
   public Dog(String name, int age){
    super(name, age);
    this.InitCommandsList();
   }

   @Override
      public String ShowSpecie(){
          return "Dog";
      }

  @Override
      public String makeCommand(String commandName)
      {
        
        if ( super.commands.containsKey(commandName))
        {
          return super.commands.get(commandName);
        }

        return this.getName()+"unknown command, learn Dog to do this";
      }
    
      @Override
      public void InitCommandsList(){
         
          super.commands.put("stool", this.getName()+" goes to stool");
          super.commands.put("eat", this.getName()+" goes to eat");
          super.commands.put("sleep", this.getName()+" goes to sleep");
          super.commands.put("sound", this.getName()+" says bark-bark!");
          super.commands.put("sit", this.getName()+" is sitting down");
          super.commands.put("lay", this.getName()+" is laying down");
          super.commands.put("bring", this.getName()+" goes to bring a toy");
          super.commands.put("get", this.getName()+" goes to attack");

      }  

      @Override
      public void TeachCommand(String commandName, String expectedAction)
      {
        super.commands.put(commandName, this.getName()+" "+expectedAction);
      }
     


}
