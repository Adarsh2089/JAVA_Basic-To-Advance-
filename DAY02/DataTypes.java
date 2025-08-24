package DAY02;

public class DataTypes{
    public static void main (String a[]){

        Byte num1=127; // Range = -128 to 127 (2 byte)
        short num2= 128;  // (4 byte)
        int num3 = 1000;  // (8 byte)
        long num4=1200000; // (16 byte)

         
        double db = 23.4f;  // By default it takes double that's why we have to write f with floating point.
        float fl = 23.45f;  // By default it takes double that's why we have to write f with floating point.
        
        
        char ch = 'a'; // must be in single quotes.


        String name = "Adarsh"; // must be in double quotes. 


        Boolean bool = true; // values in true or false only 


        System.out.println(bool);
   
    }
}

/*
                                         DAY02.DataTypes
                                             |
                        --------------------------------------------  
                        |                                          |
               Primitive Datatypes                      Non-Primitive DAY02.DataTypes
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
