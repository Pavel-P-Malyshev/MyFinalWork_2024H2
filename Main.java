import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = 0;
        String s ="";
        String s_name="";
        HashMap<String , Animal> animals = new HashMap<>();
       

 
        while (!"6".equals(s))
        {
            System.out.println("1. Add new animal");
            System.out.println("2. Print commands list an individial animal can deliver");
            System.out.println("3. Give a command to animal");
            System.out.println("4. Teach animal new command");
            System.out.println("5. Show all animals");
            System.out.println("6. Exit");
            s = scan.next();
                        
            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e){
                System.out.println("Wrong input");
            }
            
            switch (x){
                case 1:
                    // вызов метода 1
                    System.out.println("Enter specie name (cat, dog, hamster, horse): ");
                    s_name=scan.next();
                    
                    if(s_name.equals("cat")||
                       s_name.equals("Cat")||
                       s_name.equals("cats")||
                       s_name.equals("Cats")) { 
                        
                        String name=null;
                        String age=null;
                        Counter counter= new Counter();

                        System.out.println("Enter cat's name: ");
                        name=scan.next();
                        System.out.println("Enter cat's age: ");
                        age=scan.next();

                        try(counter)
                        {
                           if(name!=null && age!=null  ){
                              counter.add();
                           }
                            PetAnimal cat=new Cat(name, Integer.parseInt(age));
                            animals.put(name, (Cat) cat);
                            System.out.println("cat "+"'"+ cat.getName()+"'"+" added to the nursery");
                            System.out.println("\n");
                        
                        } catch (Exception e)
                            {
                                e.printStackTrace();
                            }
                                          
                        
                    }
                    
                    else if(s_name.equals("dog")||
                       s_name.equals("Dog")||
                       s_name.equals("dogs")||
                       s_name.equals("Dogs")) 
                       {    

                        Counter counter= new Counter();
                        String name=null;
                        String age=null;


                        System.out.println("Enter dog's name: ");
                        name=scan.next();
                        System.out.println("Enter dogs's age: ");
                        age=scan.next();

                        try(counter)
                        {
                           if(name!=null && age!=null  ){
                              counter.add();
                           }
                        PetAnimal dog=new Dog(name, Integer.parseInt(age));
                        animals.put(name, (Dog) dog);
                        System.out.println("dog "+"'"+ dog.getName()+"'"+" added to the nursery");
                        System.out.println("\n");
                        
                        } catch (Exception e)
                            {
                            e.printStackTrace();
                            }
                    }

                    else if(s_name.equals("hamster")||
                       s_name.equals("hamster")||
                       s_name.equals("hamsters")||
                       s_name.equals("Hamsters")) 
                       {    

                        Counter counter= new Counter();
                        String name=null;
                        String age=null;

                        System.out.println("Enter hamsters's name: ");
                        name=scan.next();
                        System.out.println("Enter hamster's age: ");
                        age=scan.next();
                        
                        try(counter)
                        {
                           if(name!=null && age!=null  ){
                              counter.add();
                           }

                        PetAnimal hamster=new Hamster(name, Integer.parseInt(age));
                        animals.put(name, (Hamster) hamster);
                        System.out.println("hamster "+"'"+ hamster.getName()+"'"+" added to the nursery");
                        System.out.println("\n");

                        } catch (Exception e)
                            {
                                e.printStackTrace();
                            }

                    }

                    else if(s_name.equals("horse")||
                       s_name.equals("Horse")||
                       s_name.equals("horses")||
                       s_name.equals("Horses")) 
                       {    

                        Counter counter= new Counter();
                        String name=null;
                        String age=null;

                        System.out.println("Enter horse's name: ");
                         name=scan.next();
                        System.out.println("Enter horse's age: ");
                         age=scan.next();
                         try(counter)
                         {
                            if(name!=null && age!=null  ){
                               counter.add();
                            }

                            PackAnimal horse=new Horses(name, Integer.parseInt(age));
                            animals.put(name, (Horses) horse);
                            System.out.println("horse "+"'"+ horse.getName()+"'"+" added to the nursery");
                            System.out.println("\n");
                            
                          } catch (Exception e)
                            {
                               e.printStackTrace();
                            }


                    }





                    else{
                        System.out.println("sname is "+s_name);
                        System.out.println("Such animal specie is not acceptabe.");
                        System.out.println("\n");
                    }
                break;

                case 2:
                    // вызов метода 2
                    System.out.println("Enter animal's name: ");
                    String aname=scan.next();

                    if(animals.isEmpty())  System.err.println("Nursery is empty\n");



                    for (var entry: animals.entrySet()) 
                    {
                       if (entry.getValue().getName().equals(aname))
                       {
                           System.out.println(entry.getValue().getName()+" is trained for the following commands: ");
                           entry.getValue().ShowAllCommands();
                           System.out.println("\n");

                       }
                       else {
                        System.err.println("No such animal in the nursery");
                        System.out.println("\n");
                        break;
                       }
                    }

            
                break;

                case 3:
                    // вызов метода 3
                    System.out.println("Enter animal's name: ");
                    String bname=scan.next();
                    
                    if(animals.isEmpty())  System.err.println("Nursery is empty\n");


                    for (var entry: animals.entrySet()) 
                    {
                       if (entry.getValue().getName().equals(bname))
                       {
                        System.out.println("Enter command you want animal to do: ");
                        String commands=scan.next();
                         System.out.println(entry.getValue().makeCommand(commands));
                         System.out.println("\n");
                       }
                       else {
                        System.err.println("No such animal in the nursery");
                        System.out.println("\n");
                        break;
                       }
                    }

                break;

                case 4:
                    // вызов метода 3
                    System.out.println("Enter animal's name: ");
                    String cname=scan.next();
                    if(animals.isEmpty())  System.err.println("Nursery is empty\n");

                    for (var entry: animals.entrySet()) 
                    {
                       if (entry.getValue().getName().equals(cname))
                       {
                        System.out.println("Enter new command you want animal to do: ");
                        String _commands=scan.next();
                        System.out.println("Enter expected actions: ");
                        String actions=scan.next();

                        entry.getValue().TeachCommand(_commands,actions);
                        System.out.println(entry.getValue().getName()+" now knows new command '"+_commands+"' !");
                         System.out.println("\n");
                         //break;
                       }
                       else {
                        System.err.println("No such animal in the nursery");
                        System.out.println("\n");
                        break;
                       }
                    }

                break;


                case 5:
                    
                    if(animals.isEmpty())  System.err.println("Nursery is empty\n");

                    for (var entry: animals.entrySet()) 
                    {
                       System.out.println(entry.getKey()+ " - "+ entry.getValue().ShowSpecie()+"\n");
                        
                    }

                break;


               
                    
            }
        }

        System.out.println("Bye!");
        scan.close();
        
    }
    
}
