package DAY02;

public class TypeConv {
    public static void main(String[] args){

     byte b = 127;
     int a = 12;

  //   b=a; we can't convert int into byte directly
   
    b=(byte)a; // we have to use type conversion to convert it.
    
    /* suppose int a = 257 and byte b=127 then what will be the answer when we will
     convert int into byte as byte has the total limits of 256 
    
    b=(byte)a;   it will use modulo (%) ,  for ex -  a is 257 and total limit of byte is 256 so
                             257 % total limit (256) = 1
                 so output will be 1.            

     */

    byte a1 = 10;
    byte b1 = 30;

    int result = a1 * b1 ;  // Here comes the terms of Type Promotion ....


     System.out.println(result);
    
    }
}
