package DAY06;

class Human {
    private  int age;         
    private String Name;    

     public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;    // this keyword is used to tells that this is the refrence Object...
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;  // Instead of this we can use two variable but not a good idea...
    }
     
    
 }

public class Gett_Sett {
    public static void main(String[] args) {
        Human obj = new Human();
        //  obj.age="21"; // As it is encapsulated so we can't access 
        //  obj.Name="Adarsh"; // From any where ...
  
        // **-- To use that Data We have to acces through Methods --**
            obj.setAge(21);;
            obj.setName("Adarsh");
            System.out.println(obj.getName() + ":"+ obj.getAge());   // Like using our Mouth,Hand we can get our Mind data like here we can get it by DAY03.methods..
        
    }
}
