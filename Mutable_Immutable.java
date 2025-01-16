public class Mutable_Immutable {
    public static void main(String[] args) {
        
         String name = "Adarsh";
         name = name + "kumar";

         System.out.println(name);

         String s1 = "adarsh";
         String s2 = "adarsh";   // at behind the scene we are not creating two or three objects for the same name 
                                            // it is references we are getting 
         System.out.println(s1==s2); 
         
         
         String s = "Adarsh";
    
         // concat() method appends
         // the string at the end
         s.concat(" kumar");
     
         // This will print Sachin
         // because strings are
         // immutable objects
         System.out.println(s);
    }                                       
}
                                                  

/*
Mutable -> Can be change (By using - String Buffer and String Builder)
Immutable -> Can't be change (By Default)

                                                          
                                  _______________________________________________________
                                 |                                                       |
                                 |         _____________                                 |
                                 |    105  |  Adarsh   |    // String Constant Pool      |
                                 |         |___________|                                 |
                                 |   1001  |  adarsh   |                                 |
                                 |         |___________|                                 | 
                                 |   1003  |  Adarsh   |                                 |
                                 |         |___kumar___| <--- Creating new object for    |
|           |                    |             1001          name = name+"kumar"         |
|           |                    |                                                       |
|___________|                    |_______________________________________________________|
| s2 = 1001 |                                         Heap memory
|___________|<---- here it is not creating a new object for same name just taking refernce of it...                                          
| s1 = 1001 |              
|___________|             |------>  when we are doing name = name + "Kumar" it is creating new object 
| name = 105|<------------|             and then changing the address of name ...     
|___________|
    main


*/
