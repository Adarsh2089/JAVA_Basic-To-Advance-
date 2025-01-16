public class Strings {

    public static void main(String[] args) {
       
        String name1 = new String("JAVA Basic To Advance");   // String is also a class so we can define it by creating object
        String name = "Adarsh";            //    or directly through this method (it automatic creates an Object).
      
      
        name.charAt(1); // As it's a class so we can use thier properties..
        name.substring(0,4); // give output between these
        name.length(); // give length of the string
        name.concat("Kumar"); // Add to the String 
        
        System.out.println( name.concat(" Kumar"));
    }
    
}