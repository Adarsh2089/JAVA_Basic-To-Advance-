class HUMAN {
   private  int age;         // Encapsulation is like bound the data so data no any other can access it...
    private String Name;     // Our mind Data is like Encapsulated no any other can access it ... 
    
    public int Getage(){
        return age;
    }
    public void Setage(int a){
        age = a;
    }
    public String GetName(){
        return Name;
    }
    public void SetName(String name){
        Name = name;
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        HUMAN obj = new HUMAN();
      //  obj.age="21"; // As it is encapsulated so we can't access 
      //  obj.Name="Adarsh"; // From any where ...

      // **-- To use that Data We have to acces through Methods --**
          obj.Setage(21);
          obj.SetName("Adarsh");
          System.out.println(obj.GetName() + ":"+ obj.Getage());   // Like using our Mouth,Hand we can get our Mind data like here we can get it by methods..
      
    }
}