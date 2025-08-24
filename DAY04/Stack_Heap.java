package DAY04;

class Addition{

       int num=20;  // Instance Variable
//   static int num=20;  // static Variable


    public int add(int n1,int n2){
        int r = n1+n2;
        return r;
    }


}



public class Stack_Heap {

    public static void main(String[] args){

        int num1=5;
        int num2=10;

        Addition obj = new Addition();
        Addition obj1 = new Addition();   // if we create another object of same class

        obj.num=1; // and change the instance variable value in a object ,it can't change both object ..
                   // but if it is static variable it will change the value in both objects..

        int r1 = obj.add(num1, num2);

        System.out.println(r1);
        System.out.println(obj1.num);
        System.out.println(obj.num);


    }

}

/* 
 
  Every Method has it's own stack memory where it manages DAY01.variables and their data like ...


     |           |
     |           |                                                            
     |           |                     _______________________________________________________
     |___________|                    |                                                       |
     |  n2 = 10  |                    |         _____________                                 |
     |___________|                    |         |  num = 20 |    // When Objects Created it   |
     |  n1 = 5   |                    |         |___________|     stores memory in Heap..     |
     |___________|                    |         |           |                                 |
         add                          |         |   add()   | <-- All DAY03.methods of that class   |
                                      |         |           |      will appear here           |
                                      |         |___________|                                 |
     |           |                    |             1001                                      |
     | obj= 1001 | <- here Object     |                                                       |
     |___________|    Variable holds  |_______________________________________________________|
     |  r1 = 15  |    object address                        Heap memory
     |___________|                                          
     | num1 = 10 |
     |___________|
     | num1 = 5  |
     |___________|
         main
    
    















*/


