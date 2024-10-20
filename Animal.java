
public abstract class Animal 
{
   private String name;
   private int age;

   public Animal(String name, int age){
    this.name=name;
    this.age=age;
   }

   public abstract String makeCommand(String commandName);
   public abstract void TeachCommand(String commandName, String expectedAction);
   public abstract void ShowAllCommands();
   public abstract String ShowSpecie();
  
   
    public String getName()
    {
    return name;
    }

    public  int getAge()
    {
    return age;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }
    
}