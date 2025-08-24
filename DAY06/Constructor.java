package DAY06;

class human {
    private  int age;         
    private String Name;   

     public human(){  // DAY06.Constructor have same class name without any return type ...
        System.out.println("In DAY06.Constructor");   // DAY06.Constructor will be called first..
     }


     public int getage(){
         return age;
     }
     public void setage(int a){
         age = a;
     }
     public String getName(){
         return Name;
     }
     public void setName(String Name){
        this.Name = Name;
     }
 }
 
public class Constructor {
    public static void main(String[] args) {
         human obj = new human();      
        // **-- To use that Data We have to acces through Methods --**
            obj.setage(21);;
            obj.setName("Adarsh");
            System.out.println(obj.getName() + ":"+ obj.getage());   // Like using our Mouth,Hand we can get our Mind data like here we can get it by DAY03.methods..
        
    }
    /*
      A DAY06.Constructor is a block of codes similar to the method.
      It is called when an instance of the class is created,
       At the time of calling the constructor, memory for the object is allocated in the memory.
        It is a special type of method that is used to initialize the object. Every time an object is created using the new() keyword, at least one constructor is called.

        NOTE--
        It is not necessary to write a constructor for a class. It is because the java compiler creates a default constructor (constructor with no arguments) if your class doesn’t have any. 
     */

}
