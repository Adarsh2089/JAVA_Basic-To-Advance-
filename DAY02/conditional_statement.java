package DAY02;

public class conditional_statement {
    public static void main(String[] args){

      int a = 12;
      int b=12;

    // if statement 
      if (a>b) {
        System.out.println(a);
      }

    // Nested if 
    if (a>b) {
        System.out.println(a);
        if (b>a) {
            System.out.println(b);
        }
      }
    

   // if else if ladder ---   
      if (a>b) {
        System.out.println(a+" is greater than "+b);
      }else if (b>a) {
        System.out.println(b+" is greater than "+a);
      }else{
        System.out.println("Both "+ a + " and " + b + " are equal");
      }


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

    } 
}
