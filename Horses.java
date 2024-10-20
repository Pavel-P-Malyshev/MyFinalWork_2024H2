public class Horses extends PackAnimal {

    public Horses(String name, int age){
        super(name, age);
        this.InitCommandsList();
       }

       @Override
      public String ShowSpecie(){
          return "Horse";
      }
    
     
      @Override
          public String makeCommand(String commandName){
            
          
            if ( super.commands.containsKey(commandName))
            {
              return super.commands.get(commandName);
            }
    
            return this.getName()+"unknown command, learn horse to do this";
          }
        
    
          @Override
          public void InitCommandsList(){
             
              super.commands.put("run", this.getName()+" goes galloping");
              super.commands.put("stop", this.getName()+" is breaking to stop");
              super.commands.put("jump", this.getName()+" goes to jump over an obstacle");
              super.commands.put("trot", this.getName()+" goes trotting!");             
                         
    
          }  
    
          @Override
          public void TeachCommand(String commandName, String expectedAction)
          {
            super.commands.put(commandName, this.getName()+expectedAction);
    
          }
         
    
}
