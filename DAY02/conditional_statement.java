package DAY02;

public class conditional_statement {


    public static void main(String[] args){

      int a = 20;
      int b=10;
      int c=4;

 /*   // if statement
      if (a>b) {
      //  System.out.println("true");
      }

      if (a>b && a>c) {
        System.out.println("true");
      }else {
          System.out.println("false");
      }
*/
    // Nested if
    if (a>b) {
         // System.out.println(a);
          if (a>c) {
            System.out.println("true");
          }else{
              System.out.println("Smaller than c");
          }
      }else {
        System.out.println("Smaller than b");
    }
    

   // if else if ladder ---   
      if (a>b) {
        System.out.println(a+" is greater than "+b);
      }else if (b>a) {
        System.out.println(b+" is greater than "+a);
      }else{
        System.out.println("Both "+ a + " and " + b + " are equal");
      }

/*
   // switch case ---  
   int num=20;
   switch(num){
   case 5 :  System.out.println("It is 5");
             break;
   case 10 : System.out.println("It is 10");
             break;
   case 15 : System.out.println("It is 15");
             break;
   case 20 : System.out.println("It is 20");
             break;
   default:  System.out.println("Not present");
       
   }

   */ }
}
