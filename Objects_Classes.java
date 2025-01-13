
 class multiplier {

    public int multi(int n1,int n2){
        int r=n1*n2;
        return r;
    }
    
}

// ** Object Oriented Programming 

// Objects -  Have some Properties and Some Behaviour.
// Classes -  A Blueprint Of Object Like a Blue Print of CAR is Class and CAR is an Object.




public class Objects_Classes {
    public static void main (String [] args){
        
        int num1=4;
        int num2=5;

        calculator       calc      =      new         calculator(); // we can create object of any class either it is in same class or another package .
 //         |              |               |               |
  //   like datatype  variable name    new storage  Object of this Blueprint
      
      
        multiplier mul =  new multiplier(); // like this class is inside this one file .


        int res1 = calc.add(num1,num2);

        int res2=mul.multi(num1, num2);

        System.out.println(res1);
        System.out.println(res2);

    }
}
