class Student{
    private int roll;
    private String name;

    public Student() {   // Default Constructor
      System.out.println("I am in default constructor");
    }
    public Student(int roll, String name) { // PArarmeterized Constructor
        this.roll = roll;
        this.name = name;
    }
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}

public class Parameterized {
    public static void main(String[] args) {
        Student obj = new Student(1,"Adarsh"); // To pass default value while Creating object we need to create a Parameterized Constructors..
        Student obj1 = new Student(2,"Avnish");
    //    obj.setRoll(2);
    //    obj.setName("Kumar");
      //  System.out.println(obj.getRoll()+":"+obj.getName());
        //System.out.println(obj1.getRoll()+":"+obj1.getName());
    }
}
