package DAY02;

import java.util.Scanner;

public class DataTypes{
    public static void main (String a[]){


        Byte num1=127; // Range = -128 to 127 (2 byte)
        short num2= 32766;  // (4 byte)
        int num3 = 32768;  // (8 byte)
        long num4=1200000; // (16 byte)

         
        double db = 23.457354727676479f;  // By default it takes double that's why we have to write f with floating point.
        float fl = 23.45364576574f;  // By default it takes double that's why we have to write f with floating point.
        
        
        char ch = 'a'; // must be in single quotes.


        String name = "Adarsh"; // must be in double quotes. 


        Boolean bool = true; // values in true or false only 


      //  System.out.println(bool);

   //     System.out.println(db);

        Scanner sc = new Scanner(System.in);

       System.out.print("Enter any Number - ");

       int i = sc.nextInt();

        System.out.println(i);
   
    }
}

/*
                                         DAY02.DataTypes
                                             |
                        --------------------------------------------  
                        |                                          |
               Primitive Datatypes                      Non-Primitive DataTypes
                        |                                                |
            --------------------------------------                ---------------------------------------
            |            |             |         |                |            |            |           |
         Integer       Float       character   Boolean         String        class        object    interface
          |             |            |          |
          |- Byte       |-double     |- char    |- boolean
          |- short      |-float
          |- int         
          |- long






 */
