package DAY03;

public class methods {
    public static void main (String[] args){
       
        int n=11;
      
    //    DAY03.methods.item(n); // here we can't call this method directly cause main is static so it can only call static DAY03.methods directly.

     // so we have to make item method as static to call directly from any class not this only or we have to create and object of this class.

     methods met = new methods();  // like this
     String result =  met.item(n);

     System.out.println(result);


    }

    public String item(int n){
        if (n>10) {
            return "pen aayega itne me";
        }else{
            return "Kuch nhi aayega bhai";
        }
    }

 //            This will change only
 //                     |
    public String item(byte n){
        if (n>10) {
            return "pen aayega itne me";
        }else{
            return "Kuch nhi aayega bhai";
        }
    }



}

/* 
 
  ** Methods architecher---

 Access Type    Return Type   Method Name    Some Arguments
     |              |             |               |
  public          void          method        (      ){
 
      // DAY03.methods properties...
 
 }


  ** Methods Overloading---

    the term is that we can give a same name to two DAY03.methods but the arguments DataType of both the DAY03.methods will be different..




 */
